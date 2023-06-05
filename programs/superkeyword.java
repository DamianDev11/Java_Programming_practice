public class superkeyword {
    public static void main(String args[]){
        chic c=new chic();
        System.out.println(c.color);
    }

    
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is callled");
    }
}

class chic extends Animal{
    chic(){
    super.color="dam";
    System.out.println("chic constructor is called");
    }
}
