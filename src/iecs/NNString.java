package iecs;

import java.util.Scanner;

public class NNString extends NNEntity{
	private String[] originalData;
	private boolean flag;
	Scanner scanner = new Scanner(System.in);
	
	public NNString(String[] data) {
		this.originalData = data;
	}
	
	@Override
	public NNEntity bubbleSorting() {
		String temp;
		for(int i  = 0; i < this.originalData.length; i++) {
			for(int j = 0; j < this.originalData.length - 1; j++) {
				if((int)this.originalData[j].charAt(0) > 
				(int)this.originalData[j + 1].charAt(0)){
					temp = this.originalData[j];
					this.originalData[j] = this.originalData[j + 1];
					this.originalData[j + 1] = temp;
				}
			}
		}
		return new NNString(this.originalData);
	}

	@Override
	public NNEntity quickSorting() {
		int left = 0;
		int right = this.originalData.length - 1;
		return new NNString(quickSort(left, right, this.originalData));
	}
	
	public String[] quickSort(int left, int right, String[] numberArray) {
	     if(left > right)
	        {
	            return null;
	        }
	        int startIndex = left; 
	        int endIndex = right;   
	        String baseValue = numberArray[left]; 
	        String temp;  
	 
	        while (startIndex != endIndex)
	        {
	            while ((int)numberArray[endIndex].charAt(0) >= (int)baseValue.charAt(0) && startIndex < endIndex){
	                endIndex--;
	            }
	            while ((int)numberArray[startIndex].charAt(0) <= (int)baseValue.charAt(0) && startIndex < endIndex){
	                startIndex++;
	            }
	 
	            if (startIndex < endIndex){
	                temp = numberArray[startIndex];
	                numberArray[startIndex] = numberArray[endIndex];
	                numberArray[endIndex] = temp;
	            }
	        }
	 
	        numberArray[left] = numberArray[startIndex];
	        numberArray[startIndex] = baseValue;
	 
	        quickSort(left, startIndex - 1, numberArray);
	        quickSort(startIndex + 1, right, numberArray);
	 
		return numberArray;
	}

	@Override
	public boolean sequentialSearching() {
		System.out.println("Input the value what you want to find : ");
		String target = scanner.next();
		for(int i = 0; i < this.originalData.length; i++) {
			if ((int)this.originalData[i].charAt(0) == (int)target.charAt(0)) {
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public boolean binarySearching() {
		System.out.println("Input the value what you want to find : ");
		String target = scanner.next();
		int left = 0, right = this.originalData.length - 1;

		String temp;
		for(int i  = 0; i < this.originalData.length; i++) {
			for(int j = 0; j < this.originalData.length - 1; j++) {
				if((int)this.originalData[j].charAt(0) > (int)this.originalData[j + 1].charAt(0)){
					temp = this.originalData[j];
					this.originalData[j] = this.originalData[j + 1];
					this.originalData[j + 1] = temp;
				}
			}
		}
		while(left <= right) {
			int middle = left +(right - left) / 2;
			if((int)this.originalData[middle].charAt(0) == (int)target.charAt(0)) {
				return true;
			}
			else if ((int)this.originalData[middle].charAt(0) < (int)target.charAt(0)) {
				left = middle + 1;
			}
			else {
				right = middle - 1;
			}
		}
		return flag;
	}
	
	public void showData(){
		for(int i = 0; i < this.originalData.length; i++) {
			System.out.println("index[" + i + "] : " + this.originalData[i]);
		}
	}

}
