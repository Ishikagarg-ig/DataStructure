import java.util.*;

class Main{

	void partition(int[] arr,int l,int r){
	    int pivot=arr[r];
	    int k=l-1;
	    
	    for(int i=l;i<r;i++){
		if(arr[i]<pivot){
		   k++;

		   int tmp=arr[i];
		   arr[i]=arr[k];
		   arr[k]=tmp;
		}
	    }

	    int temp=arr[k+1];
	    arr[k+1]=arr[r];
	    arr[r]=temp;

	    return i+1;
	}

	void sort(int[] arr,int l,int r){
	    if(l<r){
		int pi=partition(arr,l,r);
		
		sort(arr,l,pi-1);
		sort(arr,pi+1,r);
	    }
	}

	void printArray(int[] arr){
	    for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	    }
	}		

	public static void main(String[] args){
	    Scanner ss = new Scanner(System.in);
	    int n=ss.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
		arr[i]=ss.nextInt();
	    }
	    Main m=new Main();
	    m.sort(arr,0,arr.length-1);

	    m.printArray(arr);
	}
}