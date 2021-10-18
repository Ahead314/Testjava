package com.adama.udacity;
//Assume you're writing a Java program that's responsible for storing and managing all your friends' contact information.
//class that's responsible for storing all contact information of a single person, it will look something like this:
public class Contact {
    String name;
    String email;
    String phoneNumber;


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
