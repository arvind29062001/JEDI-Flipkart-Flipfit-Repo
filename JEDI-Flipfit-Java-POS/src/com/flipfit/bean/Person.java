package com.flipfit.bean;
/**
 * Represents a FlipFit User
 */
public class Person {
    private String id;
    private String name;
    private String email;
    private String password;
    private FlipFitRole role;

    /**
     * Parameterized constructor for FlipFitUser.
     * @param id,name,email,password,role the user's role (FlipFitRole object)
     * @author Arvind Yadav
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
     * Getter for the user's role.
     * @return the FlipFitRole object representing the user's role
     * @author Arvind Yadav
     */
    public String getId() {
        return this.id;
    }

    /**
     * Getter for the user name.
     * @return the user name
     * @author Arvind Yadav
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for the user's email address.
     * @return the user's email address
     * @author Arvind Yadav
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Getter for the user's password.
     * @return the user's password
     * @author Arvind Yadav
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Getter for the user's role.
     * @return the FlipFitRole object representing the user's role
     * @author Arvind Yadav
     */
    public FlipFitRole getRole() {
        return this.role;
    }

    //  setters

    /**
     * Setter for the user ID.
     * @param id the user ID to set
     * @author Arvind Yadav
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Setter for the user name.
     * @param name the user name to set
     * @author Arvind Yadav
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter for the user's email address.
     * @param email the email address to set
     * @author Arvind Yadav
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Setter for the user's password.
     * @param password the password to set
     * @author Arvind Yadav
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Setter for the user's role.
     * @param role the FlipFitRole object to set
     * @author Arvind Yadav
     */
    public  void setRole(FlipFitRole role) {
        this.role = role;
    }
}
