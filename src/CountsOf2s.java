import java.util.Scanner;

public class CountsOf2s {
    public static void main(String args[]) {
        int number1 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter any number");
        boolean b = true;
        while (b) {
            String num = input.next();
            if (num.charAt(0) == '-') {
                if (Character.isDigit(num.charAt(1))) {
                    number1 = Math.abs(Integer.parseInt(num));
                    b = false;
                } else {
                    System.out.println("Please enter integer only: ");
                }
            } else {
                if (Character.isDigit(num.charAt(0))) {
                    number1 = Integer.parseInt(num);
                    b = false;
                } else {
                    System.out.println("Please enter integer only: ");
                }
            }
        }
        System.out.println("The quantity of 2s: "+numberOf2sInRange(number1));
        }



    static int numberOf2s(int n){
        int count=0;
        while (n>0){
            if(n%10==2)
                count++;
            n=n/10;
        }
        return count;
    }

    static int numberOf2sInRange(int n){
        int count =0;
        for(int i=2; i<=n; i++)
            count+=numberOf2s(i);
        return count;
    }


}
