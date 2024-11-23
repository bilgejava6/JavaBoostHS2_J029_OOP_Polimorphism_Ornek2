package com.muhammet;

import com.muhammet.entity.*;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                        Sitemize Hoş Geldiniz - Welcome MySite
                        Lütfen Dil seçiniz - Please Select Language
                        1- TR
                        2- EN
                        3- DE
                        4- FR
                """);
        System.out.print("Select.....: ");
        int language = scanner.nextInt();
        Language selectedLanguage;
        switch (language){
            case 1: selectedLanguage = new TR();break;
            case 2: selectedLanguage = new EN();break;
            case 3: selectedLanguage = new DE();break;
            case 4: selectedLanguage = new FR();break;
            default: selectedLanguage = new EN();break;
        }

        System.out.println(selectedLanguage.getWelcome());
        System.out.println(selectedLanguage.getHome()+ " | "+ selectedLanguage.getAbout()+ " | "+ selectedLanguage.getContact());

    }
}