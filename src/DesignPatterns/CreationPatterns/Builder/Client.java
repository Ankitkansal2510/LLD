package DesignPatterns.CreationPatterns.Builder;

public class Client {

    public static void main(String[] args) throws Exception {


        User user=new User.UserBuilder().firstName("Ankit")
                                        .lastName("Kansal")
                                        .age(32)
                                        .build();

        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getAge());
        System.out.println(user.getIncome());

        User user1=new User.UserBuilder().firstName("Ankit")
                .lastName("Kansal")
                .age(32)
                .income(10000000)
                .build();

        System.out.println(user1.getFirstName());
        System.out.println(user1.getLastName());
        System.out.println(user1.getAge());
        System.out.println(user1.getIncome());

        Car car=new Car.CarBuilder().setCarName("Santro").setnoOfTyre(4).setPrice(400000).build();
        System.out.println(car);

        Car car1=new Car.CarBuilder().setCarName("dezire").setnoOfTyre(3).setPrice(400000).build();
        System.out.println(car1);
    }
}
