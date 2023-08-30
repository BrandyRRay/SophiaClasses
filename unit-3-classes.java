//Note that the class is explicitly marked public
public class Dog {
  //Private attributes
  private String name;
  private String breed;
  private int age;
  private String color;

  //Public constructor with parameters
  public Dog(String name, String breed, int age, String color) {
    this.name = name;
    this.breed = breed;
    this.age = age;
    this.color = color;
  }

  //Accessor methods to provide read access to data in attributes
  public String getName() {
    return name;
  }

  public String getBreed() {
    return breed;
  }

  public int getAge() {
    return age;
  }

  public String getColor() {
    return color;
  }

  //Methods for behaviors
  public void bark() {
    System.out.println("Woof!");
  }
  
  public void fetch() {
    System.out.println(name + " went to fetch.");
  }
}


public class DogExample {
  public static void main(String[] args) {
    //Call constructor using keyword new. Assign new Dog object to variable myDog.
    //Class names starts with capital letter but variable name starts with lowercase
    Dog myDog = new Dog("Sarge", "German Shepard", 2, "Brown");
    //Call "get" methods to access data. All methods called via the Dog object created above
    System.out.println("Name: " + myDog.getName());
    System.out.println("Breed: " + myDog.getBreed());
    System.out.println("Age: " + myDog.getAge());
    System.out.println("Color: " + myDog.getColor());
    System.out.print(myDog.getName() + " says ");
    //Call bark() method
    myDog.bark();
  }
}



import java.time.LocalDate;
//import java.util.LocalDate;
import java.text.DecimalFormat;

public class Employee {
  private String firstName;
  private String lastName;
  private int emplId;
  private String jobTitle;
  private double salary;
  private LocalDate hireDate;
  
  //Parameterized constructor
  public Employee(String firstName, String lastName, int emplId, String jobTitle, double salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.emplId = emplId;
    this.jobTitle = jobTitle;
    this.salary = salary;
    this.hireDate = LocalDate.now();
  }

  //Return first name
  public String getFirstName() {
    return firstName;
  }

  //Set value of attribute firstName to value passed as parameter firstName
  public void setFirstName(String firstName) {
    if(firstName.length() > 0) {
      this.firstName = firstName;
    }
  }

    //Return last name
  public String getLastName() {
    return lastName;
  }

  //Set value of attribute lastName to value passed as parameter lastName
  public void setLastName(String lastName) {
    if(lastName.length() > 0) {
      this.lastName = lastName;
    }
  }

    //Return job title
  public String getJobTitle() {
    return jobTitle;
  }

  //Set value of attribute jobTitle to value passed as parameter jobTitle
  public void setJobTitle(String jobTitle) {
    if(jobTitle.length() > 0) {
      this.jobTitle = jobTitle;
    }
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

  //Method to increase salary by percent as decimal. 0.02 is a 2% raise
  public void increaseSalary(double percentAsDecimal) {
    if(percentAsDecimal > 0.0) {
      this.salary *= (1 + percentAsDecimal);
    }
    else {
      System.out.println("Salary increase must be greater than 0");
    }
  }

    //emplId cannot be changed,there is only accessor,no mutator method public
  public int getEmplId() {
    return emplId;
  }
}



public class EmployeeProgram {
  public static void main(String[] args) {
    Employee empl = new Employee("Jack", "Kitchen", 1000, "Manager", 75000);
    System.out.println("First name: " + empl.getFirstName());
    System.out.println("Last name: " + empl.getLastName());
    System.out.println("Employee ID: " + empl.getEmplId());
    System.out.println("Job Title: " + empl.getJobTitle());
    System.out.println("Salary: " + empl.getSalaryAsString());
  }
}



public class EmployeeExample {
  public static void main(String[] args){
    UserAccount account = new UserAccount("Blooo", "TestTest123");
    System.out.println("Result from calling account.toString(): ");
    System.out.println(account.toString());
  }
}



class PeopleCounterProgram {

  public static void main(String[] args) {
    //Construct a PeopleCounter
    PeopleCounter pc = new PeopleCounter();
    //Count 3 people one by one - left as same
    pc.anotherOne();
    pc.anotherOne();
    pc.anotherOne();
    System.out.println("Calling countUsingParameter(): ");
    countUsingParameter(pc);
    System.out.println("Using original PeopleCounter pc: ");
    pc.anotherOne();
  }

