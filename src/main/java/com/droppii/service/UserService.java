package com.droppii.service;

import com.droppii.dto.UserDto;
import com.droppii.entity.MyEntity;

public interface UserService {
    UserDto getByID(Long id);
}
