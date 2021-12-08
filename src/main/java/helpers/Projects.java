package helpers;

import java.util.List;

public class Projects {
    public String name;
    public String releaseGroup;
    public List<ReportFiles> reportFiles;
    public List<ChildProjects> childProjects;
    public List<RootCauses> rootCauses;
    public List<Epics> epics;

    public Projects(String name, String releaseGroup, List<ReportFiles> reportFiles, List<ChildProjects> childProjects, List<RootCauses> rootCauses, List<Epics> epics) {
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

    public List<ChildProjects> getChildProjects() {
        return childProjects;
    }

    public List<RootCauses> getRootCauses() {
        return rootCauses;
    }

    public List<Epics> getEpics() {
        return epics;
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
