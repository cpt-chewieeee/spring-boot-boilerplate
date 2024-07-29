package com.bazaar.backend.mapper;

import com.bazaar.backend.controllers.dto.UserDto;
import com.bazaar.backend.models.User;

public interface UserMapper {
  UserDto toUserDto(User user);
}
