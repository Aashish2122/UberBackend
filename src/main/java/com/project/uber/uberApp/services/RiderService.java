package com.project.uber.uberApp.services;

import com.project.uber.uberApp.dto.DriverDTO;
import com.project.uber.uberApp.dto.RideDTO;
import com.project.uber.uberApp.dto.RideRequestDTO;
import com.project.uber.uberApp.dto.RiderDTO;

import java.util.List;

public interface RiderService {
    RideDTO cancelRide(Long rideId);
    RideRequestDTO requestRide(RideRequestDTO rideRequestDTO);


    DriverDTO rateDriver(Long rideId, Integer rating);

    RiderDTO getMyProfile();

    List<RideDTO> getAllMyRides();
}
