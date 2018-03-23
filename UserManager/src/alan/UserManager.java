/**
 * 
 */
package alan;
import java.util.*;
/**
 * @author Alan
 *
 */
public class UserManager {

	/**
	 * 
	 */

	ArrayList<User> a = new ArrayList<User>();
	private void add_user(String id, String psw)
	{
		System.out.println("before add, size is " + a.size());
		User t = new User(id, psw);
		a.add(t);
		System.out.println("after add, size is " + a.size());
	}
	private void del_user(String id)
	{
		System.out.println("before del, size is " + a.size());
		for(Iterator<User> it = a.iterator(); it.hasNext();)
		{
			User u = it.next();
			if(u.get_id() == id)
			{
				
				it.remove();
				System.out.println("after del, size is " + a.size());
			}
		}
		
		
		
	}
	private Boolean isExist(String uname)
	{
		for(User t : a)
		{
			if(t.get_id() == uname)
			{
				System.out.println("User " + uname + " exists");
				return true;
			}
		}
		System.out.println("User " + uname + " not exists");
		return false;
		
	}
	
	private void loginCheck(String uname, String pwd)
	{
		for(User t : a)
		{
			if(t.get_id() == uname && t.get_psw() == pwd)
			{
				System.out.println("User " + uname + " log in");
				t.inc_login();
				return;
			}
		}
		System.out.println("User " + uname + " log in failed");
		
	}
	public UserManager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserManager m = new UserManager();
		m.add_user("alan", "123");
		m.isExist("alan");
		m.isExist("bob");
		m.add_user("bob", "456");
		m.isExist("bob");
		m.loginCheck("alan", "123");
		m.loginCheck("alan", "123");
		m.loginCheck("alan", "123");
		m.loginCheck("alan", "12113");
		m.del_user("bob");
		m.isExist("bob");
	}

}
