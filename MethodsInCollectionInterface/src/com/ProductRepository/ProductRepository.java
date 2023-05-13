package com.ProductRepository;
import com.ProductIn.model.ProductInput;

import java.util.ArrayList;

public class ProductRepository {
    static ArrayList a = new ArrayList ();

    public void setInputInArrayList(ProductInput p) {
        a.add(p);

    }

    public void show() {

     for(Object obj:a){
        ProductInput t = (ProductInput) obj;
        System.out.println(t.getId() + " " + t.getPrice() + " " + t.getCompany() + " " + t.getName());
    }
}



}