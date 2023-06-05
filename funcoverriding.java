public class funcoverriding {
    public static void main(String args[]){
        Deer d=new Deer();
        d.eats();
    }
    
}

class Animal{
    void eats(){
        System.out.print("eats anything");
    }
}


class Deer extends Animal{
    void eats(){
        System.out.print("eats grass");
    }
}
