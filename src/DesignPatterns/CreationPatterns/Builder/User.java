package DesignPatterns.CreationPatterns.Builder;

/***
 * Builder design pattern is a creational design pattern that helps to construct the complex bject in a
 * step by step manner.It helps to produce different representation of the object using the same construction logic
 * .It helps in creating immutable classes having a large set of attributes
 *
 * */
public class User {

    private String firstName;
    private String lastName;
    private int age;
    private String city;
    private double income;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.city = builder.city;
        this.income = builder.income;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public double getIncome() {
        return income;
    }

    public static class UserBuilder{
        private String firstName;
        private String lastName;
        private int age;
        private String city;
        private double income;

        public UserBuilder firstName(String firstName){
            this.firstName=firstName;
            return this;
        }

        public UserBuilder lastName(String lastName){
            this.lastName=lastName;
            return this;
        }

        public UserBuilder age(int age){
            this.age=age;
            return this;
        }

        public UserBuilder city(String city){
            this.city=city;
            return this;
        }

        public UserBuilder income(double income){
            this.income=income;
            return this;
        }

        public User build(){
            User user=new User(this);
            try {
                validate(user);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return user;
        }

        private void validate(User user)throws Exception{
            if(user.getFirstName()==null || user.getLastName()==null){
                throw new Exception("First name and last name cannot be null");
            }
            System.out.println("Vallidation complete");
        }
    }
}
