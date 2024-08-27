class Ifelse1 {
    public static void main(String[] args) {
        int marks=68;
        if (marks<50) 
        {
            System.out.println("failed");
        }
            if (marks>50) 
            {
                if (marks<=60) 
                {
                    System.out.println(marks+"D-grade");
                }
                
            }
            if (marks>60) 
            {
                if (marks<=70) 
                {
                    System.out.println(marks+"C-grade");
                }
            }
            if (marks>70) 
            {
                if (marks<=80) 
                {
                    System.out.println(marks+"B-grade");
                }
            }
            if (marks>80) 
            {
                if (marks<=90) 
                {
                    System.out.println(marks+"A-grade");
                }
            }
            if (marks>90)
            {
                if (marks<=100) 
                {
                    System.out.println(marks+"A+grade");
                }
            }
        
        
       
    }
}
