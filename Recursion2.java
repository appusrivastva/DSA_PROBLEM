public class Recursion2 {
    /*
     * TILING prbllem=>floor size=2*n
     * where n is length of floor
     * and 2 is bredth of floor
     * size of tiles =>2*1
     * count the number the ways to tile the given board using 2*1 tiles
     */
    public static int tiling_problem(int n){
        //base condition
        if(n==0 || n==1){
            return 1;
        }
        
        //vertical choices
        int fnm1=tiling_problem(n-1);
        //horizontal choice 
        int fnm2=tiling_problem(n-2);
        int total_ways=fnm1+fnm2;
        return total_ways;
    }
    public static void main(String[] args) {
        System.out.println(tiling_problem(6));
        
        
    }
}
