public class Pluperfect {
    
    public static void main(String[] args) {
    	long n = 1000000000;
    	for(long i = 100;  i < n; i++)
    	{
    		String s = String.valueOf(i);
    		IntStream chars = s.chars();
    		int[] a = chars.map(x->x-'0').toArray();
    		long sum = IntStream.of(a).map(x-> (int)Math.pow(x, s.length())).sum();
    		if(i == sum)
    		{
    			System.out.println(i);
    		}
    	}
        
    }
}
