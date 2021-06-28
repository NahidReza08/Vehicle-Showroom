import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Commands cd = new Commands();
        Scanner scan = new Scanner(System.in);

        while (true) {

            String s0 = "Enter your command: \n";
            String s1 = "Type 1 - to add a vehicle\n";
            String s2 = "Type 2 - to remove a vehicle\n";
            String s3 = "Type 3 - show vehicle list with details\n";
            String s4 = "Type 4 - show vehicle list with expected visitors\n";
            System.out.println(s0 + s1 + s2 + s3 + s4);

            int command = scan.nextInt();

            if (command==1) {
                System.out.println("Select vehicle type?*(Normal/Sports/Heavy)");
                String vehicleType = scan.nextLine();
                while (!vehicleType.equals("Normal") && !vehicleType.equals("Sports") && !vehicleType.equals("Heavy")) {
                    System.out.println("Write vehicle type in correct form.");
                    vehicleType = scan.nextLine();
                }
                System.out.println("Enter Model number of the " + vehicleType + " Vechicle :*");
                String modelNumber = scan.nextLine();
                while (modelNumber.length() == 0) {
                    System.out.println("Enter Model number of the " + vehicleType + " Vechicle plz.*");
                    modelNumber = scan.nextLine();
                }

                String engineType = "";
                if (vehicleType.equals("Normal")){
                    System.out.println("Select engine type?*(oil/gas/diesel)");
                    engineType = scan.nextLine();
                    while (!engineType.equals("oil") && !engineType.equals("gas") && !engineType.equals("diesel")) {
                        System.out.println("Write engine type in correct form.");
                        engineType = scan.nextLine();
                    }
                }
                else if(vehicleType.equals("Sports")){
                    engineType = "oil";
                }
                else if(vehicleType.equals("Heavy")){
                    engineType = "diesel";
                }

                System.out.println("Enter engine power in horse power(only value):");
                int enginePower = scan.nextInt();

                System.out.println("Enter tire size in mm(only value):");
                int tireSize = scan.nextInt();

                cd.addVehicle(vehicleType, modelNumber, engineType, enginePower, tireSize);
                continue;

            } else if (command==2) {
                System.out.println("Select vehicle type?*(Normal/Sports/Heavy)");
                String vehicleType = scan.nextLine();
                while (!vehicleType.equals("Normal") && !vehicleType.equals("Sports") && !vehicleType.equals("Heavy")) {
                    System.out.println("Write vehicle type in correct form.");
                    vehicleType = scan.nextLine();
                }

                System.out.println("Enter Model number of the " + vehicleType + " Vechicle :*");
                String modelNumber = scan.nextLine();
                while (modelNumber.length() == 0) {
                    System.out.println("Enter Model number of the " + vehicleType + " Vechicle plz.*");
                    modelNumber = scan.nextLine();
                }

                cd.deleteVehicle(vehicleType, modelNumber);
                continue;


            } else if(command==3) {
                System.out.println("Select vehicle types?*(All/Normal/Sports/Heavy)");
                String vehicleType = scan.nextLine();
                while (!vehicleType.equals("All") && !vehicleType.equals("Normal") && !vehicleType.equals("Sports") && !vehicleType.equals("Heavy")) {
                    System.out.println("Write vehicle type in correct order.");
                    vehicleType = scan.nextLine();
                }

                cd.vehiclesList(vehicleType);
                continue;

            } else if (command==4) {
                System.out.println("Select vehicle types?*(All/Normal/Sports/Heavy)");
                String vehicleType = scan.nextLine();
                while (!vehicleType.equals("All") && !vehicleType.equals("Normal") && !vehicleType.equals("Sports") && !vehicleType.equals("Heavy")) {
                    System.out.println("Write vehicle type in correct order.");
                    vehicleType = scan.nextLine();
                }

                cd.vehiclesList(vehicleType);
                cd.expectedVisitor();
                continue;
                
            }else{
                System.out.println("Invalid command");
            }

        }

        
    }

}
