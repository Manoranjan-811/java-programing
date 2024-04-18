package Array;
import java.util.Scanner;
public class Shorting{
     public static void main (String args[]){
    int[] arr=new int[6];
    int temp;
    Scanner sc =new Scanner(System.in);
   System.out.println(" Enter Element in array:");
  for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
     for(int j=0;j<arr.length;j++){
          if(arr[i]<arr[j]){
         temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
  }
        }
    }
    System.out.println("The shorting Array is :");
   for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
   }
}

}
