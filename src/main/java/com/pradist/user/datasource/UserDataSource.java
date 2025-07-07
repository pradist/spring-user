package com.pradist.user.datasource;

import com.pradist.user.model.User;
import java.util.List;

public interface UserDataSource {
  List<User> getAll();
}
