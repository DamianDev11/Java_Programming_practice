public class abstracts {
    public static void main(String args[]){
    // Dog bob=new Dog();
    // bob.eats();
    // bob.walk();
    // Chick chic=new Chick();
    // chic.eats();
    // chic.walk();
    //System.out.print(bob.color);
    Pitbull p=new Pitbull();
    }

}

abstract class Animal{
    String color;

    Animal(){
        System.out.println("Animal constructor is called");
    }
    void eats(){
        System.out.println("eats anything");
    }

    abstract void walk();
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog constructor is called");
    }

    String colorchange;
    void colorchange(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Pitbull extends Dog{
    Pitbull(){
        System.out.println("Pitbull constuctor is called");
    }
}

class Chick extends Animal{
    String colorchange;
    void colorchange(){
        color="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
