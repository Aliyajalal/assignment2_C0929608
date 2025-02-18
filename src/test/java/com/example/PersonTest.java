package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class PersonTest {
    
    @Test
    void testValidPersonCreation() {
        // Creating a Person object using the builder pattern
        Person user = new Person.UserBuilder()
                .userId("U001")
                .firstName("Alice")
                .lastName("Brown")
                .age(28)
                .gender("Female")
                .build();

        // Asserting that the values set using builder are correctly assigned
        assertEquals("U001", user.getUserId());
        assertEquals("Alice", user.getFirstName());
        assertEquals("Brown", user.getLastName());
        assertEquals(28, user.getAge());
        assertEquals("Female", user.getGender());
    }

    @Test
    void testInvalidPersonCreation() {
        // Testing for IllegalArgumentException when an invalid user is created
        assertThrows(IllegalArgumentException.class, () -> new Person.UserBuilder()
                .userId(null)  // userId cannot be null
                .firstName("Aliya")
                .lastName("Jalal")
                .age(100)
                .gender("Female")
                .build());
    }

    @Test
    void testInvalidPersonCreationWithNegativeAge() {
        // Testing for IllegalArgumentException when an invalid age is provided
        assertThrows(IllegalArgumentException.class, () -> new Person.UserBuilder()
                .userId("U002")
                .firstName("Frem")
                .lastName("Chingh")
                .age(-5)  // Age cannot be negative
                .gender("Male")
                .build());
    }
}
