package com.example.ck_mapper.models;

public class Custom_btn_model {


    private int imageIcon;
    private String btn_name;
    private float rotation;

    public Custom_btn_model(int imageIcon, String btn_name,float rotation){

        this.imageIcon = imageIcon;
        this.btn_name = btn_name;
        this.rotation = rotation;

    }

    public int getImageIcon() {
        return imageIcon;
    }

    public String getBtn_name(){
        return btn_name;
    }

    public float getRotation(){return rotation;}

}
