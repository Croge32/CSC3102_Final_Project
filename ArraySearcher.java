package PrefixSearch;

import java.util.Arrays;

public class ArraySearcher implements PrefixSearchable{

private String[] substrings;
private String[] prefixSubs;
private String p;
private int parentLength;

    public String[] findSubstrings(String prefix){ 
        precompile(p);
        int count = 0;
        int index = binarySearch(substrings, prefix);
        if (prefix.compareTo(substrings[index].substring(0, prefix.length()-1))==0){
            prefixSubs[count] = substrings[index];
            count++;
        }
        return prefixSubs;
    }

    public void precompile(String parent){
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
    
}