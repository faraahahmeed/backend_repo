package com.example.TripScheduling.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.TripScheduling.Entities.Admin;

@Repository
public interface adminRepository extends CrudRepository<Admin, String>{
    
}
