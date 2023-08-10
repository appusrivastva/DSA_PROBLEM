public class Recursion3 {
    //FRIEND -PAIRING PROBLEM
    public static int friendPairing(int n){
        //BASE condition
        if(n==1 || n==2){
            return n;
        }
        //choice 
        //1.single
        int fnm1=friendPairing(n-1);
        //2.pairing
        int fnm2=friendPairing(n-2);
        int pairWays=(n-1)*fnm2;

        //total ways
        int total_ways=fnm1+pairWays;
        return total_ways;

    }
    public static void main(String[] args) {
        System.out.println(friendPairing(3));
    }
}
