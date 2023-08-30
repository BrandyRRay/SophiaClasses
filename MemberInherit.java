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