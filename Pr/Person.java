package Pr;

public class Person {
	String name;
	int age;
	public Person(String name ,int age) {
		this.name= name;
	  this.age= age	;	 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person p =new Person("Mr Das",23);
       Person p1=new Person("Rakesh",22);
       
      System.out.println("The Details of First Person :");
      System.out.println("Name:"+p.name);
      System.out.println("Age:"+p.age);
      System.out.println("***************************************************");
      System.out.println("The details of Second Person");
      System.out.println("Name:"+p1.name);
      System.out.println("Age:"+p1.age);
      
	}

}
