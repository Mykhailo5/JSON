package models;

public class ReportFiles {
    private String fileLocation;
    private int startDateOffset;

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

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public void setStartDateOffset(int startDateOffset) {
        this.startDateOffset = startDateOffset;
    }

    @Override
    public String toString() {
        return "ReportFiles{" +
                "fileLocation='" + fileLocation + '\'' +
                ", startDateOffset=" + startDateOffset +
                '}';
    }
}
