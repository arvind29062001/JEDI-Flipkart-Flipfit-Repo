package com.flipfit.bean;

public class Person {


    private String name;
    private String email;
    private String phoneNumber;
    private String personId;
    private  String address;

    public Person(String name, String email, String phoneNumber, String personId, String address) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.personId = personId;
        this.address = address;
    }






    // Getter & Setter

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


//    //Method
//    public void login(){
//
//    }
//
//    public void register(){
//
//    }
//
//    public void editProfile(){
//
//    }




}
