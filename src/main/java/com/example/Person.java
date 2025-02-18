package com.example;

public class Person {
    private String userId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    private Person(UserBuilder builder) {
        // Validate the conditions
        if (builder.userId == null || builder.userId.trim().isEmpty()) {
            throw new IllegalArgumentException("userId cannot be null or empty");
        }
        if (builder.age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    // Getters
    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public static class UserBuilder {
        private String userId;
        private String firstName;
        private String lastName;
        private int age;
        private String gender;

        public UserBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
