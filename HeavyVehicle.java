public class HeavyVehicle extends Vehicle {
    
    String vehicleType;
    int weight;
    
    public HeavyVehicle(String vehicleType, String modelNumber, String engineType, int enginePower, int tireSize, int weight) {
        super(modelNumber, engineType, enginePower, tireSize);
        this.vehicleType = vehicleType;
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

}
