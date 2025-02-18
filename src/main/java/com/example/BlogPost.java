package com.example;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

@Getter
@ToString
@EqualsAndHashCode
@Builder
@Jacksonized
public class BlogPost {
    private String articleId;
    private String writerId;
    private String content;

    // Constructor and getter methods

    private BlogPost(String articleId, String writerId, String content) {
        this.articleId = articleId;
        this.writerId = writerId;
        this.content = content;
    }

    public String getArticleId() {
        return articleId;
    }

    public String getWriterId() {
        return writerId;
    }

    public String getContent() {
        return content;
    }

    // Static builder class
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String articleId;
        private String writerId;
        private String content;

        public Builder articleId(String articleId) {
            this.articleId = articleId;
            return this;
        }

        public Builder writerId(String writerId) {
            this.writerId = writerId;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public BlogPost build() {
            if (articleId == null || writerId == null || content == null) {
                throw new IllegalArgumentException("All fields must be provided");
            }
            return new BlogPost(articleId, writerId, content);
        }
    }
}
