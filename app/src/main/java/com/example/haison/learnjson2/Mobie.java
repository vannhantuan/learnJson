package com.example.haison.learnjson2;

public class Mobie {
    private String name;
    private String operatingSystem;
    private String screenSize;
    private String companyName;
    private String rom;
    private String backCamera;
    private String url;

    public Mobie() {

    }

    public Mobie(String name, String operatingSystem, String screenSize,  String companyName, String rom, String backCamera, String url) {
        this.name = name;
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
        this.companyName = companyName;
        this.rom = rom;
        this.backCamera = backCamera;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getBackCamera() {
        return backCamera;
    }

    public void setBackCamera(String backCamera) {
        this.backCamera = backCamera;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
