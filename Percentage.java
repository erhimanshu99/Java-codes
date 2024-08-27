class Percentage 
{
    public static void main(String[] args) 
    {
        int p=30; int c=20;
        int m=30; int o=30;
        int total=p+c+m+o;
        System.out.println(total);
        float perc=(total/400f)*100;
        System.out.println(perc);
        if (perc<35)
        {
            System.out.println("Failed");
        }
        if (perc>35) 
        {
            if (perc<60)
            {
                System.out.println("Second division");
            }
        }
        if (perc>60) 
        {
            if (perc<80)
            {
                System.out.println("First division");
            }
        }
        if (perc>80) 
        {
            System.out.println("Distinction class");
        }
        
        }
        
        

    }

