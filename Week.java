class Week
{
    public static void main(String[] args) {
        int day=0;
        if(day<1||day>7)
        {
            System.out.println("Invalid day");
        }
        if (day==1||day==7) 
        {
         System.out.println("Weekend");   
        }
        if (day==2||day==3||day==4||day==5) 
        {
            System.out.println("Weekdays");
        }
    }
}
