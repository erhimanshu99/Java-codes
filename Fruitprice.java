 class Fruitprice {
    public static void main(String[] args) {
        int a=150;
        int quantity=4;
        int b=40;
        int p=80;
        int o=100;
        int g=50;
        int price=a+b+p+o+g;
        float disc=0;
        float gst=0;
        if(price>=500)
        {
            disc=price*10/100f;
        }
        gst=price*18/100;
        float totalprice=price+gst+disc;
        System.out.println(price);
        System.out.println(disc);
        System.out.println(gst);
        System.out.println(totalprice);
        System.out.println(quantity);

    }
}
