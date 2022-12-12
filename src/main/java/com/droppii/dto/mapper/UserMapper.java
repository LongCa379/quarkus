package com.droppii.dto.mapper;

import com.droppii.dto.UserDto;
import com.droppii.entity.MyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface UserMapper {
    @Mapping(target = "name", source = "field")
    UserDto userDto(MyEntity entity);
}
