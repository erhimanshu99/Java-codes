 class Month 
 {
    public static void main(String[] args) 
    {
        int Month=7;
        if (Month<1||Month>12) 
        {
            System.out.println("Invalid");
        }
        if (Month==1||Month==3||Month==5||Month==7||Month==8||Month==10||Month==12) 
        {
            System.out.println("The dyas are 31 in this month");
        }
        if (Month==4||Month==6||Month==9||Month==11) 
        {
           System.out.println("The days are 30 in this month" ); 
        }
        if (Month==2)
        {
            System.out.println("The days are 28/29 in this month");
        }
            
        }
    }

