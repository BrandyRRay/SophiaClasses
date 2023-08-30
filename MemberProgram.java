class MemberProgram {
  public static void main(String[] args) {
    Member testMember = new Member("Blhoo", "Coffee");
    System.out.println("First name: " + testMember.getFirstName());
    System.out.println("Last name: " + testMember.getLastName());
    System.out.println("Exp. date: " + testMember.getExpiryDate());
  }
}