public class NormalVehicle extends Vehicle {
    
    String vehicleType;
    
    public NormalVehicle(String vehicleType, String modelNumber, String engineType, int enginePower, int tireSize) {
        super(modelNumber, engineType, enginePower, tireSize);
        this.vehicleType = vehicleType;
    }

}
