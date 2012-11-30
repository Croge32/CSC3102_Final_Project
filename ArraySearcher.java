package PrefixSearch;

import java.util.Arrays;

public class ArraySearcher implements PrefixSearchable{

public String[] substrings;
private String[] prefixSubs;
private String p;

    @Override
    public String[] findSubstrings(String prefix){ 
        
        p = this.substrings[0];
        substrings = new String[p.length()];
        precompile(p);
        int count = 0;
        int index = binarySearch(substrings, prefix);
        int reset = index;
        if (prefix.compareTo(substrings[index].substring(0, prefix.length()-1)) == 0){
            
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
            if (key.compareTo(s[mid])<0) {high = mid - 1;}
            else if (key.compareTo(s[mid])>0) {low = mid + 1;}
            else return mid;
        }
        return -1;
    }
}
