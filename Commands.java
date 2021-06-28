
import java.util.ArrayList;
import java.util.Scanner;


public class Commands {

    ArrayList<NormalVehicle> normalVehicles = new ArrayList<NormalVehicle>();
    ArrayList<SportsVehicle> sportsVehicles = new ArrayList<SportsVehicle>();
    ArrayList<HeavyVehicle> heavyVehicles = new ArrayList<HeavyVehicle>();
    Scanner scan = new Scanner(System.in);

    public void addVehicle(String vehicleType, String modelNumber, String engineType, int enginePower, int tireSize) {
        if (vehicleType.equals("Normal")) {
            normalVehicles.add(new NormalVehicle(vehicleType, modelNumber, engineType, enginePower, tireSize));
            System.out.println("1 " + vehicleType + " vehicle successfully added.\n");
        } else if (vehicleType.equals("Sports")) {
            System.out.println("Enter turbo tyes for "+vehicleType+" vehicle.");
            String turbo = scan.nextLine();
            sportsVehicles.add(new SportsVehicle(vehicleType, modelNumber, engineType, enginePower, tireSize, turbo));
            System.out.println("1 " + vehicleType + " vehicle successfully added.\n");
        } else if (vehicleType.equals("Heavy")) {
            System.out.println("Enter weight in kg for "+vehicleType+" vehicle.(only value)");
            int weight = scan.nextInt();
            heavyVehicles.add(new HeavyVehicle(vehicleType, modelNumber, engineType, enginePower, tireSize, weight));
            System.out.println("1 " + vehicleType + " vehicle successfully added.\n");
        }

    }

    public void deleteVehicle(String vehicleType, String modelNumber) {
        if (vehicleType.equals("Normal")) {
            boolean flag = false;
            for (int i = 0; i < normalVehicles.size(); i++) {
                NormalVehicle normalVehicle = normalVehicles.get(i);
                if (normalVehicle.getModelNumber().equals(modelNumber)) {
                    flag = true;
                    normalVehicles.remove(normalVehicle);
                    System.out.println("1 "+ vehicleType +  " vehicle successfully deleted.");
                    break;
                }

            }
            if (flag == false) {
                System.out.println("Type or Name not correct.");
            }

        } else if (vehicleType.equals("Sports")) {
            boolean flag = false;
            for (int i = 0; i < sportsVehicles.size(); i++) {
                SportsVehicle sportsVehicle = sportsVehicles.get(i);
                if (sportsVehicle.getModelNumber().equals(modelNumber)) {
                    flag = true;
                    sportsVehicles.remove(sportsVehicle);
                    System.out.println("1 "+ vehicleType +  " vehicle successfully deleted.");
                    break;
                }

            }
            if (flag == false) {
                System.out.println("Type or Name not correct.");
            }

        } else if (vehicleType.equals("Heavy")) {
            boolean flag = false;
            for (int i = 0; i < heavyVehicles.size(); i++) {
                HeavyVehicle heavyVehicle = heavyVehicles.get(i);
                if (heavyVehicle.getModelNumber().equals(modelNumber)) {
                    flag = true;
                    heavyVehicles.remove(heavyVehicle);
                    System.out.println("1 "+ vehicleType +  " vehicle successfully deleted.");
                    break;
                }

            }
            if (flag == false) {
                System.out.println("Type or Name not correct.");
            }

        }
    }

    public void vehiclesList(String vehicleType) {
        if(vehicleType.equals("All")){
            System.out.println("Total Vehicle: "+(normalVehicles.size()+sportsVehicles.size()+heavyVehicles.size()));
            System.out.println("____________________________________________________________________________________________________");
        }
        if (vehicleType.equals("Normal") || vehicleType.equals("All")) {
            System.out.println("Total Normal Vehicle: "+normalVehicles.size());
            if (normalVehicles.size() > 0) {
                System.out.println("____________________________________________________________________________________________________");
                System.out.printf("%20s%20s%20s%20s\n", "Model Number", "Engine Type", "Engine Power", "Tire Size");
                System.out.println("____________________________________________________________________________________________________");
            }
            for (int i = 0; i < normalVehicles.size(); i++) {
                NormalVehicle normalVehicle = normalVehicles.get(i);
                System.out.printf("%20s%20s%20s%20s\n", normalVehicle.getModelNumber(), normalVehicle.getEngineType(), normalVehicle.getEnginePower(), normalVehicle.getTireSize());
                System.out.println("____________________________________________________________________________________________________");

            }
        } 
        if (vehicleType.equals("Sports") || vehicleType.equals("All")) {
            System.out.println("Total Sports Vehicle: "+sportsVehicles.size());
            if (sportsVehicles.size() > 0) {
                System.out.println("____________________________________________________________________________________________________");
                System.out.printf("%20s%20s%20s%20s%20s\n", "Model Number", "Engine Type", "Engine Power", "Tire Size", "Turbo");
                System.out.println("____________________________________________________________________________________________________");
            }
            for (int i = 0; i < sportsVehicles.size(); i++) {
                SportsVehicle sportsVehicle = sportsVehicles.get(i);
                System.out.printf("%20s%20s%20s%20s%20s\n", sportsVehicle.getModelNumber(), sportsVehicle.getEngineType(), sportsVehicle.getEnginePower(), sportsVehicle.getTireSize(), sportsVehicle.getTurbo());
                System.out.println("____________________________________________________________________________________________________");

            }
        } 
        if (vehicleType.equals("Heavy") || vehicleType.equals("All")) {
            System.out.println("Total Heavy Vehicle: "+heavyVehicles.size());
            if (heavyVehicles.size() > 0) {
                System.out.println("____________________________________________________________________________________________________");
                System.out.printf("%20s%20s%20s%20s%20s\n", "Model Number", "Engine Type", "Engine Power", "Tire Size", "Weight");
                System.out.println("____________________________________________________________________________________________________");
            }
            for (int i = 0; i < heavyVehicles.size(); i++) {
                HeavyVehicle heavyVehicle = heavyVehicles.get(i);
                System.out.printf("%20s%20s%20s%20s%20s\n", heavyVehicle.getModelNumber(), heavyVehicle.getEngineType(), heavyVehicle.getEnginePower(), heavyVehicle.getTireSize(), heavyVehicle.getWeight());
                System.out.println("____________________________________________________________________________________________________");

            }
        } 

    }

    public void expectedVisitor() {
        int visitorCount = 30+20*sportsVehicles.size();
        System.out.println("Expected Visitor: "+visitorCount);
    }

}
