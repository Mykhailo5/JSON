package helpers;

public class ReportFiles {
    public String fileLocation;
    public int startDateOffset;

    public ReportFiles(String fileLocation, int startDateOffset) {
        this.fileLocation = fileLocation;
        this.startDateOffset = startDateOffset;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public int getStartDateOffset() {
        return startDateOffset;
    }

    @Override
    public String toString() {
        return "ReportFiles{" +
                "fileLocation='" + fileLocation + '\'' +
                ", startDateOffset=" + startDateOffset +
                '}';
    }
}
