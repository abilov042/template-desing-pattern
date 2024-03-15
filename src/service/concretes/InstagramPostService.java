package service.concretes;

import entities.Post;
import repostory.PostDao;
import service.abstracts.PostService;

public class InstagramPostService extends PostService {
    public InstagramPostService(PostDao postDao) {
        super(postDao);
    }
    @Override
    public void save(Post post) throws InterruptedException {
        System.out.println("Instagram ...");
        Thread.sleep(3000);
        super.save(post);
    }
    @Override
    public void delete(int id) throws InterruptedException {
        System.out.println("Instagram ...");
        Thread.sleep(5000);
        super.delete(id);
    }

    @Override
    public void update(Post post) {
        super.update(post);
    }

    @Override
    public void like(int postId) {
        super.like(postId);
    }

    @Override
    public void unlike(int postId) {
        super.unlike(postId);
    }

}
