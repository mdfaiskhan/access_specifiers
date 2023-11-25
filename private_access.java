package access_modifiers;
class B{
	public int submarks=60;
}
class C{
	int submarks=50;
}

public class private_access {
		private int submarks=70;
	public static void main(String[] args) {
				a ob=new a();
			System.out.println(ob.marks);
			
			private_access ob1= new private_access();
			System.out.println(ob1.submarks);
			
			B ob3=new B();
			System.out.println(ob3.submarks);

			C ob4=new C();
			System.out.println(ob4.submarks);		
	}
	}


