package com.wordpress.cosminiuliang.database.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class DataBase {

    private static int cout = 0;
    @Id
    private int nrCrt;
    private String familyName;
    private String lastName;
    private String email;
    private String telephone;
    private String adress;
    private String birthDate;
    private String gender;


    public DataBase() {

        cout++;
        nrCrt = cout;
    }

    public int getNrCrt() {
        return nrCrt;
    }

    public void setNrCrt(int nrCrt) {
        this.nrCrt = nrCrt;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getCout() {
        return cout;
    }

    public static void setCout(int cout) {
        DataBase.cout = cout;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "<br><br>Family name='" + familyName + '\'' +
                ", Last name='" + lastName + '\'' +
                ", Email='" + email + '\'' +
                ", Telephone='" + telephone + '\'' +
                ", Adress='" + adress + '\'' +
                ", Birth date='" + birthDate + '\'' +
                ", Gender='" + gender + '\'' +
                "<br><br>";
    }
}

