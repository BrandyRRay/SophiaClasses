public class EmployeeProgram {
  public static void main(String[] args) {
    Employee empl = new Employee("Jack", "Kitchen", 1000, "Manager", 75000);
    System.out.println("First name: " + empl.getFirstName());
    System.out.println("Last name: " + empl.getLastName());
    System.out.println("Employee ID: " + empl.getEmplId());
    System.out.println("Job Title: " + empl.getJobTitle());
    System.out.println("Salary: " + empl.getSalaryAsString());
    //Now display vacation information:
    System.out.println("Vacation days: " + empl.getVacationDaysRemaining());
    System.out.println("Taking 7 days of vacation.......");
    empl.takeVacationDays(7);
    System.out.println("Vacation days: " + empl.getVacationDaysRemaining());
    System.out.println("Taking 10 more days of vacation..........");
    empl.takeVacationDays(10);
    System.out.println("Vacation days: " + empl.getVacationDaysRemaining());
    System.out.println("Working on the weekend");
    empl.takeVacationDays(-1);
    System.out.println("Vacation days: " + empl.getVacationDaysRemaining());
    System.out.println("I got bonus vacation!..............");
    empl.increaseVacationDaysRemaining(14);
    System.out.println("Vacation days: " + empl.getVacationDaysRemaining());
  }
}