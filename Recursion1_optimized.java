public class Recursion1_optimized {
    //Problem => print x to  power  of n
    // power function
    public static int pow(int x,int n){
        //base condition
        if(n==0){
            return 1;
        }
        //In case of even =>n
        int halfPow=pow(x, n/2);
        int halfPow_square=halfPow*halfPow;
        //In case of odd =>n
        if(n %2!=0){
            halfPow_square=x*pow(x, n/2)*pow(x, n/2);
        }
        return halfPow_square;
        

    }
    //time-complexity => O(logn)
    public static void main(String[] args) {
        System.out.println(pow(12, 03));
        
    }
    
}
