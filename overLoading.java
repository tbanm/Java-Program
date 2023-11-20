package java_objects;
class Arith{
	void oper() {
		System.out.println("Arithmatic operation is:");	
		}
}
class Add extends Arith{
int oper(int a,int b) {
int addi = a+b;
return addi;
}
}
class sub extends Arith{
int oper(int a,int b) {
int subs = a-b;
return subs;
}
}
class multi extends Arith{
int oper(int a,int b) {
int mul = a*b;
return mul;
}
}
class divi extends Arith{
int oper(int a,int b) {
int div = a/b;
return div;
}
}


public class overLoading {

	public static void main(String[] args) {
		Arith a = new Arith();
		a.oper();
		Add a1 = new Add();
		System.out.println("addition =" + a1.oper(8, 70));
		sub a2 = new sub();
		System.out.println("Substraction =" + a2.oper(10,20));
		multi a3 = new multi();
		System.out.println("Multiplication =" + a3.oper(5,10));
		divi a4 = new divi();
		System.out.println("Divition =" + a4.oper(50,5));
	

	}

}
