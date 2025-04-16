package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class Blog {
    private final List<BlogPost> posts;
    private final List<Person> contributors;

    public Blog(List<BlogPost> posts, List<Person> contributors) {
        this.posts = posts;
        this.contributors = contributors;
    }

    // Method to get posts by author's age
    public List<String> getPostsByAuthorAge(Integer age) {
        return posts.stream()
                .filter(post -> contributors.stream()
                        .anyMatch(person -> person.getUserId().equals(post.getWriterId()) && person.getAge() == age))
                .map(BlogPost::getArticleId)
                .collect(Collectors.toList());
    }

    // Example method to display authors
    public void listAuthors() {
        contributors.forEach(author -> System.out.println(author.getFirstName()));
    }

    public List<BlogPost> getPosts() {
        return posts;
    }

    public List<Person> getContributors() {
        return contributors;
    }
}
