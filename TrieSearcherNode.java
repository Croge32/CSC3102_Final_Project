public class TrieSearcherNode {
	
	public char key;
	public TrieSearcherNode[] nodes;
	
	public TrieSearcherNode(){
		this.key = (char)0;
	}
	
	public TrieSearcherNode(char c){
		this.key = c;
	}
	
	public void add(char character){
		// Empty Array Case
		if (this.nodes == null){
			this.nodes = new TrieSearcherNode[1];
			this.nodes[0] = new TrieSearcherNode(character);
		
		// Existing Array Case
		} else {
			// TODO Add node to existing nodes array
		}
	}
	
	public void add(String string){
		if (string.length() <= 0) throw new IllegalArgumentException("Cannot Add Empty String");
		TrieSearcherNode newNode = new TrieSearcherNode(string.charAt(0));
		if (string.length() < 1) newNode.add(string.substring(1, string.length()-1));
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