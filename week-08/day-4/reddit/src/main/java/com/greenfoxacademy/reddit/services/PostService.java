package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

  @Autowired
  PostRepository postRepository;

  public List<Post> listAllPosts() {
    List<Post> postList = new ArrayList<>();
    postRepository.findAll().forEach(postList::add);
    return postList;
  }

  public Post createEmptyPost() {
    Post newPost = new Post();
    return newPost;
  }

  public Post updateContentOfAPost(Post postToUpdate, String contentToSet) {
    postToUpdate.setContent(contentToSet);
    return postToUpdate;
  }

  public String getPostContent(Post postToGetContentOf) {
    return postToGetContentOf.getContent();
  }

  public void addPostToRepository(Post postToBeSaved) {
    postRepository.save(postToBeSaved);
  }

  public Post getPostById(Long id) {
    return postRepository.findOne(id);
  }

  public void increaseScorePerClick(Long id) {
    postRepository.findOne(id).setScore(postRepository.findOne(id).getScore() + 1);
    postRepository.save(postRepository.findOne(id));
  }

  public void decreaseScorePerClick(Long id) {
    postRepository.findOne(id).setScore(postRepository.findOne(id).getScore() - 1);
    postRepository.save(postRepository.findOne(id));
  }
}
