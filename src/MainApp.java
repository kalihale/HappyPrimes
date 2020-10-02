import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        int userNum = 2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer number of Happy Primes that you would like: ");
        String userInput = input.next();
        try{
            userNum = Integer.parseInt(userInput);
        }catch(Exception e)
        {
            System.out.println("This is not an integer.");
            System.exit(37);
        }
        if(userNum <= 0)
        {
            System.out.println("It is impossible to print a negative number of Happy Primes.");
        }

        int numOfNums = 0;
        int num = 2;

        while(numOfNums < userNum)
        {
            boolean prime = PrimeNumber.isPrime(num);
            boolean happy = HappyNumber.isHappy(num);
            if(prime && happy)
            {
                System.out.println(num);
                numOfNums++;
            }
            num++;
        }
    }
}
