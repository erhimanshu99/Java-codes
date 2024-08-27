 class Deposite {
    public static void main(String[] args) {
        int balance=75000;
        int amount=125000;
        boolean pancard=false;
        if (amount<100000||pancard==true) 
        {
            balance=balance+amount;
            System.out.println("amount is deposited successfully");
        }
        else{
            System.out.println("Please link your pancard");
        }
    }
}
