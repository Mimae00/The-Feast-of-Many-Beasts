package src;


import java.util.Scanner;

public class FeastBeasts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Checks if the animal and the food is same first and last letter!\n");

        System.out.print("Enter Beast: ");
        String beast = scanner.nextLine();

        System.out.print("Enter Feast: ");
        String feast = scanner.nextLine();

        FeastBeastsImpl.feast(beast, feast);
    }
}

