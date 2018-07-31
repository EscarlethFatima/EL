package org.gradle;

/**
 * This class contains methods to get the personal information of a person.
 */
public class Person {
    private final String name;
    private final int age;
    private final String ci;
    private final double heightMts;
    private final double weightKg;
    private final String phoneNumber;
    private final String address;
    private final String gender;
    private final String email;
    private final String nationality;
    private final String civilStatus;

    /**
     * Constructor for Person class.
     *
     * @param name
     * @param age
     * @param ci
     * @param heightMts
     * @param weightKg
     * @param phoneNumber
     * @param address
     * @param gender
     * @param email
     * @param nationality
     * @param civilStatus
     */
    public Person(String name, int age, String ci, double heightMts, double weightKg,
                  String phoneNumber, String address, String gender, String email,
                  String nationality, String civilStatus) {
        this.name = name;
        this.age = age;
        this.ci = ci;
        this.heightMts = heightMts;
        this.weightKg = weightKg;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.nationality = nationality;
        this.civilStatus = civilStatus;
    }

    /**
     * @return the name's person.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the age's person.
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the CI's person.
     */
    public String getCI() {
        return ci;
    }

    /**
     * @return the height of the person.
     */
    public double getHeightMts() {
        return heightMts;
    }

    /**
     * @return the weight of the person.
     */
    public double getWeightKg() {
        return weightKg;
    }

    /**
     * @return the body mass index of the person.
     */
    public double getBodyMassIndex() {
        return weightKg / (heightMts * heightMts);
    }

    /**
     * @return the phone of the person.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return the address of the person.
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the gender of the person.
     */
    public String getGender() {
        return gender;
    }

    /**
     * @return the email of the person.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the nationality of the person.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @return the civil status of the person.
     */
    public String getCivilStatus() {
        return civilStatus;
    }
}
