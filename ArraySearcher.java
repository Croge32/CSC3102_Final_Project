package PrefixSearch;

import java.util.Arrays;

public class ArraySearcher implements PrefixSearchable{

public String[] substrings;
private String[] prefixSubs;
private String p;
private int parentLength;

    @Override
    public String[] findSubstrings(String prefix){ 
        precompile(p);
        int count = 0;
        int index = binarySearch(substrings, prefix);
        int reset = index;
        while (prefix.compareTo(substrings[index].substring(0, prefix.length()-1))==0){
            index--;
            if(prefix.compareTo(substrings[index].substring(0, prefix.length()-1))<0){
                for (int i=index; i<=reset; i++){
                    prefixSubs[count] = substrings[index];
                    count++;
                }
                index = reset;
            }
            prefixSubs[count] = substrings[index];
            index++;
            if(prefix.compareTo(substrings[index].substring(0, prefix.length()-1))>0){
                count++;
                for (int i=reset; i<=index; i++){
                    prefixSubs[count] = substrings[index];
                }
            }
        }
        return prefixSubs;
    }

    @Override
    public void precompile(String parent){
        this.substrings = new String[parent.length()];
        for(int i=0; i<parent.length(); i++){
            substrings[i] = parent.substring(i);
        }
        Arrays.sort(substrings);
    }
    
    public int binarySearch(String[] s, String key){
        int low = 0;
        int high = s.length - 1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if (key.compareTo(s[mid]) == -1) {high = mid - 1;}
            else if (key.compareTo(s[mid]) == 1) {low = mid + 1;}
            else return mid;
        }
        return -1;
    }
    
    public static void main(String[] args){
        ArraySearcher a = new ArraySearcher();
        String s = "string";
        String[] sArray = new String[s.length()];
        a.precompile(s);
        sArray = a.substrings;
        for(int i=0; i<sArray.length; i++){
            System.out.println(sArray[i]);
        }
    }
}
