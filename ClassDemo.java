/*
 * 
 *  
 *  
 *  Create Employee class 
 *  
 *  Attributes....
 *  
 *  name
 *  org
 *  salary
 *  dept
 *  
 *  
 *  
 */
class MyMath{
	int add(int a,int b){
		return a+b;
	}
	
	int add(int a,int b,int c){
		return add(a,b)+c;
	}
	
	
	int mul(int a,int b) {
		return a * b;
	}
	
}
class Student{
	
	int rollno;
	String name;
	int fee;
	String address;
	
	
	public  Student(int rollno, String name, int fee, String address) {
	
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
		this.address = address;
		
		
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", fee=" + fee + ", address=" + address + "]";
	}




	
}


public class ClassDemo {
	


	public static void main(String[] abc) {


		MyMath math = new MyMath();
				
		
		int twoNosAdd = math.add(100, 200,300);
		
		System.out.println(twoNosAdd);
		/// new Employee(100,"Ramu",45000,"IT");
		
	}
}

