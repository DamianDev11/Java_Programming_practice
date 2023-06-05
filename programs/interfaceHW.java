public class interfaceHW {

    public static void main(String args[]){
        Bear b=new Bear();
        b.eatsgrass();
        b.eatsmeat();
    }
    
}

interface Herbivore{
    void eatsgrass();
}

interface Carnivores{
    void eatsmeat();
} 

class Bear implements Herbivore,Carnivores{
    public void eatsgrass(){
        System.out.println("Bear eating grass");
    }
    public void eatsmeat(){
        System.out.println("Bear eats meat");
    }
}