class Icecream {
    public static void main(String[] args) {
        int fc=3;
        int price=0;
        String flavour =null;
        boolean topings=true;
        boolean dryfruits=false;
        if (fc==1) {
            price=100;
            flavour="vanila";
        }
        if (fc==2) {
            price=115;
            flavour="kiwi";
        }
        if (fc==3){
            price=135;
            flavour="dragnofruit";
        }
        if (dryfruits==true){
            price=price+30;
        }
        if (topings==true) {
            price=price+20;
        }
        float gst=price*18/100.0f;
        float total =price+gst;
        System.out.println(price);
        System.out.println(gst);
        System.out.println(total);
        System.out.println(flavour);
    }
}
