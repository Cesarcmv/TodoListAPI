package com.howtobeasdet.TodoListAPI.Repository;

import com.howtobeasdet.TodoListAPI.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
