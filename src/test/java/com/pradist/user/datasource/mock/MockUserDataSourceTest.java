package com.pradist.user.datasource.mock;

import static org.assertj.core.api.Assertions.assertThat;

import com.pradist.user.model.User;
import java.util.List;
import org.junit.jupiter.api.Test;

public class MockUserDataSourceTest {

  @Test
  public void WhenCallUser_GetAll_ShouldReturnUsers() {
    MockUserDataSource mockUser = new MockUserDataSource();
    List<User> users = mockUser.getAll();

    assertThat(users).isNotEmpty();
    assertThat(users).hasSize(3);
  }

  @Test
  public void WhenCallUser_GetAll_shouldProvideSomeMockData() {
    MockUserDataSource mockUserDataSource = new MockUserDataSource();
    List<User> users = mockUserDataSource.getAll();

    assertThat(users)
        .hasSize(3)
        .allMatch(user -> user.getId() > 0)
        .allMatch(user -> !user.getFirstName().isEmpty())
        .allMatch(user -> !user.getLastName().isEmpty())
        .allMatch(user -> !user.getEmail().isEmpty());
  }
}
