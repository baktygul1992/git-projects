import java.util.Arrays;
import java.util.Scanner;
public class TheMinAndMax {
    public static void main(String[] args) {
        //From an array of numbers find the smallest and the biggest integers and extract them to a new array.Note: Numbers must be in random order.  Numbers in Array also can or should contain negatives such as -1 or 0.
        int[] numbers = new int[4];
        Scanner user=new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter " + (i + 1) + " number");
            numbers[i] = user.nextInt();
        }
        FindTheLargestAndSmallest findTheLargestAndSmallest = new FindTheLargestAndSmallest();
        System.out.println("The smallest int is: "+findTheLargestAndSmallest.findTheSmallest(numbers));
        System.out.println("The largest int is: "+findTheLargestAndSmallest.findTheLargest(numbers));
        int[] numbers1 = new int[2];
        numbers1[0] = findTheLargestAndSmallest.findTheSmallest(numbers);
        numbers1[1] = findTheLargestAndSmallest.findTheLargest(numbers);
        System.out.println("The new array is: " + Arrays.toString(numbers1));
    }
    public int findTheSmallest(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
    public int findTheLargest(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
