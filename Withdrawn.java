class Withdrawn {
    public static void main(String[] args) {
        int balance=75000;
        int amount=730000;
        int bankcode=1;
        boolean pancard=true;
        if (amount<=balance) 
        {
            if (amount<50000||pancard==true) 
            {
                balance=balance-amount;
                System.out.println(balance);
                System.out.println("Transaction successful");
                if (bankcode==1) 
                {
                    if (balance<10000) 
                    {
                        System.out.println("Low minimum balance");
                        System.out.println(10000-balance+ "must be deposited");
                    }
                    
                }
                if (bankcode==2) 
                {
                    if (balance<5000) 
                    {
                        System.out.println("Low minimum balance");
                        System.out.println(5000-balance+"must be deposited");
                        
                    }

                }
                if (bankcode==3) 
                {
                    if (balance<0) 
                    {
                        System.out.println("Low minimum balance");
                        System.out.println(0-balance+"must be deposited");
                    }
                }
                if (bankcode==4) 
                {
                    if (balance<0) 
                    {
                        System.out.println("Low minimum balance");
                        System.out.println(0-balance+"must be deposited");
                        
                    }
                    
                }

            }
            else
            {
                System.out.println("Link your pancard");
            }
            
        }
        else
        {
            System.out.println("Insufficient balance in your account");
        }
    }
}
