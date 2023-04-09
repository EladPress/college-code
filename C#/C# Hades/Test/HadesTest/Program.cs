using System;

namespace HadesTest
{
    class Program
    {
        static void Main(string[] args)
        {
            //Console.WriteLine(IsSumEqual(124, 60));
            //SumLoop();
            //Console.WriteLine(Q2a(1, 2, 3));
            int[] arr = { 2, -5, 7, 9, 11, 8, -3, -6, 19, 2 };
            Console.WriteLine(Q3a(arr));

        }

        public static int Q3a(int[] arr)//שאלה 3סעיף א
        {
            int sum = 0, counter = 0;
            for(int i = 0; i < arr.Length; i++)
            {
                if (counter != 0 && (arr[i] <= 0 || arr[i] % 2 == 0))
                    break;
                if (arr[i] > 0 && arr[i] % 2 != 0)
                    counter++;
            }
            return counter;
        }

        public static bool Q2a(int num1, int num2, int num3)//סעיף 2 א
        {
            return (num1 < num2) && (num2 > num3);
        }

        public static bool Q2b(int[] arr)//סעיף 2 ב, לא יעבוד עם מערך באורך זוגי
        {
            for(int i = 0; i < arr.Length - 2; i+=2)
            {
                if (!Q2a(arr[i], arr[i + 1], arr[i + 2]))
                    return false;
            }
            return true;
        }

        public static int DigitSum(int num)//סעיף א', למצוא סכום ספרות של מספר
        {
            int sum = 0;
            while(num != 0)
            {
                sum += (num % 10);
                num /= 10;
            }
            return sum;
        }

        public static bool IsSumEqual(int num1, int num2)//סעיף ב', השוואת שני סכומי ספרות
        {
            if (DigitSum(num1) == DigitSum(num2))
                return true;
            return false;
        }

        public static void SumLoop()//סעיף ג', בודק סכום מקסימלי ומונה את הזוגות שהתקבלו
        {
            int maxSum = 0, counter = 0; bool currResult;
            do
            {
                int num1 = int.Parse(Console.ReadLine());
                int num2 = int.Parse(Console.ReadLine());
                currResult = IsSumEqual(num1, num2);
                
                if (currResult)
                {
                    if (DigitSum(num1) > maxSum)
                        maxSum = DigitSum(num1);
                    counter++;
                }
                
            } while (currResult);
            //counter--;
            Console.WriteLine(counter);
            Console.WriteLine(maxSum);
        }
    }
}
