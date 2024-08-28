public class OnlineShoppingSite {

    public void myAccount(){
        System.out.println("Account Name");
    }
    public void catalog(){
        System.out.println("My cat");
    }
    public void orders(){
        System.out.println("My orders");
    }
    public void wishlist(){
        System.out.println("Mywishlist");
    }
    public static void main(String[] args) {
        OnlineShoppingSite info=new OnlineShoppingSite();
        info.catalog();
        info.myAccount();
        info.orders();
        info.wishlist();
    }
}