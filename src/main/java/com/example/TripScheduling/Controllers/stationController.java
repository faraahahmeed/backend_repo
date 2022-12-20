package com.example.TripScheduling.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TripScheduling.Entities.Station;
import com.example.TripScheduling.Services.stationService;

@RestController
@CrossOrigin("*")
public class stationController{

    @Autowired
    private stationService stationService;

    @PostMapping("/stations")
    public void saveStation(
         @RequestBody Station station){

             stationService.saveStation(station);
        }

    @GetMapping("/stations")
    public List<Station> fetchStationList(){
        return stationService.fetchStationList();
    }

    @PutMapping("/stations/{id}")
    public Station updateStation(@RequestBody Station station, @PathVariable("id") Long stationid){
        return stationService.updateStation(station, stationid);
    }

    @DeleteMapping("stations/{id}")
    public String deleteStationById(@PathVariable("id")Long stationid){
        stationService.deleteStationById(stationid);
        return "Deleted successfully";
    }


}
