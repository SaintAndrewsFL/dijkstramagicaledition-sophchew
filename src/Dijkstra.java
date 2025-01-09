public class Dijkstra {
    private final Graph graph;

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
        // The graph provides the following methods you can use:
        // graph.getVertices() - returns Set<String> of all vertices
        // graph.getNeighbors(vertex) - returns Map<String, Integer> of neighbor vertices and their weights
        // graph.hasVertex(vertex) - returns boolean indicating if vertex exists

        return "";
    }
}
