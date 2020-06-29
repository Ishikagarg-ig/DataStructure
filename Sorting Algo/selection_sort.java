import java.util.*;

class Main{
       
   static void selectionSort(int[] arr){
      for(int i=0;i<arr.length;i++){
	  int min=arr[i],index=i;
	  for(int j=i;j<arr.length;j++){
	  	if(min>arr[j]){
                  min=arr[j];
		  index=j;
                }
           }
	   int tmp=arr[index];
           arr[index]=arr[i];
	   arr[i]=tmp;
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
      selectionSort(arr);
      print(arr);
   }
}