import java.text.DecimalFormat; //Needed for price

public class Beverage {
  private String name;
  private int size;
  private double price;
  //The DecimalFormat for the price format is a rare public attribute, but since it's
  //final, the object is constant so it can't be modified (even though it's public)
  public final DecimalFormat PriceFormat = new DecimalFormat("$0.00");

  Beverage(String name, int size, double price) {
    this.name = name;
    this.size = size;
    this.price = price;
  }
  
  public String getName() {
    return name;
  } //Coffee, tea, etc...
  
  public int getSize() {
    return size;
  } //Size in oz
  
  public double getPrice() {
    return price;
  } //Price in $$
}