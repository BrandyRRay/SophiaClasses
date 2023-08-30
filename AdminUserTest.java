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