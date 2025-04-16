package com.example;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BlogTest {

    @Test
    void testGetPostsByAuthorAge() {
        // Create some test data with required parameters
        Person person1 = new Person.UserBuilder("U001", "Alice", "Brown", 30, "Female").build();
        Person person2 = new Person.UserBuilder("U002", "Bob", "Smith", 40, "Male").build();
        BlogPost post1 = BlogPost.builder().articleId("A001").writerId("U001").content("First post").build();
        BlogPost post2 = BlogPost.builder().articleId("A002").writerId("U002").content("Second post").build();
        BlogPost post3 = BlogPost.builder().articleId("A003").writerId("U001").content("Third post").build();

        Blog blog = new Blog(Arrays.asList(post1, post2, post3), Arrays.asList(person1, person2));

        // Test: get posts by author age 30
        assertEquals(Arrays.asList("A001", "A003"), blog.getPostsByAuthorAge(30));

        // Test: get posts by author age 40
        assertEquals(Arrays.asList("A002"), blog.getPostsByAuthorAge(40));

        // Test: get posts for a non-existent age
        assertEquals(Arrays.asList(), blog.getPostsByAuthorAge(25));
    }

    @Test
    void testGetPostsByAuthorAgeWithMissingAuthor() {
        // Create test data where author is missing in the contributors list
        Person person1 = new Person.UserBuilder("U001", "Alice", "Brown", 30, "Female").build();
        BlogPost post1 = BlogPost.builder().articleId("A001").writerId("U002").content("First post").build();  // U002 doesn't exist in contributors

        Blog blog = new Blog(Arrays.asList(post1), Arrays.asList(person1));

        // Test: should return an empty list as author U002 does not exist
        assertEquals(Arrays.asList(), blog.getPostsByAuthorAge(30));
    }
}
