public class Recursion5 {
        //Remove Duplicate string 
        public static void removeDuplicate_String(String str,StringBuilder newstr,boolean map[],int idx){
            //base condition
            if(idx==str.length()){
                System.out.println(newstr);
                return;
            }
            char currChar=str.charAt(idx);
            if(map[currChar-'a']==true){
                //duplicate
                removeDuplicate_String(str, newstr, map, idx+1);
            }
            else{
                map[currChar-'a']=true;
                removeDuplicate_String(str, newstr.append(currChar), map, idx+1);
            }
    
    
        }
        public static void main(String[] args) {
            String str="aaapporvv";
            removeDuplicate_String(str, new StringBuilder(""),new boolean[26], 0);
            
        }
     }
    

