package Operator;

public class Interview_eligibility {
    public static void main(String[] args) 
    {
        
        int qcode=4; int scode=1;
        int yop=2023; float perc=58.3f;
        if ((qcode==1|| qcode==4) && (scode==1||scode==6||scode==2)&& (yop==2022||yop==2023||yop==2024)&&(perc>=55)) 
        {
            System.out.println("Eligible for interview");
        }
        else
        {
            System.out.println("Not-eligible for interview");
            if (qcode!=1 && qcode!=4) 
            {
                System.out.println("qualification not matching");
            }
            if (scode!=1 && scode!=2 &&  scode!=6) 
            {
                System.out.println("stream not matching");
            }
            if (perc<55) 
            {
                System.out.println("percentage not matching");
            }
            if (yop<2022 ||yop>2024) 
            {
                System.out.println("year of passout not matching");
            }

        }
    }
}
