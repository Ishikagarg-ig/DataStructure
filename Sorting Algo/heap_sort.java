import java.util.*;

class Main{

	void sort(int[] arr){
	    int n=arr.length;
	    
	    for(int i=n/2-1;i>=0;i--){
		heapify(arr,n,i);
	    }

	    for(int i=n-1;i>=0;i--){
		
		int temp=arr[0];
		arr[0]=arr[i];
		arr[i]=temp;

		heapify(arr,i,0);
	    }
	}

	void heapify(int[] arr,int n,int i){
	    int largest=i;
	    int l=2*i+1;
	    int r=2*i+2;
	    
	    if(l<n && arr[l]>arr[largest])
		largest=l;
	    if(r<n && arr[r]>arr[largest])
		largest=r;

	    if(largest!=i){
               int temp=arr[largest];
	       arr[largest]=arr[i];
	       arr[i]=temp;	
	    }
	    
            heapify(arr,n,largest);
	}

	void print(int[] arr){

	    for(int i=0;i<arr.length;i++){

	        System.out.println(arr[i]);

	    }

	}

	public static void main(String args[]){
	    Scanner ss = new Scanner(System.in);
	    int n=ss.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
		arr[i]=ss.nextInt();
	    }
	    
	    Main m=new Main();
	    m.sort(arr);
	    m.print(arr);
	}
}