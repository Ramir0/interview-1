package app.dev.service;

import app.dev.entity.Post;
import app.dev.repository.PostRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PostServiceTest {
    @Mock
    private PostRepository postRepository;
    @InjectMocks
    private PostServiceImpl underTest;

    @Test
    void getPosts_ShouldReturn_AllPosts() {
        var posts = List.of(new Post());
        when(postRepository.findAll()).thenReturn(posts);

        var actual = underTest.getPosts();

        verify(postRepository).findAll();
        assertEquals(1, actual.size());
    }

    @Test
    void getPostsByTitle_ShouldReturn_PostsWithMatchingTitle() {
        var post1 = new Post();
        post1.setTitle("Java Basics");
        post1.setContent("Some random content");


        var post2 = new Post();
        post2.setTitle("Spring boot in 10 minutes");
        post2.setContent("This is a description");

        var post3 = new Post();
        post3.setTitle("Expert in Java and Spring");
        post3.setContent("More random content");

        var posts = List.of(post1, post2, post3);
        when(postRepository.findAll()).thenReturn(posts);

        String textToFind = "Java";
        var actual = underTest.getPostsByTitle(textToFind);

        verify(postRepository).findAll();
        assertEquals(2, actual.size());
        actual.forEach(r -> assertTrue(r.getTitle().contains(textToFind)));
    }
}
