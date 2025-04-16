package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class BlogPostTest {
    @Test
    void testValidBlogPostCreation() {
        BlogPost article = BlogPost.builder()
                .articleId("A001")
                .writerId("U001")
                .content("This is a test article for my assignment") // Content updated
                .build();

        assertEquals("A001", article.getArticleId());
        assertEquals("U001", article.getWriterId());
        assertEquals("This is a test article for my assignment", article.getContent()); // Expected content updated
    }

    @Test
    void testInvalidArticleCreation() {
        assertThrows(IllegalArgumentException.class, () -> BlogPost.builder()
                .articleId(null)
                .writerId("U001")
                .content("Content")
                .build());

        assertThrows(IllegalArgumentException.class, () -> BlogPost.builder()
                .articleId("A002")
                .writerId(null)
                .content("Content")
                .build());
    }

    @Test
    void testInvalidBlogPostCreation() {
        assertThrows(IllegalArgumentException.class, () -> BlogPost.builder()
                .articleId(null)
                .writerId("U001")
                .content("Content")
                .build());

        assertThrows(IllegalArgumentException.class, () -> BlogPost.builder()
                .articleId("A002")
                .writerId(null)
                .content("Content")
                .build());
    }
}
