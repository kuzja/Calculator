import java.util.Scanner;

public class Program {

    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Program main = new Program();

        while (true) {

            System.out.println("Enter your expression: ");
            String inputString = main.getUserData();
            Calc calc = new Calc(inputString);

            System.out.println(calc.clearString + "=" + calc.getResult());

        }

    }

    private String getUserData() {
        return sc.nextLine();
    }
}
