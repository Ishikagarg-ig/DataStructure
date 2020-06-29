import java.util.*;

class Main{
       
   static void insertionSort(int[] arr){
      for(int i=1;i<arr.length;i++){
           int j=i-1;
	   
           while(j>=0 && arr[j]>arr[i]){
                 arr[j+1]=arr[j];
                 j--;
           }
          arr[j+1]=arr[i];
      }
   }

  static void print(int[] arr){
     for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
      }
  }

   public static void main(String[] args){
      Scanner ss=new Scanner(System.in);
      int n=ss.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
           arr[i]=ss.nextInt();
      }
      insertionSort(arr);
      print(arr);
   }
}