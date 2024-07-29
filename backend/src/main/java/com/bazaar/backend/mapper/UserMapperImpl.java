package com.bazaar.backend.mapper;

import org.springframework.stereotype.Service;

import com.bazaar.backend.controllers.dto.UserDto;
import com.bazaar.backend.models.User;

@Service
public class UserMapperImpl implements UserMapper {
  @Override
  public UserDto toUserDto(User user) {
    if (user == null) {
      return null;
    }
    return new UserDto(user.getId(), user.getUsername(), user.getEmail(), user.getRole());
  }
}
