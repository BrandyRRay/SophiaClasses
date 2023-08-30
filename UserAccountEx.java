public class UserAccountEx {
  public static void main(String[] args) {
    UserAccount account = new UserAccount("Bleu", "mypass");
    account.setActiveUser(false);
    System.out.println("User name: " + account.getUserName());
    System.out.println("Is active user?: " + account.isActiveUser());
    System.out.println("Date joined: " + account.getDateJoined());
  }
}