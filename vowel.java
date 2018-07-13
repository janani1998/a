import java.util.Scanner;
public class vowel {
	public static void main(String[] args) {
		char n;
		Scanner in=new Scanner(System.in);
		n=in.next().charAt(0);
		if(n==('!')||n==('@')||n==('$')||n==('#')||n==('%')||n==('^')||n==('&')||n==('*')||
				n==('(')||n==(')'))
		{
			System.out.println("Invalid");
		}
		else if(n==('a')||n==('e')||n==('i')||n==('o')||n==('u')||n==('A')||n==('E')||n==('I')||n==('O')||n==('U'))
		{
			System.out.println("Vowels");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
}
