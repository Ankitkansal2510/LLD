package ParkingLot.Model;

import ParkingLot.Exception.ParkingFullException;
import ParkingLot.Strategy.ParkingStrategy;

public interface Parking {

    public Ticket park(Vehicle vehicle) throws ParkingFullException;

    public int unPark(Ticket ticket, ParkingStrategy parkingCostStrategy) throws ParkingFullException;
}
