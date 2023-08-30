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