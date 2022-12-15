package africa.semicolon.ofofo.services;

import africa.semicolon.ofofo.data.models.Comment;
import africa.semicolon.ofofo.data.models.Post;
import africa.semicolon.ofofo.data.repositories.PostRepository;
import africa.semicolon.ofofo.dtos.requests.CreatePostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServicesImpl implements PostServices{
    @Autowired
    private PostRepository postRepository;
    @Override
    public void createPost(CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setBody(createPostRequest.getBody());
        post.setTitle(createPostRequest.getTitle());
        postRepository.save(post);
    }

    @Override
    public void updatePost(String id, String title, String body) {

    }

    @Override
    public void deletePost(String id) {

    }

    @Override
    public Post viewPost(String id) {

        return postRepository.findPostById(id);
    }

    @Override
    public List<Post> viewAllPost() {
        return postRepository.findAll();
    }

    @Override
    public void addComment(String postId, Comment comment) {
        Post savedPost = postRepository.findPostById(postId);
        savedPost.getComments().add(comment);
        postRepository.save(savedPost);

    }
}
