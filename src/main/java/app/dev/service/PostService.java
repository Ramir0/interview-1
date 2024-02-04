package app.dev.service;

import app.dev.entity.Post;

import java.util.Collection;

public interface PostService {
    Collection<Post> getPosts();

    Collection<Post> getPostsByTitle(String textToFind);
}
