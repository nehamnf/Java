package com.banking.model;

import java.time.LocalDateTime;

/**
 * Represents a user in the banking application system.
 * 
 * This class encapsulates all user-related information including personal details,
 * contact information, and authentication credentials. Each user can have multiple
 * bank accounts associated with their user ID.
 * 
 * @author Banking App Team
 * @version 1.0
 */
public class User {
    /** Unique identifier for the user */
    private long id;
    
    /** Full name of the user */
    private String fullName;
    
    /** Email address of the user (used for login and communication) */
    private String email;
    
    /** Encrypted password for user authentication */
    private String password;
    
    /** Phone number of the user */
    private String phone;
    
    /** Timestamp when the user account was created */
    private LocalDateTime createdAt;

    /**
     * Default constructor for creating a new User instance.
     * Required for frameworks like JPA/Hibernate.
     */
    public User() {
    }

    /**
     * Constructs a new User with all fields including ID.
     * Typically used when retrieving user data from the database.
     * 
     * @param id Unique user identifier
     * @param fullName Full name of the user
     * @param email Email address of the user
     * @param phone Phone number of the user
     * @param password Encrypted password
     * @param createdAt Account creation timestamp
     */
    public User(long id, String fullName, String email, String phone, String password, LocalDateTime createdAt) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.createdAt = createdAt;
    }

    /**
     * Constructs a new User for registration purposes.
     * ID and creation timestamp are typically set by the database.
     * 
     * @param fullName Full name of the user
     * @param email Email address of the user
     * @param password Encrypted password
     * @param phone Phone number of the user
     */
    public User(String fullName, String email, String password, String phone) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    /**
     * Returns the unique identifier of the user.
     * 
     * @return the user ID
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the user.
     * Typically used by the database layer when persisting the user.
     * 
     * @param id the user ID to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Returns the email address of the user.
     * 
     * @return the user's email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address for the user.
     * 
     * @param email the email address to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the full name of the user.
     * 
     * @return the user's full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the full name for the user.
     * 
     * @param fullName the full name to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Returns the encrypted password of the user.
     * 
     * @return the user's encrypted password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the encrypted password for the user.
     * Password should be encrypted before setting.
     * 
     * @param password the encrypted password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the timestamp when the user account was created.
     * 
     * @return the account creation timestamp
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the timestamp when the user account was created.
     * Typically set by the database layer when the user is first created.
     * 
     * @param createdAt the creation timestamp to set
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Returns the phone number of the user.
     * 
     * @return the user's phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone number for the user.
     * 
     * @param phone the phone number to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Returns a string representation of the User object.
     * Excludes the password field for security reasons.
     * 
     * @return string representation of the user
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
