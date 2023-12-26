import java.util.Scanner;

class ParkingSystem {
    int big, medium, small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        return switch (carType) {
            case 1 -> big-- > 0;
            case 2 -> medium-- > 0;
            case 3 -> small-- > 0;
            default -> false;
        };
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */

public class q_1603_Design_Parking_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of big slots: ");
        int bigSlots = scanner.nextInt();

        System.out.print("Enter the number of medium slots: ");
        int mediumSlots = scanner.nextInt();

        System.out.print("Enter the number of small slots: ");
        int smallSlots = scanner.nextInt();

        ParkingSystem parkingSystem = new ParkingSystem(bigSlots, mediumSlots, smallSlots);

        boolean[] results = new boolean[5];

        System.out.print("Enter car type (1 for big, 2 for medium, 3 for small): ");
        for (int i = 1; i <= 4; i++) {
            int carType = scanner.nextInt();
            results[i] = parkingSystem.addCar(carType);
        }

        System.out.print("[");
        for (int i = 0; i < results.length - 1; i++) {
            System.out.print(results[i] + ", ");
        }
        System.out.println(results[results.length - 1] + "]");
    }
}
