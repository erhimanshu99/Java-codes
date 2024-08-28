//class1
class parent{
    void print()
    {
        System.out.println("parent class");
    }
}
//class2
class subclass1 extends parent{
    void print() {System.out.println("subclass1");}
}
//class3
class subclass2 extends parent{
    void print(){
        System.out.println("subclass2");
    }
    
}
//class4
/**
 * overriding
 */
public class overriding {

    public static void main(String[] args) 
    {
        //creating object of class1
        parent a;
        //now we will call print method inside main method

        a=new subclass1();
        a.print();
        a=new subclass2();
        a.print();
    }
}