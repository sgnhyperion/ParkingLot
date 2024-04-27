package models;

import models.enums.VehicleType;
import models.status.GateStatus;

import java.util.List;

public class ParkingSpot extends BaseModel{
    private int spotNumber ;
    private List<VehicleType> vehicles;
    private GateStatus status;
    private ParkingFloor parkingFloor;

}
