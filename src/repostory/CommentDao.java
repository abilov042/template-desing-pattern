package repostory;

import entities.Comment;

public class CommentDao {
    public void save(Comment comment){
        System.out.println("saved comment " + comment.getId());
    }
}
