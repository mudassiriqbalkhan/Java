// print duplicate elements:
 public class DuplicateArrayElement {
	
	public void display() {
		
		int array1[] = {1,2,3,4,5,6,7,7};
		for(int i=0; i<array1.length;i++) {
			for(int j=i+1;j<array1.length;j++) {
				if(array1[i] == array1[j]) {
					System.out.println(j);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		DuplicateArrayElement d = new DuplicateArrayElement();
		d.display();
	}
}