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