  public static void countUsingParameter(PeopleCounter counter) {
    System.out.println("Now in countWithReturn()");
    counter.anotherOne();
    System.out.println("Leaving countWithReturn()");
  }
}



public class PeopleCounter {
  private long count = 0;

  public void anotherOne() {
    count++;
    System.out.println("So far " + count);
  }
}



public class User {
  private String userName;
  private String password;

  public User(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  //Allow read-only access to user name
  public String getUserName() {
    return userName;
  }

  //There is no direct access to the password.
  //In real code there would be a method check for a match with the stored password.
}



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserAccount {
  private String userName;
  private String password;
  private LocalDate dateJoined; //= LocalDate.now();
  private boolean activeUser; //= true;
  //private boolean checkCredentials; //added

  public UserAccount(String userName, String password) {
    this.userName = userName;
    this.password = password;
    this.dateJoined = LocalDate.now();
    this.activeUser = true;
  }

  //Added
  //public boolean checkCredentials(String userName, String password) {
    //return this.userName.equals(userName) && this.password.equals(password);
  //}

  //Allow read-only access to user name
  public String getUserName() {
    return userName;
  }

  //Allow read-only access to date joined
  public LocalDate getDateJoined() {
    return dateJoined;
  }

  //Allow activeUser to be read & set (can change)
  public boolean isActiveUser() {
    return activeUser;
  }

  public void setActiveUser(boolean activeUser) {
    this.activeUser = activeUser;
  }

  public String toString() {
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/YYYY");
    String state = "UserName: " + userName + "\n";
    state += "password: " + password + "\n";
    state += "dateJoined: " + dateFormat.format(dateJoined) + "\n";
    state += "activeUser: " + activeUser + "\n";
    return state;
  }
}




public class UserAccountEx {
  public static void main(String[] args) {
    UserAccount account = new UserAccount("Bleu", "mypass");
    account.setActiveUser(false);
    System.out.println("User name: " + account.getUserName());
    System.out.println("Is active user?: " + account.isActiveUser());
    System.out.println("Date joined: " + account.getDateJoined());
  }
}



public class UserAccountExample {
  public static void main(String[] args) {
    UserAccount account = new UserAccount("Bloue", "TestTestTest");
    if(account.isActiveUser()) {
      System.out.println(account.getUserName() + " is active");
    }
    else {
      System.out.println(account.getUserName() + " is not active");
    }
    //Added for debug
    System.out.println("\nDebug info:\n" + account.toString());
  }
}



class UserExample {
  public static void main(String[] args) {
    User account = new User("Blue", "mypass");
    System.out.println("Account created for " + account.getUserName());
  }
}




import java.util.Scanner;

class UserLoginExample {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Create New User account: ");
    System.out.print("Enter User Name: ");
    String user = input.nextLine();
    System.out.print("Enter password: ");
    String passwd = input.nextLine();

    System.out.println("Creating account....");
    UserAccount acct = new UserAccount(user, passwd);

    System.out.println("Now check the login: ");
    System.out.print("Enter user name: ");
    String userToCheck = input.nextLine();
    System.out.print("Enter the password: ");
    String passwordToCheck = input.nextLine();

    boolean result = acct.checkCredentials(userToCheck, passwordToCheck);
    if(result) {
      System.out.println("Login successful");
    }
    else {
      System.out.println("Login failed");
    }
  }
}



import java.time.LocalDate;

public class Member {
  private String firstName;
  private String lastName;
  private int expiryDays = 365;
  private LocalDate expiryDate;

  public Member(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    expiryDate = LocalDate.now().plusDays(expiryDays);
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public LocalDate getExpiryDate() {
    return expiryDate;
  }

  public String getStatus() {
    return firstName + " " + lastName + " is a member";
  }
}



class MemberProgram {
  public static void main(String[] args) {
    Member testMember = new Member("Blhoo", "Coffee");
    System.out.println("First name: " + testMember.getFirstName());
    System.out.println("Last name: " + testMember.getLastName());
    System.out.println("Exp. date: " + testMember.getExpiryDate());
  }
}



import java.time.LocalDate;

//Subclass of Member for administrators
public class Admin extends Member {
  private int expiryDays = 100 * 365;
  private LocalDate expiryDate;
  private String secret;
  
