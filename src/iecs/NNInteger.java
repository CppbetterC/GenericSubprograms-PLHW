package iecs;

import java.util.Scanner;

public class NNInteger extends NNEntity{
	private int[] originalData;
	private boolean flag = false;
	Scanner scanner = new Scanner(System.in);
	
	public NNInteger(int[] data) {
		this.originalData = data;

	}
	
	@Override
	public NNEntity bubbleSorting() {
		int temp;
		for(int i  = 0; i < this.originalData.length; i++) {
			for(int j = 0; j < this.originalData.length - 1; j++) {
				if(this.originalData[j] > this.originalData[j + 1]){
					temp = this.originalData[j];
					this.originalData[j] = this.originalData[j + 1];
					this.originalData[j + 1] = temp;
				}
			}
		}
		return new NNInteger(this.originalData);
	}

	@Override
	public NNEntity quickSorting() {
		int left = 0;
		int right = this.originalData.length - 1;
		return new NNInteger(quickSort(left, right, this.originalData));
	}
	
	public int[] quickSort(int left, int right, int[] numberArray) {
	     if(left > right)
	        {
	            return null;
	        }
	        int startIndex = left; 
	        int endIndex = right;   
	        int baseValue = numberArray[left]; 
	        int temp;  
	 
	        while (startIndex != endIndex)
	        {
	            while (numberArray[endIndex] >= baseValue && startIndex < endIndex)
	            {
	                endIndex--;
	            }
	 
	            while (numberArray[startIndex] <= baseValue && startIndex < endIndex)
	            {
	                startIndex++;
	            }
	 
	            if (startIndex < endIndex)
	            {
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
		int target = scanner.nextInt();
		for(int i = 0; i < this.originalData.length; i++) {
			if (this.originalData[i] == target) {
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public boolean binarySearching() {
		System.out.println("Input the value what you want to find : ");
		int target = scanner.nextInt();
		int left = 0, right = this.originalData.length - 1;

		int temp;
		for(int i  = 0; i < this.originalData.length; i++) {
			for(int j = 0; j < this.originalData.length - 1; j++) {
				if(this.originalData[j] > this.originalData[j + 1]){
					temp = this.originalData[j];
					this.originalData[j] = this.originalData[j + 1];
					this.originalData[j + 1] = temp;
				}
			}
		}
		while(left <= right) {
			int middle = left + (right - left) / 2;
			if(this.originalData[middle] == target) {
				return true;
			}
			else if (this.originalData[middle] < target) {
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
