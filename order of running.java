class BaseTmp{
	BaseTmp(){
		System.out.println("BaseTmp instance");
	}
}


class Base{
	BaseTmp tmp = new BaseTmp();
	static {
		System.out.println("Base Static");
	}
	Base(){
		System.out.println("Base instance");
	}
}


class BaseChild extends Base{
	BaseTmp tmp = new BaseTmp();
	static {
		System.out.println("BaseChild Static");
	}
	BaseChild(){
		System.out.println("BaseChild instance");
	}
}




public class Demo{
	
	public static void main(String[] args) {
		
		new BaseChild();
	}
}
