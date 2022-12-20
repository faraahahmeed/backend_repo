package com.example.TripScheduling.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TripScheduling.Entities.Station;

@Repository
public interface stationRepository extends JpaRepository<Station, Long> {

}
