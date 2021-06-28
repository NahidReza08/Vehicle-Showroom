public class Vehicle {
    String modelNumber;
    String engineType;
    int enginePower;
    int tireSize;
    
    public Vehicle(String modelNumber, String engineType, int enginePower, int tireSize){
        this.modelNumber = modelNumber;
        this.engineType=engineType;
        this.enginePower=enginePower;
        this.tireSize=tireSize;
    }
    
    
    public String getModelNumber(){
        return modelNumber;
    }
    
    public String getEngineType(){
        return engineType;
    }
    
    public int getEnginePower(){
        return enginePower;
    }
    
    public int getTireSize(){
        return tireSize;
    }
    
    
}
