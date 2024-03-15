package service.abstracts;

import entities.Post;
import repostory.PostDao;

public abstract class PostService implements IPostService{
    private final PostDao postDao;

    public PostService(PostDao postDao) {
        this.postDao = postDao;
    }

    @Override
    public void save(Post post) throws InterruptedException {
        postDao.save(post);
    }

    @Override
    public void delete(int id) throws InterruptedException {
        postDao.delete(id);
    }

    @Override
    public void update(Post post) {
        postDao.update(post);
    }

    @Override
    public void like(int postId) {
        Post post = postDao.findById(postId);
        post.setLikes(post.getLikes() + 1);
    }

    @Override
    public void unlike(int postId) {
        Post post = postDao.findById(postId);
        post.setLikes(post.getLikes() - 1);
    }
}
