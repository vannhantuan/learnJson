package com.example.haison.learnjson2;

public class MobieDetail {
    String name;
    String companyName;
    String rom;
    String backCamera;
    String screenSize;

    MobieDetail() {

    }

    public MobieDetail(String name, String companyName, String rom, String backCamera, String screenSize) {
        this.name = name;
        this.companyName = companyName;
        this.rom = rom;
        this.backCamera = backCamera;
        this.screenSize = screenSize;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
