package com.example.assignment3.models;

public class Item
{
    String name;
    int resc_id;
    String ph_no;

    public Item(String name,String ph_no,int resc_id) {
        this.name = name;
        this.resc_id = resc_id;
        this.ph_no = ph_no;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResc_id() {
        return resc_id;
    }

    public void setResc_id(int resc_id) {
        this.resc_id = resc_id;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }
}
