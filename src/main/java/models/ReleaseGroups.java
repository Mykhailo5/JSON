package models;

import java.util.List;

public class ReleaseGroups {
    private String name;
    private List<Releases> releases;

    public ReleaseGroups(String name, List<Releases> releases) {
        this.name = name;
        this.releases = releases;
    }

    public String getName() {
        return name;
    }

    public List<Releases> getReleases() {
        return releases;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleases(List<Releases> releases) {
        this.releases = releases;
    }

    @Override
    public String toString() {
        return "ReleaseGroups{" +
                "name='" + name + '\'' +
                ", releases=" + releases +
                '}';
    }
}
