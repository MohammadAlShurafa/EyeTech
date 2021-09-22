package com.example.eyetech;

public class Item {
    int id;
    String name;
    int imageId;
    String details;
    int departmentNum;

    public Item() {
    }

    public Item(int id, String name, int imageId, String details, int departmentNum) {
        this.id = id;
        this.name = name;
        this.imageId = imageId;
        this.details = details;
        this.departmentNum = departmentNum;
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

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(int departmentNum) {
        this.departmentNum = departmentNum;
    }
}
