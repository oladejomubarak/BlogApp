package africa.semicolon.ofofo.services;

import africa.semicolon.ofofo.data.models.Comment;
import africa.semicolon.ofofo.data.models.Post;
import africa.semicolon.ofofo.dtos.requests.CreatePostRequest;

import java.util.List;

public interface PostServices {
    void createPost(CreatePostRequest createPostRequest);
    void updatePost(String id, String title, String body);
    void deletePost(String id);
    Post viewPost(String id);

    List<Post> viewAllPost();

    void addComment(String postId, Comment comment);
}
