package com.flipfit.bean;

public class Person {
    private String id;
    private String name;
    private String email;
    private String password;
    private FlipFitRole role;

    /**
     *
     * @param id
     * @param name
     * @param email
     * @param password
     * @param role
     */
    public Person(String id, String name, String email, String password, FlipFitRole role) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.role = role;
    }


    //  getters

    /**
     *
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     *
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     *
     * @return role
     */
    public FlipFitRole getRole() {
        return this.role;
    }

    //  setters

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @param role
     */
    public  void setRole(FlipFitRole role) {
        this.role = role;
    }
}
