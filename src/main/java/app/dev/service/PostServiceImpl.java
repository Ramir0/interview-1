package app.dev.service;

import app.dev.entity.Post;
import app.dev.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Override
    public Collection<Post> getPosts() {
        return postRepository.findAll();
    }

    @Override
    public Collection<Post> getPostsByTitle(String textToFind) {
        return getPosts()
                .stream()
                .filter(post -> post.getContent().equals(textToFind))
                .toList();
    }
}
