class Purchase1 {
    public static void main(String[] args) 
    {
        int p1=1299; int p2=299; 
        int p3=499; int p4=599;
        int total =p1+p2+p3+p4;
        float disc=0;
        disc=total*(10/100.0f);
        if ((total>=2000)) {
            disc=total*(20/100f);
        }
        float grandtotal=total-disc;
        System.out.println(total);
        System.out.println(disc);
        System.out.println(grandtotal);
    }
}