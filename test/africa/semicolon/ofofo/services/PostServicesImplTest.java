//package africa.semicolon.ofofo.services;
//
//import africa.semicolon.ofofo.data.models.Comment;
//import africa.semicolon.ofofo.data.models.Post;
//import africa.semicolon.ofofo.dtos.requests.CreatePostRequest;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class PostServicesImplTest {
//    private PostServices postServices;
//
//    @BeforeEach
//    void setUp() {
//        postServices = new PostServicesImpl();
//    }
//    @Test
//    public void createPost(){
//        CreatePostRequest createPostRequest = new CreatePostRequest();
//        createPostRequest.setBody("Egusi is a soup");
//        createPostRequest.setTitle("New post");
//        postServices.createPost(createPostRequest );
//        assertEquals(1, postServices.viewAllPost().size());
//    }
//    @Test
//    public void viewPost(){
//        CreatePostRequest createPostRequest = new CreatePostRequest();
//        createPostRequest.setBody("Egusi is a soup");
//        createPostRequest.setTitle("New post");
//        postServices.createPost(createPostRequest );
//        assertEquals(1, postServices.viewAllPost().size());
//
//        Post post = postServices.viewPost(1);
//        assertEquals("New post", post.getTitle());
//        assertEquals("Egusi is a soup", post.getBody());
//    }
//    @Test public void addCommentTest(){
//        CreatePostRequest createPostRequest = new CreatePostRequest();
//        createPostRequest.setBody("Egusi is a soup");
//        createPostRequest.setTitle("New post");
//        postServices.createPost(createPostRequest );
//
//        Comment comment =new Comment();
//        comment.setComment("I love this post");
//        postServices.addComment(1, comment);
//
//        Post savedPost = postServices.viewPost(1);
//        assertEquals(1, savedPost.getComments().size());
//        assertEquals("I love this post", savedPost.getComments().get(0).getComment());
//
//    }
//}