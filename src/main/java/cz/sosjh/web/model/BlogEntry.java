package cz.sosjh.web.model;

import java.time.LocalDateTime;

public class BlogEntry {

    private String title;
    private String author;
    private LocalDateTime created;
    private String content;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public String getContent() {
        return content;
    }

    public BlogEntry(String title, String author, LocalDateTime created, String content) {
        this.title = title;
        this.author = author;
        this.created = created;
        this.content = content;



    }
}
