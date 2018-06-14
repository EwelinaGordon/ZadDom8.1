import java.util.Objects;

public class Trip{
    private String destination;
    private int members;


    public Trip(String destination, int members) {
        this.destination = destination;
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return members == trip.members &&
                Objects.equals(destination, trip.destination);
    }

    @Override
    public int hashCode() {

        return Objects.hash(destination, members);
    }

    @Override
    public String toString() {
        return "Trip{" +
                "destination='" + destination + '\'' +
                ", members=" + members +
                '}';
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }
}