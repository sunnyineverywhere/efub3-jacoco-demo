package example.jacoco.common.post.api;

import example.jacoco.common.post.api.dto.PostReq;
import example.jacoco.common.post.api.dto.PostRes;
import example.jacoco.common.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping()
    private ResponseEntity<PostRes> postCreate (
            @RequestBody PostReq request
    ) {
        return new ResponseEntity<>(new PostRes(postService.createPost(request)), HttpStatus.CREATED);
    }
}
