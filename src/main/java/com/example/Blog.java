package com.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import java.util.List;

@Getter
@ToString
@EqualsAndHashCode
public class Blog{
    private final List<BlogPost> articles;
    private final List<Person> authors;

    public Blog(List<BlogPost> articles, List<Person> authors) {
        this.articles = articles;
        this.authors = authors;
    }

    // Example method to display author names
    public void listAuthors() {
        authors.forEach(author -> System.out.println(author.getFirstName()));
    }
}
