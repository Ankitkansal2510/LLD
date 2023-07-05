package DesignPatterns.CreationPatterns.Builder;

public class Car {

    private String carName;
    private int noOfTyre;
    private double price;

    private Car(CarBuilder carBuilder){
        this.carName=carBuilder.carName;
        this.noOfTyre=carBuilder.noOfTyre;
        this.price=carBuilder.price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", noOfTyre=" + noOfTyre +
                ", price=" + price +
                '}';
    }

    public static class CarBuilder{
        private String carName;
        private int noOfTyre;
        private double price;

        public CarBuilder setCarName(String carName){
            this.carName=carName;
            return this;
        }

        public CarBuilder setnoOfTyre(int noOfTyre){
            this.noOfTyre=noOfTyre;
            return this;
        }

        public CarBuilder setPrice(double price){
            this.price=price;
            return this;
        }

        public Car build()throws Exception{
            Car car=new Car(this);
            validate(car);
            return car;
        }

        private static void validate(Car car)throws Exception{
            if(car.noOfTyre<4){
                throw new Exception("Minimum no of tyre should be 4");
            }
        }
    }
}
