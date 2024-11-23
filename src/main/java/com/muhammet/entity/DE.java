package com.muhammet.entity;

public class DE implements Language{
    @Override
    public String getWelcome() {
        return "Willcommen";
    }

    @Override
    public String getHome() {
        return "Homepage";
    }

    @Override
    public String getAbout() {
        return "Über uns";
    }

    @Override
    public String getContact() {
        return "Kommunikation";
    }
}
