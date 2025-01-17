import java.util.Comparator;

public class LocationComparator implements Comparator<Location> {


    @Override
    public int compare(Location o1, Location o2) {
        return Integer.compare(o1.getDistanceTo(),o2.getDistanceTo());
    }
}
