public class Worker {
    protected String firstName;
    protected String surname;
    protected double hourlyRate;

    public Worker(String firstName, String surname, double hourlyRate) {
        this.firstName = firstName;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate;
    }
}
