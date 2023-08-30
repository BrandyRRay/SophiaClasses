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