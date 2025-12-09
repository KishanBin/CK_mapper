package com.example.ck_mapper.models;

public class Custom_btn_model {

    private int imageIcon;
    private String btn_name;

    public Custom_btn_model(int imageIcon, String btn_name){
        this.imageIcon = imageIcon;
        this.btn_name = btn_name;

    }

    public int getImageIcon() {
        return imageIcon;
    }

    public String getBtn_name(){
        return btn_name;
    }

}
