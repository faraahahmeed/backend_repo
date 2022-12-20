package com.example.TripScheduling.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.TripScheduling.Entities.Trip;
import com.example.TripScheduling.Services.tripService;

import java.util.List;

@RestController
@CrossOrigin("*")
public class tripController {

    @Autowired 
    private tripService tripService;
 
    // Save operation
    @PostMapping("/trips")
    public Trip saveTrip(
        @RequestBody Trip trip)
    {
        return tripService.saveTrip(trip);
    }
 
    // Read operation
    @GetMapping("/trips")
    public List<Trip> fetchTripList()
    {
        return tripService.fetchTripList();
    }

	@GetMapping("/trips/{id}")
	public Trip getTripById(@PathVariable("id") Long tripId) {
		return tripService.getTripById(tripId);
	}

    // Update operation
    @PutMapping("/trips/{id}")
    public Trip updateTrips(@RequestBody Trip trip, @PathVariable("id") Long tripId)
    {
        return tripService.updateTrip(trip, tripId);
    }
 
    // Delete operation
    @DeleteMapping("/trips/{id}")
    public void deleteTripById(@PathVariable("id") Long tripId)
    {
        tripService.deleteTripById(tripId);
    }

}
