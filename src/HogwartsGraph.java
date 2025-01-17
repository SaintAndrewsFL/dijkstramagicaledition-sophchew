import java.util.HashMap;

public class HogwartsGraph extends Graph {

    private static HashMap<String, String> locationDescs = new HashMap<>();
    public HogwartsGraph() {
        initializeLocations();

    }

    private void initializeLocations() {
        // Add all vertices (locations)
        addVertex("Astronomy Tower");
        addVertex("Gryffindor Tower");
        addVertex("Great Hall");
        addVertex("Library");
        addVertex("Hospital Wing");
        addVertex("Transfiguration");
        addVertex("Dungeons");
        addVertex("Forbidden Forest");
        addVertex("Quidditch Pitch");
        addVertex("Hagrid's Hut");

        // Add edges with distances (in arbitrary units)
        addEdge("Astronomy Tower", "Library", 7);
        addEdge("Astronomy Tower", "Transfiguration", 6);
        addEdge("Library", "Gryffindor Tower", 6);
        addEdge("Library", "Great Hall", 5);
        addEdge("Library", "Hospital Wing", 4);
        addEdge("Gryffindor Tower", "Hospital Wing", 5);
        addEdge("Hospital Wing", "Transfiguration", 4);
        addEdge("Great Hall", "Transfiguration", 3);
        addEdge("Great Hall", "Dungeons", 4);
        addEdge("Hagrid's Hut", "Great Hall", 10);
        addEdge("Transfiguration", "Quidditch Pitch", 5);
        addEdge("Dungeons", "Forbidden Forest", 12);
        addEdge("Quidditch Pitch", "Forbidden Forest", 7);
        addEdge("Quidditch Pitch", "Hagrid's Hut", 5);
        addEdge("Hagrid's Hut", "Forbidden Forest", 3);

        // Location descriptions:

        locationDescs.put("Astronomy Tower", "The tallest tower at Hogwarts Castle. Students study the planets and the " +
                "stars with their telescopes in Astronomy lessons.");
        locationDescs.put("Gryffindor Tower", "The common room and dormitories for the students of Gryffindor House. " +
                "It is adorned in red and gold tapestries and furnished with many cushy armchairs.");
        locationDescs.put("Great Hall", "A large hall where students and teachers dine and congregate.");
        locationDescs.put("Library", "Located off of a corridor on the first-floor of Hogwarts Castle and " +
                "contains tens of thousands of books on thousands of shelves.");
        locationDescs.put("Hospital Wing", "Students and staff who suffer mishaps and injuries " +
                "during the school year are sent or brought to the Hospital Wing for treatment.");
        locationDescs.put("Transfiguration", "Classroom where students are taught the art of changing the form " +
                "and appearance of an object or a person.");
        locationDescs.put("Dungeons", "Located under the main castle.  It is colder than the rest of the castle, and it " +
                "houses the Potions classroom and the entrance to the Slytherin common room.");
        locationDescs.put("Forbidden Forest", "Also known as the Dark Forest, it is the forest that borders the edges" +
                "of the Hogwarts grounds. It is strictly off limits to students.");
        locationDescs.put("Quidditch Pitch", "Field where Hogwarts Quidditch matches take place.");
        locationDescs.put("Hagrid's Hut", "Home to Rubeus Hagrid, Hogwarts gamekeeper. Located outside of Hogwarts Castle, " +
                "on the edge of the Forbidden Forest.");


    }

    public static String getLocationDescription(String location) {

        return locationDescs.get(location);
    }
}