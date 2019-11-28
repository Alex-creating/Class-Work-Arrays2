package arrays;

public class arrays {

	public static void main(String[] args) {
	int [] numbers = {15, 433, 654, 42, 83, 34, 921, 43, 11, 68};
	for (int i=0; i<10; i++) {
		System.out.println(numbers[i]);
		
	int [] oneToTen = {1,1,1,1,1,1,1,1,1,1};
	for (int j : oneToTen) {
		System.out.print(j);
		for (int k=0; k<10; k++) {
			oneToTen[k] = oneToTen[k]+1;
		}System.out.print(" ");
	}
	}
	
	
	}

	
	
}
