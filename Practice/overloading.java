class Helper{
    static int Multiply(int a, int b)
    {
        return a*b;
    }
    static double Multiply(double a, double b)
    {
        return a*b;

    }
}

class overloading {
    public static void main(String[] args) 
    {
        System.out.println(Helper.Multiply(2,3));
        System.out.println(Helper.Multiply(2.3, 4.5));
      
    }

    
}