public class Recursion4 {
    //Binary string Problem=>print all  binary string withour consecutive ones
    public static void print_BinaryString(int n,String str,int last_place){
        //base case
        if(n==0){
            System.out.println(str);//=>1."000" 2."001" 3."010" 4."100" 5."101"
            return;
        }
        
        print_BinaryString(n-1, str+"0", 0);
                                                          /* =>[0,00,000] ,
                                                            [0,01,010],
                                                            [1,10,100],*/
        if(last_place==0){
            print_BinaryString(n-1, str+"1",1);//=>,[0,00,001],[0,01],[1],[1,10,101]
        }
     
    }
    public static void main(String[] args) {
        print_BinaryString(3,"",0);
    }
}
