package com.example.TripScheduling.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TripScheduling.Entities.Trip;

@Repository
public interface tripRepository extends JpaRepository<Trip, Long> {
    
}
