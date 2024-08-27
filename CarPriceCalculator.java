public class CarPriceCalculator {
    public static void main(String[] args) {
        String name = "Verna";
        int price = 1345000;
        int cc = 1500;
        float tax = 0;
        float insurance = 0;

        if (price < 1000000) 
        {
            tax = price * 19.5f/100;
        } else if (price >= 1000000 && price < 2000000) 
        {
            tax = price * 21.7f/100;
        } else if (price >= 2000000 && price < 3000000) 
        {
            tax = price * 25.9f/100;
        } else if (price >= 3000000) 
        {
            tax = price * 27f/100;
        }

        if (cc < 1000) 
        {
            insurance = price * 15f/100;
        } else if (cc >= 1000 && cc < 2000) 
        {
            insurance = price * 17f/100;
        } else if (cc >= 2000 && cc < 3000) 
        {
            insurance = price *18.2f/100;
        } else if (cc >= 3000) 
        {
            insurance = price * 21.5f/100;
        }

        float totalPrice = price + tax + insurance;

        // Output the details
        System.out.println("Car Name: " + name);
        System.out.println("Base Price:" + price);
        System.out.println("Tax:" + tax);
        System.out.println("Insurance:" + insurance);
        System.out.println("Total Price:" + totalPrice);
    }
}
