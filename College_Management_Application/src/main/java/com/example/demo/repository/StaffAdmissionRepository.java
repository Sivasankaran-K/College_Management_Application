package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Staff_Registration;

public interface StaffAdmissionRepository extends JpaRepository<Staff_Registration, Integer>  {

}
