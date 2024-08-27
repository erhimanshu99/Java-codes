class Perchase2 {
    public static void main(String[] args) 
    {
        int m1=1020; int m2=200;
        int m3= 230; int m4= 400;
        int total=m1+m2+m3+m4;
        float disc=0;
        disc= total*5/100f;
        if (total>=1000){
            disc=total*10/100f;
        }
       float grandtotal=total-disc;
       System.out.println(total);
       System.out.println(disc);
       System.out.println(grandtotal);



    }
}
