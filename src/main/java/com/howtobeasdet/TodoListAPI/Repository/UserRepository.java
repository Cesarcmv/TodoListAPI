package com.howtobeasdet.TodoListAPI.Repository;

import com.howtobeasdet.TodoListAPI.Model.Task;
import com.howtobeasdet.TodoListAPI.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
