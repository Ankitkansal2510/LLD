package ParkingLot.Strategy;

public class FourWheelerWeekendChargeStrategy implements ParkingStrategy{
    @Override
    public int getCharge(int parkHours) {
        if(parkHours<1){
            return 30;
        }
        return parkHours*30;
    }
}
