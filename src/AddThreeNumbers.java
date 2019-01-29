import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class AddThreeNumbers {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        int num3 = keyboard.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println(sum);

    }

}

