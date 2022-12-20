package com.example.TripScheduling.Services;

import com.example.TripScheduling.Repositories.tripRepository;
import java.util.List;
import java.util.Objects;

import com.example.TripScheduling.Entities.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tripService
{
    @Autowired
    tripRepository tripRepository;

    public Trip saveTrip(Trip trip)
    {
        return tripRepository.save(trip);
    }
 
    // Read operation
    public List<Trip> fetchTripList()
    {
        return (List<Trip>)tripRepository.findAll();
    }

    public Trip getTripById(Long tripId)
    {
        return tripRepository.findById(tripId).get();
    }
 
    // Update operation
    public Trip updateTrip(Trip trip, Long tripId)
    {
        Trip tripDB = tripRepository.findById(tripId).get();
        
        tripDB.setId(tripId);
        tripDB.setFrom_station(trip.getFrom_station());
        tripDB.setTo_station(trip.getTo_station());
        tripDB.setStart_time(trip.getStart_time());
        tripDB.setEnd_time(trip.getEnd_time());

        return tripRepository.save(trip);
    }
 
    // Delete operation
    public void deleteTripById(Long tripId)
    {
        tripRepository.deleteById(tripId);
    }
}