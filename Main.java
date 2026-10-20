public class Main
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50, 60};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            if (i % 2 != 0)
            {
                sum = sum + numbers[i];
            }
        }

        System.out.println("Sum of elements at odd indexes = " + sum);
    }
}
