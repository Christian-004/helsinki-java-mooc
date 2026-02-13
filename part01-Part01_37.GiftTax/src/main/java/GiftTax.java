
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gifttax = Integer.valueOf(scan.nextLine());

        if (gifttax < 5000) {
            System.out.println("No tax!");
        } else if (gifttax >= 5000 && gifttax < 25000) {
            System.out.println("Tax: " + ((double) 100 + (gifttax - 5000) * .08));
        } else if (gifttax >= 25000 && gifttax < 55000) {
            System.out.println("Tax: " + ((double) 1700 + (gifttax - 25000) * .1));
        } else if (gifttax >= 55000 && gifttax < 200000) {
            System.out.println("Tax: " + ((double) 4700 + (gifttax - 55000) * .12));
        } else if (gifttax >= 200000 && gifttax < 1000000) {
            System.out.println("Tax: " + ((double) 22100 + (gifttax - 200000) * .15));
        } else {
            System.out.println("Tax: " + ((double) 142100 + (gifttax - 1000000) * .17));
        }
    }
}
