import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
       /* System.out.println("Hello world testing..");

        short my_variable=20;
        float my_decimal=(float)5.5;
        double my_double= 20.5;
        char my_char='A';
        boolean my_boolean=false;

        System.out.println(my_variable);
        System.out.println(my_decimal);
        System.out.println(my_double);
        System.out.println(my_char);
        System.out.println(my_boolean);

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number");
        int user_input_number = scan.nextInt();

        System.out.println("The entered value is:");
        System.out.println(user_input_number);


    }

        int x, y, answer;
        x = 30;
        y = 10;
        answer = x * y;

        System.out.println("The answer is = " + answer);*/

       int score = 10;
       switch (score)
       {
           case 1:
               System.out.println("Good");
               break;
           case 2:
               System.out.println("Very good");
               break;
           case 10:
               System.out.println("Excellent");
               break;
           default:
               System.out.println("It is not defined.");
               break;
       }
    }
}
