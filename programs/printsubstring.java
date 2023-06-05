public class printsubstring {
    public static String substring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]){
        String dam = "HelloWorld";
        System.out.print(dam.substring(0,6));
        //System.out.print(substring(dam, 0, 6));
    }
    
}
