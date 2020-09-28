import java.util.ArrayList;
import java.util.Scanner;

public class App {

    //Scanner in = new Scanner(System.in);
    public static double bmiSum = 0;

    public static Boolean moreInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nDo you wish to input more information(y/n)? ");
        if(in.next().equalsIgnoreCase("y"))
            return true;
        else
            return false;
    } 

    public static double getUserHeight() {
        Scanner in = new Scanner(System.in);
        double height;

        System.out.print("\nInput height(in): ");
        height = in.nextDouble();
        in.nextLine();

        return height;
    }

    public static double getUserWeight() {
        Scanner in = new Scanner(System.in);
        double weight;

        System.out.print("Input weight(lbs): ");
        weight = in.nextDouble();
        in.nextLine();

        return weight;
    }

    public static void displayBmiInfo(BodyMassIndex bmiInfo) {
        bmiSum += bmiInfo.bmiInput;

        System.out.println("\n" + bmiInfo.bmiCategory + "\t" + bmiInfo.bmiInput);
    }

    public static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiInfo) {
        System.out.println("\nAverage bmi: " + bmiSum/bmiInfo.size());
    }

    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }
}
