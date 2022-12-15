//package africa.semicolon.ofofo.data.repositories;
//
//import africa.semicolon.ofofo.data.models.Comment;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CommentRepositoryImplTest {
//    private CommentRepository commentRepository;
//    Comment comment;
//
//    @BeforeEach
//    public void setUp() {
//        commentRepository = new CommentRepositoryImpl();
//        comment = new Comment();
//    }
//    @Test
//    public void saveNewComment_countShouldBeOne_Test(){
//        comment.setComment("I like this post");
//
//        commentRepository.save(comment);
//        assertEquals(1L, commentRepository.count());
//    }
//    @Test
//    public void saveNewComment_findById_shouldReturnSavedCommentTest(){
//        comment.setComment("I like this post");
//        commentRepository.save(comment);
//        assertEquals(1L, commentRepository.count());
//
//        Comment savedComment = commentRepository.findById(1);
//        assertEquals(comment, savedComment);
//
//        Comment comment1 = new Comment();
//        commentRepository.save(comment1);
//        assertEquals(comment1, commentRepository.findById(2));
//
//    }
//    @Test
//    public void saveNewComment_updateComment_countIsOneTest(){
//        comment.setComment("Good post");
//        commentRepository.save(comment);
//        assertEquals(1L, commentRepository.count());
//
//        Comment updatedComment = new Comment();
//
//        updatedComment.setId(1);
//        updatedComment.setComment("bad comment");
//        commentRepository.save(updatedComment);
//        assertEquals(1L,commentRepository.count());
//        assertEquals(comment, commentRepository.findById(1));
//        assertEquals("bad comment", comment.getComment());
//
//    }
//    @Test
//    public void deleteComment_countReducesByTheNumberOfCommentDeleted(){
//        comment.setComment("Good post");
//        commentRepository.save(comment);
//        assertEquals(1L, commentRepository.count());
//
//        Comment comment1 = new Comment();
//        comment1.setComment("comment");
//        commentRepository.save(comment1);
//        assertEquals(2L, commentRepository.count());
//
//        Comment comment2 = new Comment();
//        comment2.setComment("comment2");
//        commentRepository.save(comment2);
//        assertEquals(3L, commentRepository.count());
//
//        commentRepository.delete(1);
//        commentRepository.delete(1);
//        assertEquals(1L, commentRepository.count());
//
//
//    }
//
//
//}