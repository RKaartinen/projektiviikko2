package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        Car newCar = null;
        
        System.out.print("Anna auton merkki: ");
        String brand = sc.nextLine();
        System.out.print("Anna auton malli: ");
        String model = sc.nextLine();
        newCar = new Car(brand, model);

        boolean exit = false;
        while (!exit) {
            System.out.println("1) Näytä auton tila, 2) Muokkaa auton merkkiä ja mallia, 3) Kiihdytä autoa, 4) Hidasta autoa, 0) Lopeta ohjelma");
            
            if (sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        newCar.printSpecs();
                        break;
                    case 2:
                        System.out.print("Anna uusi auton merkki: ");
                        String newBrand = sc.nextLine();
                        newCar.setBrand(newBrand);
                        System.out.print("Anna uusi auton malli: ");
                        String newModel = sc.nextLine();
                        newCar.setModel(newModel);
                        break;
                    case 3:
                        System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                        int accelerate = Integer.parseInt(sc.nextLine());
                        if (accelerate < 0) {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                        } else {
                            newCar.setSpeed(newCar.getSpeed() + accelerate);
                        }
                        break;
                    case 4:
                        System.out.print("Kuinka monta km/h haluat hidastaa? ");
                        int decelerate = Integer.parseInt(sc.nextLine());
                        if (decelerate < 0) {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                        } else {
                            newCar.setSpeed(newCar.getSpeed() - decelerate);
                        }
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä.");
                        break;
                }
            }
        }


    sc.close();
    }
    
}