  public Admin(String firstName, String lastName, String secret) {
    super(firstName, lastName);
    expiryDate = LocalDate.now().plusDays(expiryDays);
    this.secret = secret;
  }

  @Override
  public LocalDate getExpiryDate() {
    return expiryDate;
  }

  public String getSecret() {
    return secret;
  }

  public String getStatus() {
    return getFirstName() + " " + getLastName() + " is an Admin.";
  }
}



public class User2 extends Member {
  public User2(String firstName, String lastName) {
    super(firstName, lastName);
  }
  
  /*public String getStatus() {
    return getFirstName() + " " + getLastName() + " is an Admin.";
  } */

    /* @Override
  public String getStatus() {
    // Need to use inherited methods to get name
    return getFirstName() + " " + getLastName() + " is a User.";
  } */
}



public class MemberInherit {
  public static void main(String[] args) {
    Member testMember = new Member("OutOfBloos", "Mocha");
    System.out.println("First Name: " + testMember.getFirstName());
    System.out.println("Last Name: " + testMember.getLastName());
    System.out.println("Exp. Date: " + testMember.getExpiryDate());
    System.out.println(testMember.getStatus());
    System.out.println("--------------------");
    
    Admin testAdmin = new Admin("root", "admin", "ABRACADABRABALOO");
    System.out.println("First Name: " + testAdmin.getFirstName());
    System.out.println("Last Name: " + testAdmin.getLastName());
    System.out.println("Exp. Date: " + testAdmin.getExpiryDate());
    System.out.println(testAdmin.getStatus());
    System.out.println("--------------------");
    
    User2 testUser2 = new User2("Artie", "Smith");
    System.out.println("First Name: " + testUser2.getFirstName());
    System.out.println("Last Name: " + testUser2.getLastName());
    System.out.println("Exp. Date: " + testUser2.getExpiryDate());
    System.out.println(testUser2.getStatus());
  }
}



class AdminUserTest {
  public static void main(String[] args) {
    Admin testAdmin = new Admin("root", "admin", "ABRACADABRABALOO");
    System.out.println("First name: " + testAdmin.getFirstName());
    System.out.println("Last name: " + testAdmin.getLastName());
    System.out.println("Secret code: " + testAdmin.getSecret());
    System.out.println("Exp. date: " + testAdmin.getExpiryDate());

    System.out.println("-------------------------------");

    User2 testUser2 = new User2("Artie", "Smith");
    System.out.println("First name: " + testUser2.getFirstName());
    System.out.println("Last name: " + testUser2.getLastName());
    System.out.println("Exp. date: " + testUser2.getExpiryDate());
  }
}



import java.text.DecimalFormat; //Needed for price

public interface Beverage {
  //Shared constant for price format. Available to all classes that implement the Beverage interface.
  final DecimalFormat PriceFormat = new DecimalFormat("$0.00");

  //Common methods
  String getName(); //Coffee, tea, etc...
  int getSize(); //Size in oz
  double getPrice(); //Price in $$
}



public class Coffee implements Beverage {
  private String roastType;
  private int size;
  private boolean decaf;
  private double price;

  public Coffee(String roastType, int size, boolean decaf, double price) {
    this.roastType = roastType;
    this.size = size;
    this.decaf = decaf;
    this.price = price;
  }

  //Required by Beverage interface
  public String getName() {
    return "coffee";
  }

  //Required by Beverage interface
  public int getSize() {
    return size;
  }

  //Required by Beverage interface
  public double getPrice() {
    return price;
  }

  public boolean isDecaf() {
    return decaf;
  }

  @Override //toString inherited from Java Object base class
  public String toString() {
    //PriceFormat is constant provided by Beverage interface
    String item = roastType + " coffee (" + size + " oz.) " + PriceFormat.format(price);
    if(decaf) {
      return "decaf " + item;
    }
    else {
      return item;
    }
  }
}



public class Tea implements Beverage {
  private String teaType;
  private int size;
  private boolean iced;
  private double price;

