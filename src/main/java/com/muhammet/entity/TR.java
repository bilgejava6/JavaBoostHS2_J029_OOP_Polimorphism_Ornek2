package com.muhammet.entity;

public class TR implements Language {
    public String getWelcome() {
        return "Sitemize Hoşgeldiniz";
    }

    public String getHome() {
        return "Ana Sayfa";
    }

    public String getAbout() {
        return "Hakkımızda";
    }

    public String getContact() {
        return "İletişim";
    }
}
