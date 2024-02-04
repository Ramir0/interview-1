package app.dev.repository;

import app.dev.entity.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.UUID;

public interface PostRepository extends CrudRepository<Post, UUID> {
    Collection<Post> findAll();
}
