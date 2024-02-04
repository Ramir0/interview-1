package app.dev.controller;

import app.dev.entity.Post;
import app.dev.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("posts")
public class PostController {
    private final PostService postService;

    @GetMapping
    public ResponseEntity<Collection<Post>> getPosts() {
        return ResponseEntity.ok(postService.getPosts());
    }

    @GetMapping("/by-title")
    public ResponseEntity<Collection<Post>> getPostsByTitle(@RequestParam String text) {
        return ResponseEntity.ok(postService.getPostsByTitle(text));
    }
}
