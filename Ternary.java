import java.util.Scanner;
class Ternary {
	public static void main (String arghs[]){
         Scanner sc =new Scanner (System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        String result= num>0?"+ve":num<0?"-ve":"zero";
        System.out.println("The number is:"+result);

   }
}

