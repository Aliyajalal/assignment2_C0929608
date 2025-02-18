package com.example;

public class MainApp {
    public static void main(String[] args) {
        // Create Person instances
        Person user1 = new Person.UserBuilder().userId("U001").firstName("Aliya").lastName("Jalal").age(100).gender("Female").build();
        Person user2 = new Person.UserBuilder().userId("U002").firstName("Frem").lastName("Chingu").age(35).gender("Male").build();

        // Print authors
        System.out.println("Authors:");
        System.out.println(user1.getFirstName() + " " + user1.getLastName());
        System.out.println(user2.getFirstName() + " " + user2.getLastName());
    }
}
