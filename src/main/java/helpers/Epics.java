package helpers;

import java.util.List;

public class Epics {
    public String name;
    public String description;
    public int sSizes;
    public int startDateOffset;
    public List<String> releases;

    public Epics(String name, String description, int sSizes, int startDateOffset, List<String> releases) {
        this.name = name;
        this.description = description;
        this.sSizes = sSizes;
        this.startDateOffset = startDateOffset;
        this.releases = releases;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getsSizes() {
        return sSizes;
    }

    public int getStartDateOffset() {
        return startDateOffset;
    }

    public List<String> getReleases() {
        return releases;
    }

    @Override
    public String toString() {
        return "Epics{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sSizes=" + sSizes +
                ", startDateOffset=" + startDateOffset +
                ", releases=" + releases +
                '}';
    }
}
