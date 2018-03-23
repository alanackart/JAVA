package alan;

public class User {

	private String id;
	private String psw;
	private int login = 0; // no modifier
	
	public User(String i, String p) {
		// TODO Auto-generated constructor stub
		id = i;
		psw = p;
		
	}
	public String get_id()
	{
		//System.out.println("id is " + id);
		return this.id;
	}
	public String get_psw()
	{
		//System.out.println("psw is " + psw);
		return this.psw;
	}
	public void inc_login()
	{
		System.out.println("before login count is " + login);
		login++;
		System.out.println("after login count is " + login);
	}

}
