class Banking {
    public static void main(String[] args) {
        int balance=75000;
        int amount=500000;
        System.out.println(balance);
        System.out.println(amount);
        if (amount<=balance){
            balance=balance-amount;
            System.out.println(amount+" Amount debited successfuly");
        }
       
        System.out.println("Available balance is:"+balance);
       
    }
    
}
