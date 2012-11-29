package PrefixSearch;

import java.util.Arrays;

public class ArraySearcher implements comparable, PrefixSearchable{

private String[] substrings;

    public String[] findSubstrings(String prefix){      
        
        return null;
    }

    public void precompile(String parent){
        for(int i=0; i<parent.length(); i++){
            substrings[i] = parent.substring(i);
        }
        Arrays.sort(substrings);
    }
    
}