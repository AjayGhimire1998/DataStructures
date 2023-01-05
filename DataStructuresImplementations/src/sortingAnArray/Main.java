package sortingAnArray;

public class Main {

	public static void main(String[] args) {
		char[] chars = { 'A', 'G', 'Y', 'B', 'O', 'L', 'E', 'Z', 'C' };
		insertionSort(chars);
//		System.out.println(Arrays.toString(chars));
	}

	public static void insertionSort(char[] data) {
		for (int i = 1; i < data.length; i++) { // begin with the second char
			char current = data[i]; // time to insert current = data[i]
			System.out.println("current in for loop : " + current);
			int j = i; // find correct index j for current
			System.out.println("j in for loop: " + j);
			System.out.println(" data j-1 in for loop: " + data[j - 1]);
			while (j > 0 && data[j - 1] > current) { // thus, data[j-1] must go after current
				System.out.println("data j-1 in while loop: " + data[j - 1]);
				data[j] = data[j - 1]; // slide data[j-1] rightward
				System.out.println("data j in while loop: " + data[j]);
				j--; // consider previous j for current
				System.out.println("j-- in while loop: " + j);
				System.out.println();
			}
			data[j] = current; // this is the proper place for current
			System.out.println("current after while loop: " + data[j]);
			System.out.println();
		}
	}

}