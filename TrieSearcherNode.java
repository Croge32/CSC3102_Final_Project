package PrefixSearch;

public class TrieSearcherNode implements Comparable {
    
    private boolean testOutput = false;
    public char key;
    public TrieSearcherNode[] nodes;
    
    public static void main(String[] args){
        TrieSearcherNode testNode = new TrieSearcherNode();
        TrieSearcherNode otherNode = new TrieSearcherNode('a');
        testNode.add(otherNode);
        testNode.add('b');
        testNode.add("string");
        System.out.println(testNode);
    }
    
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
        System.out.println(string.length() + " " + string);
        if (string.length() <= 0) throw new IllegalArgumentException("Cannot Add Empty String");
        TrieSearcherNode newNode = new TrieSearcherNode(string.charAt(0));
        if (string.length() > 1) newNode.add(string.substring(1, string.length()));
        add(newNode);
    }
    
    public void add(TrieSearcherNode node){
        // Add first node
        if (this.nodes == null){
            this.nodes = new TrieSearcherNode[1];
            this.nodes[0] = node;
            return;
        }
        
        // Add a new node
        int nodeIndex = search(node.key);
        // Add nonexistent node
        if (nodeIndex >= 0){
            // TODO Add nonexistant node
        }
        // Expand on existing node
        else {
            // TODO Add existing node
        }
    }
    
    public String[] getSubstrings(){
        // TODO Run down Trie to get array of substrings
        
        return null;
    }
    
    public String toString(){
        String s = "+" + this.key;
        for (int i = 0; this.nodes != null && i < this.nodes.length; i++){
            s = s + "\n" + this.nodes[i].toString();
        }
        return s;
    }
    
    private int search(char character){
        // Return -1 if this node doesn't have any characters
        if (this.nodes == null || this.nodes.length == 0) return -1;
        
        // Binary search the node array to find the desired node
        int low = 0;
        int high = this.nodes.length-1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (character < this.nodes[mid].key) high = mid - 1;
            else if (character > this.nodes[mid].key) low = mid + 1;
            else return mid;
        }
        return -1;
    }
    
}