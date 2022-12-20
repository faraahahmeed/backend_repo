package com.example.TripScheduling.Entities;

import java.sql.Date;

// Importing required classes

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;

// Annotations
@Entity
@Table(name = "trips")
public class Trip {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date start_time;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date end_time;

    private int from_station;
    private int to_station;
   
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getStart_time() {
        return start_time;
    }
    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }
    public Date getEnd_time() {
        return end_time;
    }
    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }
    public int getFrom_station() {
        return from_station;
    }
    public void setFrom_station(int from_station) {
        this.from_station = from_station;
    }
    public int getTo_station() {
        return to_station;
    }
    public void setTo_station(int to_station) {
        this.to_station = to_station;
    }

}
