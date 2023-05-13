package com.ProductIn.model;

public class ProductInput {
    private int id;
    private String name;
    private int price;
    private String company;
    ProductInput(){

    }
    public ProductInput(int id, String name, int price, String company){// at time of object creation we need to pass parameter
        // but we create default constructor so we can do without parameter.
        this.id=id;
        this.name=name;
        this.price=price;
        this.company=company;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
