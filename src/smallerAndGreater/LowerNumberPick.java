package smallerAndGreater;

public class LowerNumberPick {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,21,45,2,66,88};
		int smallest =arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println(smallest);

	}


}
