import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class try_with_resources {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");

        try (InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(in)) {

            int num = Integer.parseInt(br.readLine());
            System.out.println("You entered: " + num);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} // We can also use try - catch and Finally instead, p.s - I like that one(finally)
