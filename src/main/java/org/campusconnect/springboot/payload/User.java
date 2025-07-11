package org.campusconnect.springboot.payload;

public class User {
    private int id;
    private String firstName;
    private String lastName;



    /**
     * set field
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * set field
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * set field
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * get field
     *
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * get field
     *
     * @return firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    /**
     * get field
     *
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }
}
