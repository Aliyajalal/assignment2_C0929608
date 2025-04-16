package com.example;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MainApp {
    public static void main(String[] args) {
        try {
            // Create an ObjectMapper instance for reading JSON
            ObjectMapper objectMapper = new ObjectMapper();

            // Use ClassLoader to load JSON files from resources
            File personFile = null;
            File blogPostsFile = null;

            try {
                personFile = new File(MainApp.class.getClassLoader().getResource("person.json").toURI());
                blogPostsFile = new File(MainApp.class.getClassLoader().getResource("blogPosts.json").toURI());
            } catch (URISyntaxException e) {
                System.out.println("Error in URI syntax: " + e.getMessage());
                return;
            }

            // Read person.json into a List of Person objects
            List<Person> persons = objectMapper.readValue(personFile,
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Person.class));

            // Read blogPosts.json into a List of BlogPost objects
            List<BlogPost> blogPosts = objectMapper.readValue(blogPostsFile,
                    objectMapper.getTypeFactory().constructCollectionType(List.class, BlogPost.class));

            // Create a Blog instance with the read data
            Blog blog = new Blog(blogPosts, persons);

            // Example: Get posts by authors aged 30
            Integer age = 30;
            List<String> postIdsByAge = blog.getPostsByAuthorAge(age);
            System.out.println("Posts by authors aged " + age + ": " + postIdsByAge);

            // Print total number of blog posts and contributors
            System.out.println("Total number of blog posts: " + blog.getPosts().size());
            System.out.println("Total number of contributors: " + blog.getContributors().size());

        } catch (IOException e) {
            System.out.println("Error reading JSON files: " + e.getMessage());
        }
    }
}