  public Tea(String teaType, int size, boolean iced, double price) {
    this.teaType = teaType;
    this.size = size;
    this.iced = iced;
    this.price = price;
  }

  public String getName() {
    return "tea";
  }

  public int getSize() {
    return size;
  }

  public double getPrice() {
    return price;
  }

  public boolean isIced() {
    return iced;
  }

  public String toString() {
    String item = teaType + " tea (" + size + " oz.) " + PriceFormat.format(price);
    if(iced) {
      return "iced " + item;
    }
    else {
      return "hot " + item;
    }
  }
}



import java.text.DecimalFormat; //Needed for price

public class Beverage {
  private String name;
  private int size;
  private double price;
  //The DecimalFormat for the price format is a rare public attribute, but since it's
  //final, the object is constant so it can't be modified (even though it's public)
  public final DecimalFormat PriceFormat = new DecimalFormat("$0.00");

  Beverage(String name, int size, double price) {
    this.name = name;
    this.size = size;
    this.price = price;
  }
  
  public String getName() {
    return name;
  } //Coffee, tea, etc...
  
  public int getSize() {
    return size;
  } //Size in oz
  
  public double getPrice() {
    return price;
  } //Price in $$
}



public class Coffee {
  //Embedded beverage object
  private Beverage beverage;
  private String roastType;
  private boolean decaf;

  public Coffee(String roastType, int size, boolean decaf, double price) {
    //Construct the embedded beverage object
    this.beverage = new Beverage("coffee", size, price);
    this.roastType = roastType;
    this.decaf = decaf;
  }

  //The Coffee class's getName() calls the embedded object's getName() 
  public String getName() {
    return beverage.getName();
  }

  //The Coffee class's getName() calls the embedded object's getSize()
  public int getSize() {
    return beverage.getSize();
  }

  //The Coffee class's getName() calls the embedded object's getPrice() 
  public double getPrice() {
    return beverage.getPrice();
  }

  public String getRoastType() {
    return roastType;
  }

    public boolean isDecaf() {
    return decaf;
  }

  public String toString() {
    //Calls to accessor methods to access data in embedded Beverage object
    String item = roastType + " coffee (" + getSize() + " oz.) " + beverage.PriceFormat.format(getPrice());
    if(decaf) {
      return "decaf " + item;
    }
    else {
      return item;
    }
  }
}



public class Tea {
  private Beverage beverage;
  private String teaType;
  private boolean iced;

  public Tea(String teaType, int size, boolean iced, double price) {
    //Construct the embedded Beverage object
    this.beverage = new Beverage("tea", size, price);
    this.teaType = teaType;
    this.iced = iced;
  }

  //The Tea class's getName() calls the embedded object's getName()
  public String getName() {
    return beverage.getName();
  }

  //The Tea class's getSize() calls the embedded object's getSize()
  public int getSize() {
    return beverage.getSize();
  }

  //The Tea class's getPrice() calls the embedded object's getPrice()
  public double getPrice() {
    return beverage.getPrice();
  }
  
  public String getTeaType() {
    return teaType;
  }
  
  public boolean isIced() {
    return iced;
  }

  public String toString() {
    //Note use of accessor methods that forward calls to get info from embedded object
    String item = teaType + " tea (" + getSize() + " oz.) " + beverage.PriceFormat.format(getPrice());
    if(iced) {
      return "iced " + item;
    }
    else {
      return "hot " + item;
    }
  }
}



import java.util.ArrayList;

public class DrinkOrder {
  //ArrayList can hold both Coffee & Tea objects since both implement the Beverage interface
  private ArrayList<Beverage> order = new ArrayList<>();

  //add() method accepts an object any class that implements Beverage interface
  public void add(Beverage beverage) {
    order.add(beverage);
  }

  //Add total for order
  public double getTotalPrice() {
    double total = 0;
    for(Beverage beverage : order) {
      total += beverage.getPrice();
    }
    return total;
  }

