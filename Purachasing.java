class Purachasing
{
    public static void main(String[] args) 
    {
        int p1=299;
        int p2=299;
        int p3=899;
        int p4=599;
        int totalprice=p1+p2+p3+p4;
        float disc=0;
        float Grandtotal=0;
        if (totalprice<2000) 
        {
            disc=totalprice*10/100f;
            Grandtotal=totalprice-disc;
                System.out.println("Grandtotal="+Grandtotal);
            System.out.println(2000-totalprice+"Add to get 20% discount");
            System.out.println(3000-totalprice+"Add to get 25% discount");
            System.out.println(4000-totalprice+"Add to get 30% discount");
            System.out.println(5000-totalprice+"Add to get 40% discount");
        }
            else if (totalprice>=2000 && totalprice<3000) 
            {
                disc=totalprice*20/100f;
                Grandtotal=totalprice-disc;
                System.out.println("Grandtotal="+Grandtotal);
                System.out.println(3000-totalprice+"Add tto get 25% discount");
                System.out.println(4000-totalprice+"Add tto get 30% discount");
                System.out.println(5000-totalprice+"Add tto get 40% discount");

            }
                else if (totalprice>=3000 && totalprice<4000) 
                {
                    disc=totalprice*25/100f;
                    Grandtotal=totalprice-disc;
                    System.out.println("Grandtotal="+Grandtotal);
                    System.out.println(4000-totalprice+"Add to get 30% discount");
                    System.out.println(5000-totalprice+"Add to get 40% discount");
                }
                    else if (totalprice>=4000 && totalprice<5000) 
                    {
                        disc=totalprice*30/100f;
                        Grandtotal=totalprice-disc;
                        System.out.println("Grandtotal="+Grandtotal);
                        System.out.println(5000-totalprice+"Add to get 40% discount");
                    }
                        else{
                            disc=totalprice*40/100f;

                        }
                        
                            
        }
    }
