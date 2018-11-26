package com.example.springboot_3_3;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,
        Long> {
}
