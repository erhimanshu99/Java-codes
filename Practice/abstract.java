//abstract class
abstract class Animal{
    //abstract method
    public abstract void animalsound();
    //regular method
    public void sleep(){
        System.out.println("Zzzz");
    }
}
//subclass
class Dog extends Animal{
    public void animalsound (){
        //the bodyof animal sound below
        System.out.println("the dog says: bhow bhow");
    }

}
class Main{
    public static void main(String[] args) {
        Dog myDog=new Dog();// dog object
        myDog.animalsound();
        myDog.sleep();
    }
}