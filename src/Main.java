import entities.Post;
import repostory.PostDao;
import service.abstracts.IPostService;
import service.concretes.FaceBookService;
import service.concretes.InstagramPostService;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IPostService instagramPostService = new InstagramPostService(new PostDao());

        Post postInstagram = new Post();
        postInstagram.setId(1);
        instagramPostService.save(postInstagram);
        instagramPostService.unlike(postInstagram.getId());


        IPostService faceBookService = new FaceBookService(new PostDao());

        Post postFaceBook = new Post();
        postFaceBook.setId(2);
        faceBookService.save(postFaceBook);
        faceBookService.like(postFaceBook.getId());
    }
}
