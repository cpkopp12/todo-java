package com.in28minutes.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

												//<entitiy name, id type>
public interface TodoRepository extends JpaRepository<Todo, Integer>{
	
	public List<Todo> findByUsername(String username);
	
}
