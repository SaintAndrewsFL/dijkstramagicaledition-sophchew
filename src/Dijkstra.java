import java.util.*;

public class Dijkstra {
    private final Graph graph;
    private HashMap<String,Location> secondaryHashmap;
    private PriorityQueue<Location> locationQueue;
    private boolean isDestinationReached;

    public Dijkstra(Graph graph) {
        this.graph = graph;
    }

    /**
     * Implements Dijkstra's algorithm to find the shortest path between two vertices.
     * @param start The starting vertex
     * @param target The destination vertex
     * @return A string in the format "Path (distance): vertex1 -> vertex2 -> ... -> vertexN"
     *         Returns "No path exists between start and target" if no path is found
     *         Returns "Invalid vertex" if either vertex is not in the graph
     */
    public String findShortestPath(String start, String target) {
        // TODO: Implement Dijkstra's algorithm here
        if(!graph.hasVertex(start) || !graph.hasVertex(target)) {
            return "Invalid vertex.";
        } // check if vertex exists


        LocationComparator comp = new LocationComparator();
        locationQueue = new PriorityQueue<>(comp);
        secondaryHashmap = new HashMap<>();

        for(String vertex: graph.getVertices()) {
            secondaryHashmap.put(vertex, new Location(vertex,""));
        }

        Location currentLocation = secondaryHashmap.get(start);
        currentLocation.setDistanceTo(0);

        while(!isDestinationReached) {
            Map<String, Integer> neighbors = graph.getNeighbors(currentLocation.getName());
            for(String neighbor: neighbors.keySet()) {
                Location neighborNode = secondaryHashmap.get(neighbor);
                int distance = neighbors.get(neighbor) + currentLocation.getDistanceTo();
                if(!neighborNode.isInPriorityQueue() && !neighborNode.isDoneWith()){
                    neighborNode.setDistanceTo(distance);
                    neighborNode.setInPriorityQueue(true);
                    neighborNode.setPrevLocation(currentLocation.getName());
                    locationQueue.add(neighborNode);
                } else if (neighborNode.isInPriorityQueue()) {
                    if(neighborNode.getDistanceTo() > distance) { // if current > new
                        neighborNode.setDistanceTo(distance);
                        neighborNode.setPrevLocation(currentLocation.getName());
                        locationQueue.remove(neighborNode);
                        locationQueue.add(neighborNode);

                    }
                }
            }

            currentLocation.setDoneWith(true);
            currentLocation = locationQueue.remove();
            currentLocation.setInPriorityQueue(false);

            if(currentLocation.getName().equals(target)) {
                String path = "Path " + currentLocation.getDistanceTo() + ": ";
                String loc = currentLocation.getName();
                Stack<String> stack = new Stack<>();
                while(!isDestinationReached) {
                    stack.push(loc);
                    if(!secondaryHashmap.get(loc).getPrevLocation().equals(start)) {
                        loc = secondaryHashmap.get(loc).getPrevLocation();
                    } else {
                        isDestinationReached = true;
                        stack.push(start);
                    }

                }
                while(!stack.isEmpty()) {
                    path += stack.pop() + " -> ";

                }
                return path.substring(0, path.lastIndexOf(" ->"));
            }

            if(locationQueue.isEmpty()){
                return "No path exists between start and target";
            }


        }



        // get neighbors of current vertex, check if in queue, add each to priority queue with added distance




        //






        // The graph provides the following methods you can use:
        // graph.getVertices() - returns Set<String> of all vertices
        // graph.getNeighbors(vertex) - returns Map<String, Integer> of neighbor vertices and their weights
        // graph.hasVertex(vertex) - returns boolean indicating if vertex exists




        return "";
    }
}
