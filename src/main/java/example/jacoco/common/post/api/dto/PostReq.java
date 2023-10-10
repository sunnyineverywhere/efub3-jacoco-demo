package example.jacoco.common.post.api.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostReq {
    private String author;
    private String title;
    private String contents;
}
