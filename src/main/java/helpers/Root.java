package helpers;

import java.util.List;

public class Root {
    public List<ReleaseGroups> releaseGroups;
    public List<Projects> projects;

    public void setReleaseGroups(List<ReleaseGroups> releaseGroups) {
        this.releaseGroups = releaseGroups;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Root{" +
                "releaseGroups=" + releaseGroups +
                ", projects=" + projects +
                '}';
    }
}
