public class HappyNumber
{
    public static boolean isHappy(int n) throws IllegalArgumentException
    {
        try{
            while(n != 1)
            {
                int sum = 0;
                sum = (n%10) * (n%10);
                while(n>9)
                {
                    n = n/10;
                    sum += (n%10) * (n%10);
                }

                if(sum == 4)
                {
                    return false;
                }

                n = sum;
            }

            return true;

        }catch(IllegalArgumentException e)
        {
            System.out.println("This is an illegal argument.");
        }
        return false;
    }
}
