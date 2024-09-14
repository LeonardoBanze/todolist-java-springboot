package mz.com.lbcodes.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mz.com.lbcodes.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
