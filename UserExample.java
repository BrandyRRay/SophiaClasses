class UserExample {
  public static void main(String[] args) {
    User account = new User("Blue", "mypass");
    System.out.println("Account created for " + account.getUserName());
  }
}