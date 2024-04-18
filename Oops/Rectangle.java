package Oops;
import java.util.Scanner;
public class Rectangle {
 private double width;
 private double height;
 public Rectangle(double width,double height) {
	 this.width=width;
	 this.height=height;
 }
	public double calculateArea() {
		 return (width*height);
	 }
 public double calculatePerimeter() {
	 return 2*(width+height);
 } 



	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the width of a Rectangle is:");
     double width=sc.nextDouble();
     System.out.println("Enter the height of a Rectangle:");
     double height=sc.nextDouble();
     
     Rectangle rect=new Rectangle(width, height);
     double area =rect.calculateArea();
     double perimeter=rect.calculatePerimeter();
     System.out.println("The Area of The Rectangle is:"+area);
     System.out.println("The Peremeter of the Rectangle is:"+perimeter);

	}
	}


