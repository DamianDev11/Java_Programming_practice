public class inheritence {
    public static void main(String args[]){
        // Fish shark = new Fish();
        // shark.eats();
        Mammal bob=new Mammal();
        Fish few=new Fish();
        Birds bid=new Birds();
        few.eats();
        bob.eats();
        bid.eats();
        few.breathe();
        bob.breathe();
        bid.breathe();
        // System.out.print(bob.legs);
    }
    
}

//Base class
class Animal{
    String color;
    void eats(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}

class Birds extends Animal{
    void fly(){
        System.out.println("Fly");
    };
}

class Fish extends  Animal{

    void swim(){
        System.out.print("Swimns");
    }
}
