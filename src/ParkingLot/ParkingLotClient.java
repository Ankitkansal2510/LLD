package ParkingLot;

import ParkingLot.Exception.ParkingFullException;
import ParkingLot.Model.Ticket;
import ParkingLot.Model.Vehicle;
import ParkingLot.Model.VehicleSize;
import ParkingLot.Service.ParkingLot;
import ParkingLot.Strategy.FourWheelerWeekDayChargeStrategy;
import ParkingLot.Strategy.TwoWheelerWeekDayChargeStrategy;

public class ParkingLotClient {


    public static void main(String[] args) throws ParkingFullException {



        ParkingLot parkingLot = ParkingLot.getParkingLot();

        parkingLot.initializeParkingSlots(10, 10);

        Vehicle vehicle = new Vehicle("Mh12", VehicleSize.TWOWHEELER);

        Ticket ticket = parkingLot.park(vehicle);
        System.out.println(ticket);

        Vehicle vehicle2 = new Vehicle("Mh13", VehicleSize.FOURWHEELER);

        Ticket ticket2 = parkingLot.park(vehicle2);
        System.out.println(ticket2);

        int cost1 = parkingLot.unPark(ticket, new TwoWheelerWeekDayChargeStrategy());
        System.out.println(cost1);

        int cost2 = parkingLot.unPark(ticket2, new FourWheelerWeekDayChargeStrategy());
        System.out.println(cost2);
    }
}
