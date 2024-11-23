package com.muhammet.entity;

public class FR implements Language{
    @Override
    public String getWelcome() {
        return "Bienvenue sur notre site";
    }

    @Override
    public String getHome() {
        return "Page d'accueil";
    }

    @Override
    public String getAbout() {
        return "A propos de nous";
    }

    @Override
    public String getContact() {
        return "Communication";
    }
}
