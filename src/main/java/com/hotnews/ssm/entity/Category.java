package com.hotnews.ssm.entity;

import java.io.Serializable;

/**
 * Created by AnonymousH on 2017/9/25.
 */
public class Category implements Serializable{

    private String id;

    private String uid;

    private String  categoryName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", uid='" + uid + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
