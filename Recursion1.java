public class Recursion1 {
    /*PROBLEM IS=>
     *       PRINT X  TO THE POWER  OF n
    */
    //CREATING A USER-DEFINED FUNCTION
    public static int print_Pow(int x,int n){
        if(n==1){
            return x;
        }
        return x*print_Pow(x,n-1);

    }
    //time complexity=> O(n)

    public static void main(String[] args) {
        
        System.out.println(print_Pow(2, 05));
        
    }
}
