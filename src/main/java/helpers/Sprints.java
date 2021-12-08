package helpers;

public class Sprints {
    public String name;
    public String length;
    public String startDateOffset;

    public Sprints(String name, String length, String startDateOffset) {
        this.name = name;
        this.length = length;
        this.startDateOffset = startDateOffset;
    }

    public String getName() {
        return name;
    }

    public String getLength() {
        return length;
    }

    public String getStartDateOffset() {
        return startDateOffset;
    }

    @Override
    public String toString() {
        return "Sprints{" +
                "name='" + name + '\'' +
                ", length='" + length + '\'' +
                ", startDateOffset='" + startDateOffset + '\'' +
                '}';
    }
}
