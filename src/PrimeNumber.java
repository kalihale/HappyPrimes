public class PrimeNumber
{
    public static boolean isPrime(int n) throws IllegalArgumentException
    {
        try
        {
            int i = 2;

            if(n <= 0)
            {
                throw new IllegalArgumentException();
            }

            if(n == 1)
            {
                return false;
            }

            while(i <= n/2)
            {
                if(n%i==0)
                {
                    return false;
                }

                i++;
            }

            return true;
        }catch(IllegalArgumentException e)
        {
            System.out.println("Illegal argument.");
        }
        return false;

    }
}
