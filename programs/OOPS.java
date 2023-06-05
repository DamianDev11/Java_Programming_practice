public class OOPS {
    public static void main(String args[]){
    Pen p1 = new Pen();
    p1.setcolor("Blue");
    System.out.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.getTip());
    p1.setColor("Red");
    System.out.print(p1.getColor());
    // BankAccount myacc=new BankAccount();
    // myacc.username = "Damian";
    // myacc.setpassword("Dammm"); 
    }

    
}

// class BankAccount{
//     public String username;
//     private String password;
//     public void setpassword(String pwd){
//         password=pwd;
//     }
// }

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color=newColor;
    }

    void setcolor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}


