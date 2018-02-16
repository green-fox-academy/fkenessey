package com.greenfoxacademy.todowithwebsecurity.services;

import com.greenfoxacademy.todowithwebsecurity.models.SiteUser;
import com.greenfoxacademy.todowithwebsecurity.models.ToDo;
import com.greenfoxacademy.todowithwebsecurity.repositories.SiteUserRepository;
import com.greenfoxacademy.todowithwebsecurity.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebService {

  @Autowired
  SiteUserRepository siteUserRepository;
  @Autowired
  ToDoRepository toDoRepository;

  public boolean ifSiteUserAttributesCorrect(SiteUser siteUserInput) {

    if (siteUserRepository.findByUserName(siteUserInput.getUserName()) != null) {

      SiteUser siteUserFromDatabase = siteUserRepository.findByUserName(siteUserInput.getUserName());

      if (siteUserInput.getPassword().equals(siteUserFromDatabase.getPassword())) {
        return true;
      } else {
        return false;
      }
    } else {
      siteUserRepository.save(new SiteUser(siteUserInput.getUserName(), siteUserInput.getPassword()));
      return true;
    }
  }

  public List fullTodoListByUserName(String userName) {
    return (List) toDoRepository.findAllBySiteUserUserName(userName);
  }

  public boolean isCorrectCookie(String userNameFromCookie) {
    if (siteUserRepository.findByUserName(userNameFromCookie) != null) {
      return true;
    } else {
      return false;
    }
  }

  public SiteUser findSiteUserByUserName(String userNameFromCookie) {
    return siteUserRepository.findByUserName(userNameFromCookie);
  }

  public void saveNewToDo(ToDo newToDo) {
    toDoRepository.save(newToDo);
  }
}
