import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    static Set<String> set = new TreeSet<>();
    
    static void permString(String str){
        permString(str,0,str.length()-1);
    }
    
    static void permString(String str,int l,int r){
        if(l==r){
            if(set.contains(str)) return;
            set.add(str);
            System.out.print(str+" ");
            return;
        }
        for(int i=l;i<=r;i++){
            if(l!=i)
            str = interchangeString(str,l,i);
            permString(str,l+1,r);
            if(l!=i)
            str =interchangeString1(str,l,i);
        }
    }
    
    static String interchangeString(String str,int a,int b){
        char arr[]=str.toCharArray();
        char temp=arr[b];
        for(int i=b;i>a;i--){
            arr[i]=arr[i-1];
        }
        arr[a]=temp;
        return String.valueOf(arr);
    }
    
    static String interchangeString1(String str,int a,int b){
        char arr[]=str.toCharArray();
        char temp=arr[a];
        for(int i=a;i<b;i++){
            arr[i]=arr[i+1];
        }
        arr[b]=temp;
        return String.valueOf(arr);
    }
    
	public static void main (String[] args) {
		Scanner ss = new Scanner(System.in);
		int t=ss.nextInt();
		for(int x=0;x<t;x++){
		    String str = ss.next();
		    char arr[]=str.toCharArray();
		    Arrays.sort(arr);
		    String s=String.valueOf(arr);
		    permString(s);
		    System.out.println();
		}
	}
}