  //Return ArrayList of Beverages in order
  public ArrayList<Beverage> getOrder() {
    return order;
  }
}



class InterfaceExample {
  public static void main(String[] args) {
    //Create order and add drinks
    DrinkOrder toGoOrder = new DrinkOrder();
    Coffee coffee = new Coffee("dark roast", 20, false, 2.09);
    toGoOrder.add(coffee);
    Tea greenTea = new Tea("green", 16, false, 1.59);
    toGoOrder.add(greenTea);
    Tea blackTea = new Tea("black", 8, true, 1.29);
    toGoOrder.add(blackTea);

    //Number to use for numbered list of drinks in order
    int itemNumber = 1;
    System.out.println("Here's your order: ");
    //getOrder() returns ArrayList<Beverage>
    for(Beverage bev : toGoOrder.getOrder()) {
      System.out.println("\t" + itemNumber++ + ", " + bev);
    }

    System.out.println("\nOrder Total: " + Beverage.PriceFormat.format(toGoOrder.getTotalPrice()));
    //Note how Beverage.PriceFormat can be used here, too
  }
}



class CompositionExample {
  public static void main(String[] args) {
    //Construct Coffee & Tea objects that have a Beverage objet embedded in them.
    //There's nothing unusual about the constructor calls.
    Coffee darkRoastCoffee = new Coffee("dark roast", 20, false, 2.59);
    Tea blackTea = new Tea("black", 16, false, 2.00);
    //Print out information about the drinks using their toString() methods
    System.out.println(darkRoastCoffee);
    System.out.println(blackTea);
  }
}



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



import java.time.LocalDate;

public class Person {
  private String firstName;
  private String lastName;
  private String jobTitle;
  private LocalDate hireDate;

  //Parameterized constructor
  public Person(String firstName, String lastName, int emplId, String jobTitle) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.jobTitle = jobTitle;
    this.hireDate = LocalDate.now();
  }

  //Returns the first name
  public String getFirstName() {
    return firstName;
  }

  //Sets the value of attribute firstName to value passed as parameter firstName
  public void setFirstName(String firstName) {
    if(firstName.length() > 0) {
      this.firstName = firstName;
    }
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    if(lastName.length() > 0) {
      this.lastName = lastName;
    }
  }

  public String getJobTitle() {
    return jobTitle;
  }
  
  public void setJobTitle(String jobTitle) {
    if(jobTitle.length() > 0) {  
      this.jobTitle = jobTitle;
    }
  }
}



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



public class Contractor extends Person {
   int contractorId;
   double hourlyWage;
   double totalWage;
    
   public Contractor(String firstName, String lastName, int contractorId, String jobTitle, double hourlyWage) {
     super(firstName, lastName, contractorId, jobTitle);
     this.contractorId = contractorId;
     this.hourlyWage = hourlyWage;
   }
    
   public int getContractorId() {
     return contractorId;
   }
    
