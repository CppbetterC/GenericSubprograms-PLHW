package iecs;

public class Main {

	public static void main(String[] args) {
		// Test data
		int[] dataA = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		float[] dataB = {(float)9.9, (float)8.8, (float)7.7, (float)6.6, 
				(float)5.5, (float)4.4, (float)3.3, (float)2.2, (float)1.1};
		String[] dataC = {"a", "b", "c", "d", "e", "A", "B", "C", "D", "E"};

//		// NNInteger
//		NNEntity DataA = new NNInteger(dataA);
//		TableDisplay.sortingAndShow(DataA);
//		TableDisplay.searchingAndShow(DataA);
		
		// NNFloat
//		NNEntity DataB = new NNFloat(dataB);
//		TableDisplay.sortingAndShow(DataB);
//		TableDisplay.searchingAndShow(DataB);

		// NNString
		NNEntity DataC = new NNString(dataC);
//		TableDisplay.sortingAndShow(DataC);
		TableDisplay.searchingAndShow(DataC);

	}

}
