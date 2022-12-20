package com.example.TripScheduling.Services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TripScheduling.Entities.Station;
import com.example.TripScheduling.Repositories.stationRepository;

@Service
public class stationService{

    @Autowired
    private stationRepository stationRepository;

    public Station saveStation(Station station){
        return stationRepository.save(station);
    }

    public List<Station> fetchStationList(){
        return (List<Station>)stationRepository.findAll();
    }

    public Station updateStation(Station station, Long stationid){
        Station stationDB = stationRepository.findById(stationid).get();

        if(Objects.nonNull(station.getName())&& !"".equalsIgnoreCase(station.getName())){
            stationDB.setName(station.getName());
        }
        return stationRepository.save(stationDB);
    }

    public void deleteStationById(Long stationid){
        stationRepository.deleteById(stationid);
    }
}
