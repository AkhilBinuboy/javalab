
public class Binarysearch {

	static int index = -1;
	public static int binarySearch(int A[],int lb,int ub,int key){
	if(lb <= ub){
	int mid = (lb + ub)/2;
	if(A[mid] == key)
	index = mid;
	else if(A[mid] > key)
	binarySearch(A,lb,mid-1,key);
	else
	binarySearch(A,mid+1,ub,key);
	}
	return index;
	}
	public static void main(String args[]){
	int [] A = {1,7,23,45,56,62,67,98};
	int key = 7;
	int index = binarySearch(A,0,7,key);
	if(index == -1)
	System.out.println("Element not found");
	else
	System.out.println("Element found at index "+index);
	}
	}
