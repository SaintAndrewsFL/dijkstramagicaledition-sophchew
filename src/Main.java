import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HogwartsGraph graph = new HogwartsGraph();
//        PriorityQueue<Location> pq = new PriorityQueue<>(new LocationComparator());
//        Location locationA = new Location("Location A",null,5);
//        Location locationB = new Location("Location B",null,3);
//
//        pq.add(locationB);
//        pq.add(locationA);
//
//        System.out.println(pq.remove().getName());
//        System.out.println(pq.remove().getName());

        Dijkstra algo = new Dijkstra(graph);
        System.out.println(HogwartsGraph.getLocationDescription("Gryffindor Tower"));
        System.out.println(algo.findShortestPath("Astronomy Tower", "Dungeons"));
    }
}
