package com.flipfit.bean;

public class Person {
    private String id;
    private String name;
    private String email;
    private String password;
    private FlipFitRole role;


    public Person(String id, String name, String email, String password, FlipFitRole role) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.role = role;
    }


    //  getters
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public FlipFitRole getRole() {
        return this.role;
    }

    //  setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(FlipFitRole role) {
        this.role = role;
    }
}
