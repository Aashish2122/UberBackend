package com.project.uber.uberApp.strategies.impl;


import com.project.uber.uberApp.dto.RideRequestDTO;
import com.project.uber.uberApp.strategies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RiderFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public Double calculateFare(RideRequestDTO rideRequestDto) {
        return 0.0;
    }
}
