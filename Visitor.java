public class Visitor {
  private String host;
  private String areaVisiting;

  public Visitor(String firstName,String lastName,String jobTitle,String host, String areaVisiting) {
    super(firstName,lastName,jobTitle);
    this.host = host;
    this.areaVisiting = areaVisiting;
  }
 
  public String getHost() {
      return "Host " + this.host;
  }
  public void setHost(String newhost) {
    this.host = newhost;
  }
  public String getArea() {
    return "Area Visiting " + this.area_visiting;
  }
 
  public void setArea( String areaVisiting) {
    this.areaVisiting = areaVisiting;
  }
}
 
//Visitor visitor_1 = new Visitor("John","Doe","Visitor","Jane Doe","Main Building"); D
