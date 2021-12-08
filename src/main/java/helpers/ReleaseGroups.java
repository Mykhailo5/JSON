package helpers;

import java.util.List;

public class ReleaseGroups {
    public String name;
    public List<Releases> releases;

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

    @Override
    public String toString() {
        return "ReleaseGroups{" +
                "name='" + name + '\'' +
                ", releases=" + releases +
                '}';
    }
}
