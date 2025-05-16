import java.util.Scanner;

class BMI_Calculator {
    private double weight;
    private double height;

    public BMI_Calculator(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI() {
        return weight / ((height / 100.0) * (height / 100.0));
    }

    public void displayResult() {
        double bmi = calculateBMI();
        System.out.printf("Your BMI is %.2f. ", bmi);
        
        if (bmi >= 25) {
            System.out.println("You are overweight");
            //double idealWeight = 24.99 * ((height / 100) * (height / 100));
            System.out.printf("Reduce %.2f kg to be fit\n", (bmi - 25));
        } else if (bmi >= 18.5) {
            System.out.println("You are fit and healthy");
        } else {
            System.out.println("You are underweight");
           // double idealWeight = 18.5 * ((height / 100) * (height / 100));
            System.out.printf("Gain %.2f kg to be fit\n", (18.5 - bmi));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter weight in kg");
        double weight = scanner.nextDouble();
        
        System.out.println("Enter height in cm");
        double height = scanner.nextDouble();
        
        BMI_Calculator bmiCalculator = new BMI_Calculator(weight, height);
        bmiCalculator.displayResult();
        
        scanner.close();
    }
}
