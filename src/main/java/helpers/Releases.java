package helpers;

import java.util.List;

public class Releases {
    public String name;
    public String length;
    public String startDateOffset;
    public List<Sprints> sprints;

    public Releases(String name, String length, String startDateOffset, List<Sprints> sprints) {
        this.name = name;
        this.length = length;
        this.startDateOffset = startDateOffset;
        this.sprints = sprints;
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

    public List<Sprints> getSprints() {
        return sprints;
    }

    @Override
    public String toString() {
        return "Releases{" +
                "name='" + name + '\'' +
                ", length='" + length + '\'' +
                ", startDateOffset='" + startDateOffset + '\'' +
                ", sprints=" + sprints +
                '}';
    }
}
