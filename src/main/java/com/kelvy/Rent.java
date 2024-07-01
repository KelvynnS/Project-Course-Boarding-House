package com.kelvy;

public class Rent {

    private String name;
    private String email;

    public Rent(String email, String name) {
        this.email = email;
        this.name = name;
    }

   
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + ", " + email;
    }

}
