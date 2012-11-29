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
    
    public int search(char character){
        // Return -1 if this node doesn't have any characters
        if (this.nodes == null || this.nodes.length == 0) return -1;
        
        // Binary search the node array to find the desired node
        boolean finished = false;
        int low = 0;
        int high = this.nodes.length-1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (character < this.nodes[mid]) high = mid - 1;
            else if (character > this.nodes[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
        
    }
    
}