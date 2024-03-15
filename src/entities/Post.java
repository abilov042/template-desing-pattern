package entities;

import java.time.LocalDateTime;
import java.util.List;

public class Post {
    private int id;
    private String description;
    private int likes;
    private LocalDateTime createdAt;

    // One to Many
    private List<Comment> comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public Post(){}

    public Post(int id, String description, int likes, LocalDateTime createdAt, List<Comment> comment) {
        this.id = id;
        this.description = description;
        this.likes = likes;
        this.createdAt = createdAt;
        this.comment = comment;
    }
}
