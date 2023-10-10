package example.jacoco.common.post.service;

import example.jacoco.common.post.api.dto.PostReq;
import example.jacoco.common.post.storage.Post;
import example.jacoco.common.post.storage.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public Post createPost(PostReq req) {
        return postRepository.save(
                Post.builder()
                        .author(req.getAuthor())
                        .title(req.getTitle())
                        .contents(req.getContents())
                        .build()
        );
    }
}
