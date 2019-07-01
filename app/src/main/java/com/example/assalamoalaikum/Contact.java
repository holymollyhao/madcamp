package com.example.assalamoalaikum;

import java.io.Serializable;

public class Contact implements Serializable {
    private String Name;
    private String Phone;
    private String Image_Uri;

    public Contact(){

    }
    public Contact(String name, String phone, String image_Uri ) {
        Name =name;
        Phone =phone;
        Image_Uri=image_Uri;

    }


    public String getName() {
        return Name;
    }

    public String getNumber() {
        return Phone;
    }
    public String getImage_Uri(){
        return Image_Uri;
    }


    public void setName(String name) {
        this.Name = name;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

}
