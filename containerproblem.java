import java.util.ArrayList;

public class containerproblem {
    // public static int Storewater(ArrayList<Integer> height){
    //     int maxwater = 0;
    //     //brute force
    //     for(int i=0;i<height.size();i++){
    //         for(int j=i+1;j<height.size();j++){
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int width = j-i;
    //             int currwater=ht * width;
    //             maxwater = Math.max(maxwater, currwater);
    //         }
    //     }
    //     return maxwater;
    // }
        //2 pointer approach
    public static int Storewater(ArrayList<Integer> height){
        int maxwater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while(lp < rp){
            //calculate area of water
            int ht = Math.min(height.get((lp)),height.get(rp));
            int width = rp - lp;
            int currwater = ht * width;
            maxwater = Math.max(maxwater,currwater);


            //update pointers
            if(height.get(lp) < height.get(rp)){
                lp++;

            }else{
                rp--;

            }
        }
        return maxwater;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.print(Storewater(height));
    }
}
