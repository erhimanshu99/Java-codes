 class Product {
    public static void main(String[] args) {
        int p1=1299;
        int p2= 299;
        int p3=399;
        int p4=499;
        float total=p1+p2+p3+p4;
        float dis=total*(25f/100);
        System.out.println(total); //before discount
        System.out.println(dis);
        total=total-dis;//updating value
        System.out.println(total);//afterdiscount
    }
}
