package com.droppii.repository;

import com.droppii.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {
}
