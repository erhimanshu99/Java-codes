class Student1
{
    public static void main(String[] args) {
        int p=202;
        int c=39;
        int m=70;
        int o=65;
        if (p<35||c<35||m<35||o<35) 
        {
            System.out.println("Sttudent failed");
        }
        else
        {
            int total=p+c+m+o;
            float perc=(total/400f)*100;
            System.out.println(perc);
    
        // checking failed subject
        if (p<35) 
        {
            System.out.println("Failed in Physics"); 
            System.out.println("Prepare for next year"); 
        }
        if (c<35) 
        {
            System.out.println("Failed in Chemistry"); 
            System.out.println("Prepare for next year"); 
        }
        if (m<35) 
        {
            System.out.println("Mathematics"); 
            System.out.println("Prepare for next year"); 
        }
        if (o<35) 
        {
            System.out.println("Failed in Optional"); 
             System.out.println("Prepare for next year"); 
        }
    }
    }
}
