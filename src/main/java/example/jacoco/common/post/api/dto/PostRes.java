package example.jacoco.common.post.api.dto;

import example.jacoco.common.post.storage.Post;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostRes {
    private Long postId;
    private String author;
    private String title;
    private String contents;

    public PostRes(Post entity) {
        this.postId = entity.getId();
        this.author = entity.getAuthor();
        this.title = entity.getTitle();
        this.contents = entity.getContents();
    }
}
