package com.flipfit.bean;
/**
 * Represents an admin user in the FlipFit system, extending FlipFitUser.
 * This class provides a default constructor initializing admin details.
 * @author Arvind Yadav
 */


public class FlipFitAdmin extends Person {
    /**
     * Default constructor for creating an admin user.
     * Initializes with default values for admin user ID, username, email, password,
     * and assigns the role as ADMIN.
     * @author Arvind Yadav
     */

    public FlipFitAdmin() {
        super("admin1", "admin", "admin@flipfit.com", "admin", FlipFitRole.ADMIN);
    }
}
