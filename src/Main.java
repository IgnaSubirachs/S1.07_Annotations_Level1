public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Worker baseWorker = new Worker("John", "Smith", 15.0);
        OnlineWorker onlineWorker = new OnlineWorker("Laura", "Perez", 20.0);
        PresentialWorker presentialWorker = new PresentialWorker("John", "Smith", 15.0);

        int hoursWorked = 160;

        System.out.println("Base Worker Salary: " + baseWorker.calculateSalary(hoursWorked));
        System.out.println("Online Worker Salary: " + onlineWorker.calculateSalary(hoursWorked));
        System.out.println("Onsite Worker Salary: " + presentialWorker.calculateSalary(hoursWorked));

        //Ex.2
        onlineWorker.connectingToInternet();
        presentialWorker.goingToTheOffice();


    }
}
