public class Quicksort {
	public static int partition(String[] A,int p,int r){String temp;
	String x = A[r];
	int i = p-1;
	for(int j = p; j <= r-1; j++){
	if(A[j].compareTo(x) <= 0){
	i = i+1;
	temp = A[i];
	A[i] = A[j];
	A[j] = temp;
	}
	}
	temp = A[i+1];
	A[i+1] = A[r];
	A[r] = temp;
	return i+1;
	}
	public static void quickSort(String [] A,int p,int r){
	if(p < r){
	int q = partition(A,p,r);
	quickSort(A,p,q-1);
	quickSort(A,q+1,r);
	}
	}
	public static void main(String [] args){
	String names[] ={"Sangeeth","Poornima",
	"Pratheesh","Vikas","Karthi","Abin"};
	quickSort(names,0,5);
	System.out.println("After QuickSort");
	for(int i=0;i<names.length;i++){
	System.out.println(names[i]);
	}
	}
	}

