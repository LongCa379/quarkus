package com.droppii.service.impl;

import com.droppii.dto.UserDto;
import com.droppii.dto.mapper.UserMapper;
import com.droppii.entity.MyEntity;
import com.droppii.repository.MyEntityRepository;
import com.droppii.service.UserService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class UserServiceImpl implements UserService {
    private final MyEntityRepository myEntityRepository;

    @Inject
    UserMapper userMapper;

    public UserServiceImpl(MyEntityRepository myEntityRepository) {
        this.myEntityRepository = myEntityRepository;
    }

    @Override
    public UserDto getByID(Long id) {
        var e = this.myEntityRepository.findById(id).orElseThrow();
        return userMapper.userDto(e);
    }
}
