package com.project.uber.uberApp.strategies;

import com.project.uber.uberApp.dto.RideRequestDTO;

public interface RideFareCalculationStrategy {

    Double calculateFare(RideRequestDTO rideRequestDTO);
}
