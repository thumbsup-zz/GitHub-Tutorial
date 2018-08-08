public class gitworld
{
	
	public gitworld()
	{
		String l_msg = "Hello Git world";
		int l_limit = 5;
		
		printMsg(l_msg,l_limit);
	}

	private void printMsg(String p_msg, int p_limit)
	{
		for (int i = 0; i < p_limit; i++)
			System.out.println(p_msg);
	}
	
	
	public static void main(String[] args)
	{
		gitworld g1 = new gitworld();

	}
}