public class FRIENDSpair {
    public static int friendspairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        //int fnm1 = friendspairing(n-1);

        //pair
        // int fnm2 = friendspairing(n-2);
        // int pairways = (n-1)*fnm2;
        // int totalways = fnm1 + pairways;
        // return totalways;

        return friendspairing(n-1)+((n-1)*friendspairing(n-2));
    }
    
    public static void main(String args[]){
        System.out.print(friendspairing(3));
    }
}
