using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;


namespace Ex4
{
    class Program
    {


        static void Main(string[] args)
        {
            StreamReader reader = new StreamReader("oha.txt");

            String a, c;
            a = reader.ReadLine();
            Console.WriteLine(a);
            c = reader.ReadLine();
            double b = Convert.ToDouble(a);
            double f = Convert.ToDouble(c);
            double r = b - f;
            String k = Convert.ToString(r);
            Console.WriteLine(c);
            Console.WriteLine("otvet= " + r);
            FileStream res = new FileStream("test.txt", FileMode.Create); 
            StreamWriter writer = new StreamWriter(res); 
            writer.Write(r);
            writer.Close();
            Console.ReadKey();
        }
    }
}
    

