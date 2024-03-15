package service.abstracts;

import entities.Post;

public interface IPostService {
    void save(Post post) throws InterruptedException;
    void delete(int id) throws InterruptedException;
    void update(Post post);
    void like(int postId);
    void unlike(int postId);
}
