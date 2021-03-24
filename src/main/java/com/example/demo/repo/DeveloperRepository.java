package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Developer;

@Repository
public interface DeveloperRepository extends CrudRepository<Developer, Integer> {
}
