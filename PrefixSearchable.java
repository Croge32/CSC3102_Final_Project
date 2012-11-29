package PrefixSearch;

public interface PrefixSearchable {
	
	public String[] findSubstrings(String prefix);
	public void precompile(String parent);
	
}