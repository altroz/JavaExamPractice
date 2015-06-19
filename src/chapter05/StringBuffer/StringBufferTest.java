package chapter05.StringBuffer;

public class StringBufferTest {
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println("sb:  "+ sb);
		
		sb.delete(0, 2);
		/*sb.insert(offset, str);*/
		sb.toString();
	}
}
