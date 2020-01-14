package com.mcti.realtimedatabaseexample;

public class User {

    private String Name;
    private String Mobile;
    private String City;
    private String Email;

    public User() {
    }

    public User(String name, String mobile, String city, String email) {
        Name = name;
        Mobile = mobile;
        City = city;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getCity() {
        return City;
    }

    public String getEmail() {
        return Email;
    }
}
