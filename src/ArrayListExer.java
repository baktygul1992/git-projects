import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExer {
    //In an ArrayList consisting of 3 any random integers, calculate their sum and average.
    public static void main(String[] args){
        ArrayList<Integer> myNumbers=new ArrayList<>(3);
        Scanner input= new Scanner(System.in);
        System.out.println("Enter any 3 random int numbers");
        int numb1=input.nextInt();
        int numb2=input.nextInt();
        int numb3=input.nextInt();

        myNumbers.add(numb1);
        myNumbers.add(numb2);
        myNumbers.add(numb3);
        System.out.println(myNumbers);

        int sum=0;
        double averageSum=0;
        for(int i=0; i<myNumbers.size(); i++){
           sum+=myNumbers.get(i);
           averageSum=(double)sum/myNumbers.size();
        }
        System.out.println("The sum is: "+sum);
        System.out.println("The average sum is: "+averageSum);





    }
}
