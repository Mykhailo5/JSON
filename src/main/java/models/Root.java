package models;

import java.util.List;

public class Root {
    private List<ReleaseGroups> releaseGroups;
    private List<Projects> projects;

    public List<ReleaseGroups> getReleaseGroups() {
        return releaseGroups;
    }

    public List<Projects> getProjects() {
        return projects;
    }

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
