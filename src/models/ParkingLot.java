package models;

import models.status.ParkingLotStatus;

import java.util.List;

public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private List<Vehicle> vehicles;

    private ParkingLotStatus status;
}