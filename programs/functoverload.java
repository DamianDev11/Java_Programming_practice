public class functoverload {

    //public static int sum(int a,int b){
    //    return a+b;
    //}

    //public static int sum(int a,int b,int c){
      //  return a+b+c;
    //}

    public static float sum(float a,float b){
        return a+b;
    }

    public static float sum(float a,float b,float c){
        return a+b+c;
    }
    
    public static void main(String args[]){
        
        

        System.out.println("Sum of 2 nos. is :" + sum(12.5f,13.5f));

        System.out.println("Sum of 3 nos. is :" + sum(11.5f,12.5f,13.5f));
    }
}
