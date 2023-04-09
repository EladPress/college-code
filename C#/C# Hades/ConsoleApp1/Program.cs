using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        { 
            string str = @"1. mul
2. div
3. mod
4. power
5. exit";
            Console.WriteLine(str);
            int a;
            Console.WriteLine("enter your choice");
            a = int.Parse(Console.ReadLine());
            int b, c;
            Console.WriteLine("enter 2 numbers");
            b = int.Parse(Console.ReadLine());
            c = int.Parse(Console.ReadLine());



            switch (a)
            {
                case 1:
                    Console.WriteLine( Kefel(b,c));
                    break;
                case 2:
                    Console.WriteLine (Hilok(b,c));
                    break;
                case 3:
                    Console.WriteLine(Sheerit(b,c));
                    break;
                case 4:
                    Console.WriteLine(Hezka(b,c));
                    break;
                default:
                    Console.WriteLine("number not in the range");
                    break;
                    
            }
            


            

        }
        public static int Kefel(int a,int b)
        {
            int sum = 0;
            for (int i=1; i<=a;i++)
            {
                sum += b;
            }
            return sum;
        }
        public static double Hilok(int a, int b)
        {
            int count = 0;
            if (a > b)
            {
                while (a > b)
                {
                    a -= b;

                    count++;
                }
                return count;
            }
            if (b>a)
            {
                while (b > a)
                {
                    b -= a;
                    count++;


                }
                return count;
            }
            return 1;
            
                
        }
        public static int Sheerit(int a, int b)
        {
            if (a > b)
            {
                while (a > b)
                {
                    a -= b;

                  
                }
                return a;
            }
            if (b > a)
            {
                while (b > a)
                {
                    b -= a;
                   


                }
                return b;
            }
            return 0;
        }
        public static int Hezka (int a, int b)
        {
            int result = 1;
            for (int i=1;i<=b;i++)
            {
                result = Kefel(a, result); 
            }
            return result;
        }
        






            
        public static void Pascal(int num)//psacal triangle
        {
            for(int i = 1; i <= num; i++)
            {
                for(int j = num - i; j > 0; j--)
                {
                    Console.Write(" ");
                }
                for(int k = 1; k <= i; k++)
                {
                    Console.Write(k);
                }
                for(int l = i - 1; l >= 1; l--)
                {
                    Console.Write(l);
                }
                Console.WriteLine();
            }
        }
        public static int NumSumOfDigits(int num)//returns sum of digits
        {
            int sum = 0;
            while(num != 0)
            {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }
        public static int SumPositive(int a, int b, int count)
        {
            if (a + b > 0)
                return ++count;
            return count;
            
        }
        public static int UniqueDigits()//returns count of triple digit numbers with unique digits.
        {
            int a, b, c, count = 0;
            for (int i = 100; i <= 999; i++)
            {
                a = i / 100;
                b = i / 10 % 10;
                c = i % 10;
                if (a != b && a != c && b != c)
                    count++;
            }
            return count;
        }
        public static void Square()//squares every number between 1 - 100 descending and prints.
        {
            for(int i = 100; i >= 1; i--)
            {
                Console.WriteLine("The square of the number {0} is: {1}", i, i*i);
            }
        }
        public static int Min(int min, int num)//finds min of two numbers
        {
            if (num < min)
                min = num;
            return min;
        }

        
        public static int Max(int max, int num)//finds max of two numbers
        {
            if (num > max)
                max = num;
            return max;
        }
        public static bool Advanced(int num)//gets number, returns true if num is משוכלל, else false.
        {
            int sum = 0;
            for(int i = 1; i < num; i++)
            {
                if (num % i == 0)
                    sum += i;
            }
            if (sum == num)
                return true;
            return false;
        }

        public static void Triangle2(char c,int a)//gets int and char, prints משולש שווה שוקיים
        {
            int count = 1;
            for(int i = (a / 2 + 1); i >= 1; i--)
            {
                for (int j = i; j >= 0; j--)
                {
                    Console.Write(" ");
                }
                for(int m = 1; m <= count; m++)
                {
                    Console.Write(c);
                }
                count += 2;
                Console.WriteLine();
            }
        }

        public static void Triangle1()//מדפיס משולש ישר זווית
        {
            for (int i = 1; i <= 5; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }
        }
    }
}
