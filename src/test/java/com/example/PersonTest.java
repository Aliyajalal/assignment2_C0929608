package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class PersonTest {
    
    @Test
    void testValidPersonCreation() {
        // Creating a Person object using the builder pattern with required parameters
        Person user = new Person.UserBuilder("U001", "Alice", "Brown", 28, "Female")
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
        assertThrows(IllegalArgumentException.class, () -> new Person.UserBuilder("U001", "Aliya", "Jalal", 100, "Female")
                .userId(null)  // userId cannot be null
                .build());
    }

    @Test
    void testInvalidPersonCreationWithNegativeAge() {
        // Testing for IllegalArgumentException when an invalid age is provided
        assertThrows(IllegalArgumentException.class, () -> new Person.UserBuilder("U002", "Frem", "Chingh", -5, "Male")
                .build());  // Age cannot be negative
    }
}
