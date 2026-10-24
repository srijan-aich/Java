import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) throws IOException {
       System.out.println("Enter a number");

        /*InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int num = Integer.parseInt(br.readLine());
        System.out.println("You entered: " + num);*/

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("You entered: " + num);

    }
}