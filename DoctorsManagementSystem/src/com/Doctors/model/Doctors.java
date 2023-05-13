
package com.Doctors.model;

public class Doctors {
    private int id;
    private String name;
    private int rank;
    private String speciality;
    private String city;
    private int fees;
    Doctors(){

    }
    public Doctors(int id,String name,int rank,String speciality,String city,int fees){// here we create parameterised constructor and pass value which are taken from user.
        this.id=id;
        this.name=name;
        this.rank=rank;
        this.speciality=speciality;
        this.city=city;
        this.fees=fees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}
