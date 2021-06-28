public class SportsVehicle extends Vehicle {
    
    String vehicleType;
    String turbo;
    
    public SportsVehicle(String vehicleType, String modelNumber, String engineType, int enginePower, int tireSize, String turbo) {
        super(modelNumber, engineType, enginePower, tireSize);
        this.vehicleType = vehicleType;
        this.turbo = turbo;
    }

    public String getTurbo(){
        return turbo;
    }

}
