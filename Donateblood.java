class Donateblood {
    public static void main(String[] args) {
        int age=17;
        int weight=45;
        if (age<18||weight<50) 
        {
            System.out.println("You are not eligibe for blood donation");
            if (age<18)
            {
                System.out.println("Your age must be 18 years or above");
            }
            if (weight<50) 
            {
                System.out.println("Your weight must be 50kg or above");
    
        }
        if(age>=18)
        {
            if (weight>=50) 
            {
                System.out.println("You are eligible for blood donation");
            }
        }
    }
    }
}
    
