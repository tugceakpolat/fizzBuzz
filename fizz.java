import java.util.Scanner;
public class fizz {
    public static void main(String[] args) {
        //Fizz Buzz
        //5'e bölünebiliyorsa fizz, 3' bölünebiliyorsa buzz
        //ikisinede bölünebiliyor fizzbuzz yazan program

        int number ;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        number = input.nextInt();

        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("FizzBuzz");
        else if ( number % 3 == 0)
            System.out.println("Fizz");
        else if (number % 5 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

    }
}
