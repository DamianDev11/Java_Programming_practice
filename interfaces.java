public class interfaces {
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
    }
    
}

interface Chessgame{
    void moves();
}

class Queen implements Chessgame{
    public void moves(){
        System.out.print("up,down,left,right,diagonal(all)");
    }
}

class Rook implements Chessgame{
    public void moves(){
        System.out.print("up,down,left,right");
    }
}

class King implements Chessgame{
    public void moves(){
        System.out.print("up,down,left,right,diagonal by 1 step");
    }
}
