package smallerAndGreater;

public class LargerNumberPick {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,21,45,2,66,88};
		int greatest =arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>greatest) {
				greatest=arr[i];
			}
		}
		System.out.println(greatest);

	}

}
