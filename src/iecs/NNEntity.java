package iecs;

public abstract class NNEntity {

	// O(n**2) bubbleSorting
	public abstract NNEntity bubbleSorting();
	
	// O(log2n) quickSorting
	public abstract NNEntity quickSorting();
	
	// O(n) Sequential Search
	public abstract boolean sequentialSearching();
	
	// O(log2n)Binary Search
	public abstract boolean binarySearching();
	
	public abstract void showData();
}