   public double getHourlyWage() {
     return hourlyWage;
   }
   public void setHourlyWage(double hourlyWage) {
     if(hourlyWage > 0) {
       this.hourlyWage = hourlyWage;
     }
  } 
}



import java.text.DecimalFormat;

class ContractorProgram {
  public static void main(String[] args) {
    Contractor contractor = new Contractor("Temporary", "Employee", 2, "Developer", 60.00);
    System.out.println("First name: " + contractor.getFirstName());
    System.out.println("Last name: " + contractor.getLastName());
    System.out.println("Contractor ID: " + contractor.getContractorId());
    System.out.println("Job title: " + contractor.getJobTitle());
    DecimalFormat wageFormat = new DecimalFormat("$0.00");
    System.out.println("Hourly wage: " + wageFormat.format(contractor.getHourlyWage()));
    System.out.println("Setting hourly wage to $50.00.....");
    contractor.setHourlyWage(50.00);
    System.out.println("Hourly wage: " + wageFormat.format(contractor.getHourlyWage()));
  }
}



import java.io.File;
 
public class FileExample {
  public static void main(String[] args) {
    File poemFile = new File("poem.txt");
    System.out.println("File Information: ");
    System.out.println("File Name: " + poemFile.getName());
    System.out.println("File Path: " + poemFile.getPath());
    System.out.println("Full Path: " + poemFile.getAbsolutePath());
    System.out.println("File Size: " + poemFile.length());
    System.out.println("Can Read: " + poemFile.canRead());
    System.out.println("Can Write: " + poemFile.canWrite());
    System.out.println("Can Execute: " + poemFile.canExecute());
    
  }  
}




//include a file, "poem.txt"



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileExample {
  public static void main(String[] args) {
    //FIle object for text file
    File poemFile = new File("poem.txt");
    try {
      //Files.readAllLines() reads entire file & puts lines in the List<String>
      List<String> lines = Files.readAllLines(poemFile.toPath());
      //Loop through the list and print out the lines
      for(String line : lines) {
        System.out.println(line);
      }
    }
    //If Files.readAllLines() can't find or read file, it throws an IOException
    catch(IOException ex) {
      System.out.println("Error accessing file: " + ex.getMessage());
    }
  }
}



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerExample {
  public static void main(String[] args) {
    //Scanner can read from File pointing to file
    File poemFile = new File("poem.txt");
    int lineCount = 0;

    try {
      //Throws FileNotFoundException if file not found
      Scanner fileScanner = new Scanner(poemFile);
      //while loop runs as long another line is available
      while(fileScanner.hasNextLine()) {
        //Read line as String
        String line = fileScanner.nextLine();
        lineCount++;
      }
      //Must close Scanner when reading from a file.
      fileScanner.close();
      System.out.println("Line count: " + lineCount);
    }
    catch(FileNotFoundException ex) {
      System.out.println("Error accessing file: " + ex.getMessage());
    }
  }
}



import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class WriteTextToFile {
  public static void main(String[] args) {
    //Create ArrayList of Strings & add lines of text
    ArrayList<String> lines = new ArrayList<>();
    lines.add("Line 1");
    lines.add("Line 2");
    lines.add("Line 3");
    //File object pointing to output.txt file (which may not exist yet)
    File outputFile = new File("output.txt");

    try {
      //StandardOpenOption.CREATE creates a new file. It will create the file if it doesn't exist or overwrite it if it does. 
      Files.write(outputFile.toPath(), lines, StandardOpenOption.CREATE);
    }
    catch(IOException ex) {
      System.out.println("Error writing to file: " + ex.getMessage());
    }
  }
}



import java.io.*;
import java.nio.*;
import java.nio.file.*;
//import java.util.ArrayList;

class WriteStringToFile {
  public static void main(String[] args) {
    File output = new File("output.txt");
    try {
      //Try writing 2 lines to the file in StandardOpenOption.CREATE mode
      Files.writeString(output.toPath(), "Hello ya'll", StandardOpenOption.CREATE);
      Files.writeString(output.toPath(), "bargin chow butt bombs", StandardOpenOption.CREATE);
    }
    catch(IOException ex) {
      System.out.println("Error: " + ex.getMessage());
    }
  }
}



import java.io.*;
import java.nio.*;
import java.nio.file.*;

class AppendStringToFile {
  public static void main(String[] args) {
    File output = new File("output.append.txt");
    try {
      //Use both StandardOpenOption.CREATE and StandardOpenOption.APPEND so that file is created if it doesn't exist. If the file already exists, text is appended.
      Files.writeString(output.toPath(), "Hello ya'll\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
    catch(IOException ex) {
      System.out.println("Error: " + ex.getMessage());
    }
  }
}



import java.io.*;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

public class WriteNumbersToFile {

  public static void main(String[] args) {
    ArrayList<Integer> years = new ArrayList<>();
    years.add(1975);
    years.add(1979);
    years.add(1983);
    File numbersOutput = new File("years.txt");
    //Iterate over ArrayList of years
    for(int year : years) {
      try {
        //Use Integer.toString() to convert years to strings. Need to convert years one at a time, so they have to be written one at a time using Files.writeString(). Add \n after each
        Files.writeString(numbersOutput.toPath(), Integer.toString(year) + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
      }
      catch(IOException ex) {
        System.out.println("Error: " + ex.getMessage());
      }
    }
  }
}



import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ReadNumbers {
  public static void main(String[] args) {
    File yearsFile = new File("years.txt");
    ArrayList<Integer> years = new ArrayList<>();
    try {
      List<String> yearsAsStrings = Files.readAllLines(yearsFile.toPath());
      for(String yearString : yearsAsStrings) {
        years.add(Integer.parseInt(yearString));
      }
    }
    catch(IOException ex) {
      System.out.println("Error reading file: " + ex.getMessage());
    }
    catch(NumberFormatException ex) {
      System.out.println("Number format error: " + ex.getMessage());
    }
    System.out.println(years.toString());
  }
}



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class DeleteFile {
  public static void main(String[] args) {
    File yearsFile = new File("years.txt");
    boolean fileDeleted = false;
    try {
      fileDeleted = Files.deleteIfExists(yearsFile.toPath());
    }
    catch(IOException ex) {
      System.out.println("Error deleting: " + ex.getMessage());
    }
    if(fileDeleted) {
      System.out.println(yearsFile.getName() + " deleted");
    }
    else {
      System.out.println(yearsFile.getName() + " not deleted");
    }
  }
}



import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

class EnterFileName {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter existing file name: ");
    String fileName = input.nextLine();
    File inputFile = new File(fileName);
    //Warn if file doesn't exist
    if(! Files.exists(inputFile.toPath())) {
      System.out.println("The file " + fileName + " does not exist");
    }
    //Then warn if user doesn't have read permission 
    else if(! Files.isReadable(inputFile.toPath())) {
      System.out.println("User doesn't have read permissions for " + fileName);
    }
    //If file exists and can be read by user, try to read it.
    //Other I/O errors may be possible, sot try/catch needed, but such errors are much less likely. 
    else {
      try {
        List<String> lines = Files.readAllLines(inputFile.toPath());
        System.out.println(inputFile.getName() + " contains " + lines.size() + " lines");
      }
      catch(IOException ex) {
        System.out.println("File error: " + ex.getMessage());
      }
    }
  }
}



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class FileNewLine {
  public static void main(String[] args) {
    File flowerFile = new File("flowers.txt");
    try {
      //Write each line without added new line
      Files.writeString(flowerFile.toPath(), "Roses are red\n", StandardOpenOption.CREATE);
      Files.writeString(flowerFile.toPath(), "Daisys are yellow\n", StandardOpenOption.APPEND);
    }
    catch(IOException ex) {
      System.out.println("Error: " + ex.getMessage());
    }
  }
}



public class CompanyEmployee {
  private String lastName;
  private String firstName;
  int id;
  int salary;

  public CompanyEmployee(String lastName, String firstName, int id, int salary) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.id = id;
    this.salary = salary;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public int getId() {
    return id;
  }

  public int getSalary() {
    return salary;
  }

  //toString() method provides format for printing company employee data: Smith, John ID: 10123 ($85000) 
  public String toString() {
    return lastName + ", " + firstName + " ID: " + id + " ($" + salary + ")";
  }
}



//need file, employees.csv


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class CompanyEmployeesProgram {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String cmd = "";
    System.out.print("Enter the name of the CSV file: ");
    String csvFile = input.nextLine();

    while(!cmd.toLowerCase().equals("exit")) {
      displayMenu();
      cmd = input.nextLine();
      if(cmd.toLowerCase().equals("list")) {
        listEmployees(csvFile);
      }
      else if(cmd.toLowerCase().equals("add")) {
        addEmployees(input, csvFile);
      }
      else if(cmd.toLowerCase().equals("del")) {
        System.out.print("Employee ID to delete: ");
        int emplId = input.nextInt();
        deleteEmployee(csvFile, emplId);
      }
    }
    /*ArrayList<CompanyEmployee> employees = readEmployees("employees.csv");
    for(CompanyEmployee empl : employees) {
      System.out.println(empl);
    }
    ArrayList<String> newEmployees = new ArrayList<>();
    System.out.println("Original List: ");
    listEmployees("employees.csv");
    System.out.println("Deleting employee....");
    deleteEmployee("employees.csv", 10002);
    System.out.println("Revised List: ");
    listEmployees("employees.csv");*/
  }

  public static void displayMenu() {
    System.out.println("\nlist - List all employees");
    System.out.println(" add - Add an employee");
    System.out.println(" del - Delete an employee");
    System.out.println("exit - Exit program");
    System.out.print("Enter command choice: ");
  }

  public static ArrayList<CompanyEmployee> readEmployees(String csvFile) {
    //Create an empty ArrayList of CompanyEmployee objects
    ArrayList<CompanyEmployee> employeeList = new ArrayList<>();
    
    //File object for accessing the CSV file
    File inputDataFile = new File(csvFile);
    List<String> lines = new ArrayList<>();
    //Because the following statements can throw exceptions, they are in a try block
    try {
      lines = Files.readAllLines(inputDataFile.toPath());
      for(String line : lines) {
        String[] employeeData = line.split(",");
        int id = Integer.parseInt(employeeData[0]);
        int salary = Integer.parseInt(employeeData[1]);
        //Last name & first name don't need conversion to another datatype.
        String lastName = employeeData[2];
        String firstName = employeeData[3];
        //Now construct a CompanyEmployee object for each employee
        CompanyEmployee empl = new CompanyEmployee(lastName, firstName, id, salary);
        //Add CompanyEmployee object to ArrayList
        employeeList.add(empl);
      }
    }
    catch(FileNotFoundException ex) {
      System.out.println("File not found: " + ex.getMessage());
    }
    catch(IOException ex) {
      System.out.println("I/O error: " + ex.getMessage());
    }
    catch(NumberFormatException ex) {
      System.out.println("Number format error: " + ex.getMessage());
    }
    return employeeList;
  }
  
  public static void addEmployees(Scanner input, String csvFile) {
    ArrayList<CompanyEmployee> employeesToAdd = new ArrayList<>();
    char keepGoing = 'Y';
    while(keepGoing == 'Y') {
      System.out.print("Enter employee last name: ");
      String last = input.nextLine();
      System.out.print("Enter employee first name: ");
      String first = input.nextLine();
      System.out.print("Enter employee ID #: ");
      int id = input.nextInt();
      System.out.print("Enter salary: ");
      int salary = input.nextInt();
      //Remove new line remaining in input buffer
      input.nextLine();
      
      CompanyEmployee employee = new CompanyEmployee(last, first, id, salary);
      employeesToAdd.add(employee);

      //Check if user wants to continue adding employees
      System.out.print("Continue adding? Y/N: ");
      //Read line as a String but just grab 1st char
      keepGoing = input.nextLine().charAt(0);
    }

    //Now call method to write new data to file
    writeEmployees("employees.csv", employeesToAdd);
  }
  
  public static void writeEmployees(String csvFile, ArrayList<CompanyEmployee> employees) {
    //Convert ArrayList<CompanyEmployee> to ArrayList<String>
    ArrayList<String> newEmployees = new ArrayList<>();
    for(CompanyEmployee empl : employees) {
      newEmployees.add(empl.getId() + "," + empl.getSalary() + "," + empl.getLastName() + "," + empl.getFirstName());
    }
    File outputFile = new File(csvFile);
    try {
      //Write to output file in APPEND mode
      Files.write(outputFile.toPath(), newEmployees, StandardOpenOption.APPEND);
    }
    catch(IOException ex) {
      System.out.println("Error writing to file: " + ex.getMessage());
    }
  }

  public static void listEmployees(String csvFile) {
    ArrayList<CompanyEmployee> employees = readEmployees(csvFile);
    int menuNumber = 1;
    for(CompanyEmployee empl : employees) {
      System.out.println(menuNumber++ + ". " + empl);
    }
  }


  public static boolean deleteEmployee(String csvFile, int emplID) {
    //Read contents of existing file
    ArrayList<CompanyEmployee> employees = readEmployees(csvFile);
    //Track if employee has been found and deleted
    boolean employeeDeleted = false;
    CompanyEmployee emplToDelete = null;
    for(CompanyEmployee empl : employees) {
      if(empl.getId() == emplID) {
        emplToDelete = empl;
      }
    }
    if(emplToDelete != null) {
      employees.remove(emplToDelete);
      employeeDeleted = true;
      ArrayList<String> remainingEmployees = new ArrayList<>();
      for(CompanyEmployee empl : employees) {
        remainingEmployees.add(empl.getId() + "," + empl.getSalary() + "," + empl.getLastName() + "," + empl.getFirstName());
      }
      File outputFile = new File(csvFile);
      try {
        //Write to output file - overwrite if it already exists
        Files.write(outputFile.toPath(), remainingEmployees, StandardOpenOption.TRUNCATE_EXISTING);
      }
      catch(IOException ex) {
        System.out.println("Error writing file: " + ex.getMessage());
      }
    }
    return employeeDeleted;
  }  
}