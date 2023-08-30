public class Customer {
  private String userName;
  private String password;
  
  public Customer(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  public String getPassword() {
    return password;
  }
  
  public void setUserName(String userName) {
    this.userName = userName;
  }
  
  public String getUserName() {
    return userName;
  }
}
  
class CustomerTest {
  public static void main(String[] args) {
    Customer testAcct = new Customer("user","pass");
    testAcct.setPassword("Java");
    resetAcct();
  }
  
  public static void resetAcct(Customer acct){
    acct.setPassword("");
    acct.setUserName("");
  }
}