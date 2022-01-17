package com.example.a9_recyclerviewasviewpagerjava.model;

public class Member {
    private String name;
    private int iv_image;
    public Member(String name, int iv_image) {
        this.name = name;
        this.iv_image = iv_image;
    }

    public int getIv_image() {
        return iv_image;
    }

    public String getName() {
        return name;
    }
}
