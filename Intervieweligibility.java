class Intervieweligibility
{
    public static void main(String[] args) {
        int qcode=6;
        int scode=4;
        int yop=2023;
        float perc=60f;
        if (yop<2022|| yop>2024||perc<55) {
            System.out.println("Sorry but you are not eligible for our requirement");
        }
            if (yop<2022||yop>2024) {
                System.out.println("Your year of passsout is not matching with our requirement");
            }
            if (perc<55) {
                System.out.println("your percentage is not matching with us");
            }
            if (qcode==2||qcode==3||qcode==4||qcode==5||qcode==7) {
                System.out.println("Sorry but you are not eligible for our requirement");
                System.out.println("your qualification didnot meet our requirement");
                
            }
            if (scode==3||scode==4||scode==5||scode==7||scode==8) {
                System.out.println("Sorry but you are not eligible for our requirement");
                System.out.println("your stream did not match our requirement");
            }
            
            if (scode==1||scode==2||scode==6) {
            System.out.println("you are eligible for interview");
            }
            if (qcode==1||qcode==6) {
                System.out.println("you are eligible for interview");
            }
    
    }

    
}