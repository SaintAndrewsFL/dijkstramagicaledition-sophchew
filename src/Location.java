public class Location {
    private String name;
    private int distanceTo = -1;
    private boolean isDoneWith = false;
    private boolean inPriorityQueue = false;
    private String prevLocation;
    public Location(String name, String prevLocation) {
        this.name = name;
        this.prevLocation = prevLocation;

    }

    public Location(String name, String prevLocation, int distanceTo) {
        this.name = name;
        this.prevLocation = prevLocation;
        this.distanceTo = distanceTo;
    }

    public String getName() {
        return name;
    }

    public int getDistanceTo() {
        return distanceTo;
    }

    public String getPrevLocation() {
        return prevLocation;
    }

    public boolean isDoneWith() {
        return isDoneWith;
    }
    public boolean isInPriorityQueue() {
        return inPriorityQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistanceTo(int distanceTo) {
        this.distanceTo = distanceTo;
    }

    public void setDoneWith(boolean doneWith) {
        isDoneWith = doneWith;
    }

    public void setInPriorityQueue(boolean inPriorityQueue) {
        this.inPriorityQueue = inPriorityQueue;
    }

    public void setPrevLocation(String prevLocation) {
        this.prevLocation = prevLocation;
    }
}
