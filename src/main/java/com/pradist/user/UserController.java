package com.pradist.user;

import com.pradist.user.datasource.mock.MockUserDataSource;
import com.pradist.user.model.User;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
  @GetMapping
  public List<User> users() {
    MockUserDataSource mockUserDataSource = new MockUserDataSource();
    return mockUserDataSource.getAll();
  }
}
