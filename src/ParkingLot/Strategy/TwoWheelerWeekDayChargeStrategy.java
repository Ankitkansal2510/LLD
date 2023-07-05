package ParkingLot.Strategy;

public class TwoWheelerWeekDayChargeStrategy implements ParkingStrategy{
    @Override
    public int getCharge(int parkHours) {
        if(parkHours<1){
            return 10;
        }

        return parkHours*10;
    }
}
