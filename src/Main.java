import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int minLen = 4;
        final int maxLen = 40;

        System.out.println("Simple Password Generator");

        Scanner sc = new Scanner(System.in);
        int dimension = 0;

        System.out.println("Enter the desired lentgh of your password: ");
        while (dimension < minLen || dimension > maxLen) {
            dimension = sc.nextInt();
            if(dimension < minLen || dimension > maxLen) {
                System.out.println("Please enter a value between 4 and 40");
            }
        }



        Password p = new Password();

        //System.out.println(p.getAdmittedChars());


        System.out.println(p.generaPassword(dimension));


    }
}