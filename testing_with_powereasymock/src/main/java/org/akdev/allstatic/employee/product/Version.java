package org.akdev.allstatic.employee.product;

public class Version {

    private String versionNumber;
    private String releaseDate;

    public Version(String versionNumber, String releaseDate) {
        this.versionNumber = versionNumber;
        this.releaseDate = releaseDate;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
