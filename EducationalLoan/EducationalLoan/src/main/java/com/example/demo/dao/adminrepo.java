package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AdminModel;

@Repository
public interface adminrepo extends JpaRepository<AdminModel,Integer> {

}
