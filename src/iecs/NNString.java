package iecs;

public class NNString extends NNEntity{
	private String[] originalData;
	
	public NNString(String[] data) {
		this.originalData = data;
	}
	
	@Override
	public NNEntity bubbleSorting() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean sequentialSearching() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean binarySearching() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void showData(){
		for(int i = 0; i < this.originalData.length; i++) {
			System.out.println("index[" + i + "] : " + this.originalData[i]);
		}
	}

}
