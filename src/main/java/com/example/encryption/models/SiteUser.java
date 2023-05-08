package com.example.encryption.models;

import jakarta.persistence.*;

@Entity
public class SiteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String userName;
    String password;
//    @OneToMany(mappedBy = "siteUser")
//    List<Recipe> recipes;

    protected SiteUser(){}

    public SiteUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Once Recipes List is created, will need a getter

    @Override
    public String toString() {
        return "SiteUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
