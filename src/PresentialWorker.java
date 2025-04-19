public class PresentialWorker extends Worker {
    private static double fuelAllowance = 100.0; // static attribute

    public PresentialWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * hourlyRate) + fuelAllowance;
    }

    @Deprecated
    public void goingToTheOffice() {
        System.out.println(firstName+" "+ surname + " is going to the office");
    }
}