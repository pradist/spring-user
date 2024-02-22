package com.pradist.user.datasource.mock;

import com.pradist.user.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class MockUserDataSourceTest {

  @Test
  public void WhenCallUser_GetAll_ShouldReturnUsers() {
    MockUserDataSource mockUser = new MockUserDataSource();
    List<User> users = mockUser.getAll();

    assertThat(users).isNotEmpty();
    assertEquals(3, users.size());
  }

}
