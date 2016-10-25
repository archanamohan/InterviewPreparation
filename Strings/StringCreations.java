package StringsQuestions;

public class StringCreations {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = a;
		String c = "Hello";
		String d = new String("Hello");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		System.out.println(a==c);
		System.out.println(a.equals(c));
		
		System.out.println(a==d);
		System.out.println(a.equals(d));
		
		d.concat(" Arch\n\n");
		System.out.println(d); // does not add "Arch" at the end of "Hello"
		
		StringBuilder sb = new StringBuilder("Shyam");
		System.out.println(sb);
		sb.append("krishnan");
		System.out.println(sb);

	}

}
