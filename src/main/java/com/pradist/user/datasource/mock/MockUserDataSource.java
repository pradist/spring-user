package com.pradist.user.datasource.mock;

import com.pradist.user.datasource.UserDataSource;
import com.pradist.user.model.User;

import java.util.List;

public class MockUserDataSource implements UserDataSource {
  @Override
  public List<User> getAll() {
    return List.of(
      new User(1, "James", "Bond", ""),
      new User(2, "Maria", "Jones", ""),
      new User(3, "Anna", "Smith", "")
      );
  }
}
