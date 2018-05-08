using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace Ex1
{
    class Program
    {
        static void Main(string[] args)
        {
            double a, b;
            Console.WriteLine("Привет мир!\nВвод первого числа:");
            a = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("\nВвод второго числа:");
            b = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("\n a-b="+(a-b));
            Console.ReadKey();
        }
    }
}
