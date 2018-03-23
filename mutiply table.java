public class TransientTest {
    
    public static void main(String[] args) {
    	for(int i = 1; i <= 9; i++)
    	{
    		int j = 1;
    		for(j = 1; j < i; j++)
    		{
    			System.out.printf("%d*%d=%d	", j, i, i*j);
    		}
    		System.out.printf("%d*%d=%d\n", i, j, i*j);
    	}
        
    }
}
