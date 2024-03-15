package repostory;

import entities.Post;

public class PostDao {
    public void save(Post post){
        System.out.println("post saved " + post.getId());
    }
    public void delete(int id){
        System.out.println("post removed " + id);
    }
    public void update(Post post){
        System.out.println("post updated " + post.getId());
    }
    public Post findById(int id){
        Post post = new Post();
        post.setId(id);
        return post;
    }
}
