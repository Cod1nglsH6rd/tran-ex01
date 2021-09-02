import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args){
        /*
        Ask for name
            Reads input = "name"
        Output message with name
         */
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.printf("Hello, %s, nice to meet you!", name);
    }

}
