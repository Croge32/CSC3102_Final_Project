package PrefixSearch;

public class TrieSearcher implements PrefixSearchable{
    
    TrieSearcherNode rootNode;
    
    public String[] findSubstrings(String prefix){
        // TODO Use precompiled parent to search out substrings
        
        return null;
    }
    
    public void precompile(String parent){
        rootNode = new TrieSearcherNode();
        for(int i = 0; i < parent.length(); i++){
            rootNode.add(parent.substring(i));
        }
    }
    
}