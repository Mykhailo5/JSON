package models;

import java.util.List;

public class Projects {
    private String name;
    private String releaseGroup;
    private List<ReportFiles> reportFiles;
    private List<Projects> childProjects; //Projects instead of ChildProjects
    private List<RootCauses> rootCauses;
    private List<Epics> epics;

    public Projects(String name, String releaseGroup, List<ReportFiles> reportFiles, List<Projects> childProjects, List<RootCauses> rootCauses, List<Epics> epics) {
        this.name = name;
        this.releaseGroup = releaseGroup;
        this.reportFiles = reportFiles;
        this.childProjects = childProjects;
        this.rootCauses = rootCauses;
        this.epics = epics;
    }

    public String getName() {
        return name;
    }

    public String getReleaseGroup() {
        return releaseGroup;
    }

    public List<ReportFiles> getReportFiles() {
        return reportFiles;
    }

    public List<Projects> getChildProjects() {
        return childProjects;
    }

    public List<RootCauses> getRootCauses() {
        return rootCauses;
    }

    public List<Epics> getEpics() {
        return epics;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseGroup(String releaseGroup) {
        this.releaseGroup = releaseGroup;
    }

    public void setReportFiles(List<ReportFiles> reportFiles) {
        this.reportFiles = reportFiles;
    }

    public void setChildProjects(List<Projects> childProjects) {
        this.childProjects = childProjects;
    }

    public void setRootCauses(List<RootCauses> rootCauses) {
        this.rootCauses = rootCauses;
    }

    public void setEpics(List<Epics> epics) {
        this.epics = epics;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "name='" + name + '\'' +
                ", releaseGroup='" + releaseGroup + '\'' +
                ", reportFiles=" + reportFiles +
                ", childProjects=" + childProjects +
                ", rootCauses=" + rootCauses +
                ", epics=" + epics +
                '}';
    }
}
