package PrefixSearch;

public class TrieSearcherNode implements Comparable {
    
    public char key;
    public TrieSearcherNode[] nodes;
    
    public TrieSearcherNode(){
        this.key = (char)0;
    }
    
    public TrieSearcherNode(char c){
        this.key = c;
    }
    
    public int compareTo(Object n){
        TrieSearcherNode node = (TrieSearcherNode)n;
        return (int)this.key - (int)node.key;
    }
    
    public void add(char character){
        TrieSearcherNode newNode = new TrieSearcherNode(character);
        add(newNode);
    }
    
    public void add(String string){
        if (string.length() <= 0) throw new IllegalArgumentException("Cannot Add Empty String");
        TrieSearcherNode newNode = new TrieSearcherNode(string.charAt(0));
        if (string.length() > 1) newNode.add(string.substring(1, string.length()-1));
        add(newNode);
    }
    
    public void add(TrieSearcherNode node){
        // TODO Add new node
    }
    
    public String[] getSubstrings(){
        // TODO Run down Trie to get array of substrings
        
        return null;
    }
    
}