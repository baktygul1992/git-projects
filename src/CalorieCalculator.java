

import java.util.Scanner;

public class CalorieCalculator {
    public static void main(String[] args) {
        System.out.println("BMR is:"+calculateCalorie());


    }

    public static int calculateCalorie() {
        int age = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        boolean b = true;
        while (b) {
            String age1 = input.next();
            if (Character.isDigit(age1.charAt(0))) {
                age = Integer.parseInt(age1);
                b = false;
            } else {
                System.out.println("Please enter integer only: ");
            }
        }




        System.out.println("Enter your gender, M-male, F-female");

        boolean genderOption = true;
        while (genderOption) {
            char gender = input.next().charAt(0);
            if (gender == 'F' || gender == 'M') {
                genderOption = false;
            } else {
                System.out.println("enter only M or F characters");
            }
        }


        int height = 0;
        System.out.println("Enter your height in cm");
        boolean c = true;
        while (c) {
            String height1 = input.next();
            if (Character.isDigit(height1.charAt(0))) {
                height = Integer.parseInt(height1);
                c = false;
            } else {
                System.out.println("Please enter integer only: ");
            }
        }

        int weight = 0;
        System.out.println("Enter your weight in kg");
        boolean d = true;
        while (d) {
            String weight1 = input.next();
            if (Character.isDigit(weight1.charAt(0))) {
                weight = Integer.parseInt(weight1);
                d = false;
            } else {
                System.out.println("Please enter integer only: ");
            }
        }
        System.out.println("Choose your activity (s-sedentary, l-light, m-moderate, a-active, v-very active, e-extra active)");
        boolean activityOption=true;
        while (activityOption){
            char activity=input.next().charAt(0);
            if(activity =='s' || activity =='l' ||activity =='m' || activity =='a' || activity =='v' || activity =='e'){
                activityOption=false;
            }else{
                System.out.println("Enter only one of these characters: s,l,m,a,v,e");
            }

        }

        //Men: BMR = 10*Weight + 6.25*Height - 5*Age + 5
        int BMR = (int) ((10 * weight + 6.25 * height - 5 * age + 5) * 1.55);
        return BMR;
    }
}
