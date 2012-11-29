package PrefixSearch;

public abstract class ArraySearcher implements PrefixSearchable{

private String[] substrings;

    public String[] findSubstrings(String prefix){      
        
        
        return null;
    }

    public void precompile(String parent){
        for(int i=0; i<parent.length(); i++){
            substrings[i] = parent.substring(i);
        }
    }
    
}