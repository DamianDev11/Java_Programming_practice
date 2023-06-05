public class comparestring {
    public static void main(String args[]){
        String s1 ="dam";
        String s2 = "dam";
        String s3 = new String("dam");

        if(s1==s2){
            System.out.println("same content");
        }else{
            System.out.println("different content");
        }
        if(s1==s3){
            System.out.println("same content");
        }else{
            System.out.println("different content");
        }

        if(s1.equals(s3)){
            System.out.println("same content");
        }else{
            System.out.print("different content");
        }
    }
    
}
