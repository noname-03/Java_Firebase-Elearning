package com.example.crudfirebase.model;

public class User {
    private String id, name, email, pertemuan;

    public User(String name, String email, String pertemuan) {
        this.name = name;
        this.email = email;
        this.pertemuan = pertemuan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPertemuan() {
        return pertemuan;
    }

    public void setPertemuan(String pertemuan) {
        this.pertemuan = pertemuan;
    }
}
