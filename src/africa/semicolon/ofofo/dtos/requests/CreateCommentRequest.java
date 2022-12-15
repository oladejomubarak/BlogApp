package africa.semicolon.ofofo.dtos.requests;

import lombok.Data;

@Data
public class CreateCommentRequest {
    private String commentatorName;
    private String postId;
    private String comment;
}
