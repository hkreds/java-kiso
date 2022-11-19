package practice;

public class Car {
  private double fuelCost;
  private double fuelAmount;

  public Car(double fuelCost, double FuelAmount){
    this.fuelCost = fuelCost;
    this.fuelAmount = FuelAmount;
  }

  public void move(int km){
    System.out.println(km + " km 走ります");
    this.fuelAmount -= (km / fuelCost);
  }

  public double getFuelAmount(){
    return this.fuelAmount;
  }
}
