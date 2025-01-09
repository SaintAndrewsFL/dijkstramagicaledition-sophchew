import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Graph {
    private final Map<String, Map<String, Integer>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(String vertex) {
        adjacencyList.putIfAbsent(vertex, new HashMap<>());
    }

    public void addEdge(String source, String destination, int weight) {
        adjacencyList.get(source).put(destination, weight);
        adjacencyList.get(destination).put(source, weight);
    }

    public Set<String> getVertices() {
        return adjacencyList.keySet();
    }

    public Map<String, Integer> getNeighbors(String vertex) {
        return adjacencyList.getOrDefault(vertex, new HashMap<>());
    }

    public boolean hasVertex(String vertex) {
        return adjacencyList.containsKey(vertex);
    }
}
