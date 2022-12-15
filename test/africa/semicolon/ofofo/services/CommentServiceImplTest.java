//package africa.semicolon.ofofo.services;
//
//import africa.semicolon.ofofo.dtos.requests.CreateCommentRequest;
//import africa.semicolon.ofofo.dtos.requests.CreatePostRequest;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class CommentServiceImplTest {
//    private CommentServices commentServices;
//    private PostServices postServices;
//    @BeforeEach
//    void setUp(){
//        commentServices = new CommentServicesImpl();
//        postServices = new PostServicesImpl();
//    }
//    @Test
//    void createCommentTest(){
//        CreatePostRequest createPostRequest = new CreatePostRequest();
//        createPostRequest.setBody("body");
//        createPostRequest.setTitle("title");
//        postServices.createPost(createPostRequest);
//
//        CreateCommentRequest createCommentRequest = new CreateCommentRequest();
//        createCommentRequest.setCommentatorName("ola");
//        createCommentRequest.setPostId(1);
//        createCommentRequest.setComment("love this");
//
//        commentServices.createComment(createCommentRequest);
//
//        assertEquals(1, commentServices.viewAll().size());
//    }
//}
