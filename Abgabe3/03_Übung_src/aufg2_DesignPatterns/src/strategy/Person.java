package strategy;

public class Person {
    private String firstName;
    private String lastName;
    private String city;

    public Person(String firstName, String lastName, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " from " + city;
    }
}
