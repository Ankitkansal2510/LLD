package ParkingLot.Service;

import ParkingLot.Exception.InvalidVehicleNumberException;
import ParkingLot.Exception.ParkingFullException;
import ParkingLot.Model.*;
import ParkingLot.Strategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkingLot implements Parking {

    private static ParkingLot parkingLot;
    private final List<Slot> twoWheelerSlots;
    private final List<Slot> fourWheelerSlots;

    private ParkingLot() {
        this.twoWheelerSlots = new ArrayList<>();
        this.fourWheelerSlots = new ArrayList<>();
    }

    public static ParkingLot getParkingLot(){
        if(parkingLot==null){
            parkingLot=new ParkingLot();
        }
        return parkingLot;
    }

    public boolean initializeParkingSlots(int numberOfTwoWheelerParkingSlots, int numberOfFourWheelerParkingSlots) {

        for (int i = 1; i <= numberOfTwoWheelerParkingSlots; i++) {
            twoWheelerSlots.add(new Slot(i));
        }

        System.out.printf("Created a two wheeler parking lot with %s slots %n", numberOfTwoWheelerParkingSlots);

        for (int i = 1; i <= numberOfFourWheelerParkingSlots; i++) {
            fourWheelerSlots.add(new Slot(i));
        }

        System.out.printf("Created a four wheeler parking lot with %s slots %n", numberOfFourWheelerParkingSlots);
        return true;
    }
    @Override
    public Ticket park(Vehicle vehicle) throws ParkingFullException {
        Slot nextAvailableSlot;
        if(vehicle.getVehicleSize().equals(VehicleSize.FOURWHEELER)){
            nextAvailableSlot=getNextAvailableFourWheelerSlot();
        }else{
            nextAvailableSlot=getNextAvailableTwoWheelerSlot();
        }
        nextAvailableSlot.occupySlot(vehicle);

        Ticket ticket=new Ticket(nextAvailableSlot.getSlotNumber(), vehicle.getVehicleNumber(),
                            new Date(),vehicle.getVehicleSize());
        return ticket;
    }

    @Override
    public int unPark(Ticket ticket, ParkingStrategy parkingCostStrategy) throws ParkingFullException {
        int costByHours = 0;
        Slot slot;
        try {
            if (ticket.getVehicleSize().equals(VehicleSize.FOURWHEELER)) {
                slot = getFourWheelerSlotByVehicleNumber(ticket.getVehicaleNumber());
            } else {
                slot = getTwoWheelerSlotByVehicleNumber(ticket.getVehicaleNumber());
            }
            slot.vacateSlot();
            int hours = getHoursParked(ticket.getDate(), new Date());
            costByHours = parkingCostStrategy.getCharge(hours);
            System.out.println(
                    "Vehicle with registration " + ticket.getVehicaleNumber() + " at slot number " + slot.getSlotNumber()
                            + " was parked for " + hours + " hours and the total charge is " + costByHours);
        } catch (InvalidVehicleNumberException invalidVehicleNumber) {
            System.out.println(invalidVehicleNumber.getMessage());
        }
        return costByHours;

        ///ANKIT
    }

    private int getHoursParked(Date startDate, Date endDate) {
        long secs = (endDate.getTime() - startDate.getTime()) / 1000;
        int hours = (int) (secs / 3600);
        return hours;

    }

    private Slot getTwoWheelerSlotByVehicleNumber(String vehicaleNumber) throws InvalidVehicleNumberException {

        for(Slot slot:twoWheelerSlots){
            if(slot.getParkVehicle().getVehicleNumber().equals(vehicaleNumber)){
                return slot;
            }
        }
        throw new InvalidVehicleNumberException("Car with this vehciale number not available");
    }

    private Slot getFourWheelerSlotByVehicleNumber(String VehicleNumber) throws InvalidVehicleNumberException {
        for(Slot slot:fourWheelerSlots){
            if(slot.getParkVehicle().getVehicleNumber().equals(VehicleNumber)){
                return slot;
            }
        }
        throw new InvalidVehicleNumberException("Car with this vehciale number not available");
    }

    public Slot getNextAvailableFourWheelerSlot()throws ParkingFullException{
        for(Slot slot:fourWheelerSlots){
            if(slot.isEmpty()){
                return slot;
            }
        }
        throw new ParkingFullException("Parking spot is full");
    }

    public Slot getNextAvailableTwoWheelerSlot()throws ParkingFullException{
        for(Slot slot:twoWheelerSlots){
            if(slot.isEmpty()){
                return slot;
            }
        }
        throw new ParkingFullException("Parking spot is full");
    }
}
