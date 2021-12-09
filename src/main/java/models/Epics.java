package models;

import java.util.List;

public class Epics {
    private String name;
    private String description;
    private int sizes;
    private int startDateOffset;
    private List<String> releases;

    public Epics(String name, String description, int sizes, int startDateOffset, List<String> releases) {
        this.name = name;
        this.description = description;
        this.sizes = sizes;
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
        return sizes;
    }

    public int getStartDateOffset() {
        return startDateOffset;
    }

    public List<String> getReleases() {
        return releases;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setsSizes(int sSizes) {
        this.sizes = sSizes;
    }

    public void setStartDateOffset(int startDateOffset) {
        this.startDateOffset = startDateOffset;
    }

    public void setReleases(List<String> releases) {
        this.releases = releases;
    }

    @Override
    public String toString() {
        return "Epics{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sSizes=" + sizes +
                ", startDateOffset=" + startDateOffset +
                ", releases=" + releases +
                '}';
    }
}
