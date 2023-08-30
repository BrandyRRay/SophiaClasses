import java.text.DecimalFormat;

public class Employee extends Person {
  private int emplId;
  private double salary;
  private int vacationDaysPerYear = 14;
  private int vacationDaysRemaining;
  
  //Parameterized constructor
  public Employee(String firstName, String lastName, int emplId, String jobTitle, double salary) {
    super(firstName, lastName, emplId, jobTitle);
    this.salary = salary;
    vacationDaysRemaining = vacationDaysPerYear;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    if(salary > 0.00) {
      this.salary = salary;
    }
  }
  
  public String getSalaryAsString() {
    //Format salary with leading dollar sign and 2 decimal places
    DecimalFormat salaryFormat = new DecimalFormat("$0.00");
    //Use getSalary to get numeric value and then format
    return salaryFormat.format(getSalary());
  }
  
  //emplId cannot be changed,there is only accessor,no mutator method public
  public int getEmplId() {
    return emplId;
  }
  
  //Method to increase salary by percent as decimal. 0.02 is a 2% raise
  public void increaseSalary(double percentAsDecimal) {
    if(percentAsDecimal > 0.0) {
      this.salary *= (1 + percentAsDecimal);
    }
    else {
      System.out.println("Salary increase must be greater than 0");
    }
  }

  //Increase vacation days per year
  public void increaseVacationDaysPerYear(int days) {
    if(days > 0) {
      this.vacationDaysPerYear += days;
    }
  }

  //Increase remaining vacation days
  public void increaseVacationDaysRemaining(int days) {
    if(days > 0) {
      this.vacationDaysRemaining += days;
    }
  }

  //Use vacation days
  public void takeVacationDays(int days) {
    if(days > 0 && vacationDaysRemaining >= days) {
      this.vacationDaysRemaining -= days;
    }
    else if(days <= 0) {
      System.out.println("Requested vacation days must be greater than 0");
    }
    else {
      System.out.println("Employee doesn't have enough vacation time to take " + days + " days off");
    }
  }

  //Return # vacation days remaining
  public int getVacationDaysRemaining() {
    return vacationDaysRemaining;
  }
  /*}*/
}