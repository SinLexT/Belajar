package learnprogramming.academy;

public class VipPerson {
    private String name;
    private double creditLimit;
    private String email;

    public VipPerson() {
        this("name", 0 , "test@test.com");
    }

    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "test@test.com");
    }

    public VipPerson(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public Double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
