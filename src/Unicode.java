import java.io.UnsupportedEncodingException;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

//import org.apache.commons.lang3.StringEscapeUtils;

import com.sun.corba.se.impl.ior.ByteBuffer;

public class Unicode {

	public Unicode() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		// test2();
		test3();

	}

	public void test1() {
		/* APOSTROPHE */
//		System.out.println("1. APOSTROPHE");
//		String s = "\\u0027";
//		s = StringEscapeUtils.unescapeJava(s);
//		String msg = "t'd";
//		System.out.println("s is converted into " + s);
//		msg = StringUtils.replace(msg, s, "n");
//		System.out.println(msg);
//
//		/* n tilde */
//		System.out.println("2. n tilde");
//		s = "\\u00F1";
//		s = StringEscapeUtils.unescapeJava(s);
//		msg = "tñd";
//		System.out.println("s is converted into " + s);
//		if (StringUtils.equals(s, "ñ")) {
//			System.out.println("true");
//		}
//		msg = StringUtils.replace(msg, s, "n");
//		System.out.println(msg);

	}

	public static void test2() {

		java.nio.ByteBuffer bb = Charset.forName("utf-16").encode(CharBuffer.wrap("dfdfds ™ \u0164 \u2122  y"));
		// then decode those bytes as US-ASCII
		System.out.println(bb);
		CharBuffer ascii = Charset.forName("US-ASCII").decode(bb);
		System.out.println(ascii);
	}

	public static void test3() throws UnsupportedEncodingException {

		String str = "hey\u6366";
		byte[] charset = str.getBytes("UTF-8");
		String result = new String(charset, "UTF-8");
		System.out.println(result);

	}
}
