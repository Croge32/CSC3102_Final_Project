package PrefixSearch;

public class PrefixSearcher {
    
    public static void main(String[] args){
        ArraySearcher a = new ArraySearcher();
        String s = "string";
        String[] sArray = new String[s.length()];
        a.precompile(s);
        sArray = a.substrings;
        for(int i=0; i<sArray.length; i++){
            System.out.println(sArray[i]);
        }
        System.out.println(a.binarySearch(sArray, s));
    }
    
}