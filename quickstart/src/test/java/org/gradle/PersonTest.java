package org.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains some methods to test every personal information.
 */
public class PersonTest {
    private Person person;

    /**
     * Initialize the person object.
     */
    @Before
    public void initialize() {
        person = new Person("Robert", 25, "9944011", 2, 100.0,
                "72709805", "Av.America#0000", "male",
                "robert@gmail.com", "Bolivian", "Unmarried");
    }

    /**
     * this method verifies the name of the person.
     */
    @Test
    public void testToGetThePersonName() {
        assertEquals("Robert", person.getName());
    }

    /**
     * this method verifies the age of the person.
     */
    @Test
    public void testToGetThePersonAge() {
        assertEquals(25, person.getAge());
    }

    /**
     * this method verifies the CI of the person.
     */
    @Test
    public void testToGetThePersonCI() {
        assertEquals("9944011", person.getCI());
    }

    /**
     * this method verifies the height of the person.
     */
    @Test
    public void testToGetThePersonHeight() {
        assertEquals(2.0, person.getHeightMts(), 0.0);
    }

    /**
     * this method verifies the weight of the person.
     */
    @Test
    public void testToGetThePersonWeight() {
        assertEquals(100.0, person.getWeightKg(), 0.0);
    }

    /**
     * this method verifies the body mass index of the person.
     */
    @Test
    public void testToGetThePersonBodyMassIndex() {
        assertEquals(25.0, person.getBodyMassIndex(), 0.0);
    }

    /**
     * this method verifies the phone number of the person.
     */
    @Test
    public void testToGetThePersonPhoneNumber() {
        assertEquals("72709805", person.getPhoneNumber());
    }

    /**
     * this method verifies the address of the person.
     */
    @Test
    public void testToGetThePersonAddress() {
        assertEquals("Av.America#0000", person.getAddress());
    }

    /**
     * this method verifies the gender of the person.
     */
    @Test
    public void testToGetThePersonGender() {
        assertEquals("male", person.getGender());
    }

    /**
     * this method verifies the email of the person
     */
    @Test
    public void testToGetThePersonEmail() {
        assertEquals("robert@gmail.com", person.getEmail());
    }

    /**
     * this method verifies the nationality of the person
     */
    @Test
    public void testToGetThePersonNationality() {
        assertEquals("Bolivian", person.getNationality());
    }

    /**
     * this method verifies the civil status of the person
     */
    @Test
    public void testToGetThePersonCivilStatus() {
        assertEquals("Unmarried", person.getCivilStatus());
    }

}
