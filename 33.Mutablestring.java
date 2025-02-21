public class mutablestring {
    
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("pranit");
		sb.append("patil");

		sb.deleteCharAt(2);

		System.out.println(sb);


	}
    
}
