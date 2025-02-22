package com.project.uber.uberApp.services;

import com.project.uber.uberApp.dto.DriverDTO;
import com.project.uber.uberApp.dto.RideDTO;
import com.project.uber.uberApp.dto.RiderDTO;

import java.util.List;

public interface DriverService {

    RideDTO cancelRide(Long rideId);
    RideDTO acceptRide(Long rideId);

    RideDTO startRide(Long rideId);
    RideDTO endRide(Long rideId);

    RiderDTO rateRider(Long rideId, Integer rating);

    DriverDTO getMyProfile();

    List<RideDTO> getAllMyRides();
}
