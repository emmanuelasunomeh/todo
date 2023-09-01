package com.api.todo.repository;

import com.api.todo.entity.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugRepo extends JpaRepository<Drug, Long> {
}
