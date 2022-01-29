import java.util.HashMap;
import java.util.Scanner;

public class StringExer {
    public static void main(String[] args) {
        //As a user i want to write a program, that takes a string and returns the number of alphanumeric characters that occur more than once.
        //duplicateCount("abcde") ➞ 0
        //
        //duplicateCount("aabbcde") ➞ 2
        //
        //duplicateCount("Indivisibilities") ➞ 2
        //
        //duplicateCount("Aa") ➞ 0
        //// Case sensitive
        //HashMap <String,Integer> b=new HashMap<>();
        Scanner user = new Scanner(System.in);
        System.out.println("Enter any String");
        String s = user.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }

            }

            System.out.println(s.charAt(i)+ " "+count);

        }



    }
}

