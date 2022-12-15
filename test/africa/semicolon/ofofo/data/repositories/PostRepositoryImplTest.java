//package africa.semicolon.ofofo.data.repositories;
//
//import africa.semicolon.ofofo.data.models.Post;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class PostRepositoryImplTest {
//    private PostRepository postRepository;
//    private Post post;
//
//    @BeforeEach
//    void setUp() {
//        postRepository = new PostRepositoryImpl();
//        post = new Post();
//    }
//    @Test
//    public void saveNewPost_countShouldBeOne_Test(){
//
//        post.setBody("This is first post body");
//        post.setTitle("first post title");
//
//        postRepository.save(post);
//
//        assertEquals(1L, postRepository.count());
//    }
//    @Test
//    public void saveNewPost_findById_shouldReturnSavedPostTest(){
//        post.setBody("This is first post body");
//        post.setTitle("first post title");
//
//        postRepository.save(post);
//        assertEquals(1L, postRepository.count());
//        Post savedPost = postRepository.findById(1);
//        assertEquals(post, savedPost);
//
//        Post post2 = new Post();
//        postRepository.save(post2);
//        assertEquals(post2, postRepository.findById(2));
//
//    }
//    @Test
//    public void saveNewPost_updatePost_countIsOneTest(){
//        post.setBody("This is first post body");
//        post.setTitle("first post title");
//        postRepository.save(post);
//
//        Post updatedPost = new Post();
//        updatedPost.setId(1);
//        updatedPost.setBody("updated body");
//        updatedPost.setTitle("updated title");
//        postRepository.save(updatedPost);
//        assertEquals(1L, postRepository.count());
//        assertEquals(post, postRepository.findById(1));
//        assertEquals("updated body", post.getBody());
//        assertEquals("updated title", post.getTitle());
//
//    }
//    @Test
//    public void deleteItem_countIsZero(){
//        post.setBody("This is first post body");
//        post.setTitle("first post title");
//        postRepository.save(post);
//
//        Post post1 = new Post();
//        post1.setBody("A body");
//        post1.setTitle("A title");
//        postRepository.save(post1);
//        assertEquals(2L, postRepository.count());
//        postRepository.delete(1);
//        postRepository.delete(2);
//        assertEquals(0L, postRepository.count());
//    }
//    @Test
//    public void createPosts_deleteSomePosts_undeletedPostsRetainTheirIds(){
//        post.setBody("This is first post body");
//        post.setTitle("first post title");
//        postRepository.save(post);
//
//        Post post1 = new Post();
//        post1.setBody("A body");
//        post1.setTitle("A title");
//        postRepository.save(post1);
//
//        Post post2 = new Post();
//        post2.setBody("Body body");
//        post2.setTitle("title title");
//        postRepository.save(post2);
//
//        Post post3 = new Post();
//        post1.setBody(" body");
//        post1.setTitle(" title");
//        postRepository.save(post3);
//
//        postRepository.delete(1);
//        postRepository.delete(2);
//        postRepository.delete(4);
//
//        assertEquals(post2, postRepository.findById(3));
//    }
//}