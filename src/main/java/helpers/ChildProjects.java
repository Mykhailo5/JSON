package helpers;

import java.util.List;

public class ChildProjects {
    public String name;
    public String releaseGroup;
    public List<ReportFiles> reportFiles;
    public Object childProjects;

    public ChildProjects(String name, String releaseGroup, List<ReportFiles> reportFiles, Object childProjects) {
        this.name = name;
        this.releaseGroup = releaseGroup;
        this.reportFiles = reportFiles;
        this.childProjects = childProjects;
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

    public Object getChildProjects() {
        return childProjects;
    }

    @Override
    public String toString() {
        return "ChildProjects{" +
                "name='" + name + '\'' +
                ", releaseGroup='" + releaseGroup + '\'' +
                ", reportFiles=" + reportFiles +
                ", childProjects=" + childProjects +
                '}';
    }
}
