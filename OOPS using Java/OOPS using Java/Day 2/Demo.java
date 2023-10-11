class Demo{
	int a=10;
	static int b=20;
	
	static void show(){
		Demo d=new Demo();
		int c=d.a+b;
		System.out.println(c);
	}
	
	public static void main(String ar[]){
		/*Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();*/
		
		b=100;
		show();
		/*d1.show();
		d2.show();
		d3.show();*/
		
		
	}
}

