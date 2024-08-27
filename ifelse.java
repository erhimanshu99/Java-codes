class ifelse {
    public static void main(String[] args) {
        int age=18;
        boolean voterid =true;
        if (age>=18) 
        {
            if(voterid==true) {
                System.out.println("You are eligible for voting");
            }
            else
        {
            System.out.println("Not eligible for voting");
            System.out.println("No voterid card");

        }
            
        }
        else{
            System.out.println("Not eligible for voting");
        }
        

    }
}
