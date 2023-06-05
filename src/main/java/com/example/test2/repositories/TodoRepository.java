package com.example.test2.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.test2.Todo;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo,Long> {
}
