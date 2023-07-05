package ParkingLot.Model;

import java.util.Date;

public class Ticket {

    private int SlotNumber;
    private String VehicaleNumber;
    private Date date;
    private VehicleSize vehicleSize;

    public Ticket(int slotNumber, String vehicaleNumber, Date date, VehicleSize vehicleSize) {
        SlotNumber = slotNumber;
        VehicaleNumber = vehicaleNumber;
        this.date = date;
        this.vehicleSize = vehicleSize;
    }

    public int getSlotNumber() {
        return SlotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        SlotNumber = slotNumber;
    }

    public String getVehicaleNumber() {
        return VehicaleNumber;
    }

    public void setVehicaleNumber(String vehicaleNumber) {
        VehicaleNumber = vehicaleNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }

    public void setVehicleSize(VehicleSize vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "SlotNumber=" + SlotNumber +
                ", VehicaleNumber='" + VehicaleNumber + '\'' +
                ", date=" + date +
                ", vehicleSize=" + vehicleSize +
                '}';
    }
}
