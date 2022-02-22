package Chapter3;
import java.lang.StringBuilder;

public class StringBuilder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alpha = "";
		for(char current = 'a'; current <= 'z'; current++) {
			alpha += current;
		}
		System.out.println(alpha);
		
		StringBuilder alpha1 = new StringBuilder();
		for(char current1 = 'a'; current1 <= 'z'; current1++)
		alpha1.append(current1);
		System.out.println(alpha1);
		
		StringBuilder sb = new StringBuilder().append(1).append('c');
		sb.append("-").append(true);
		System.out.println(sb); // 1c-true
		//StringBuilder b = "rumble";
		
		StringBuilder sb2 = new StringBuilder("animalsabc");
		sb2.substring(1, 7);
		sb2.insert(7, "-"); // sb = animals-
		sb2.insert(0, "-"); // sb = -animals-
		sb2.insert(4, "-"); // sb = -ani-mals
		System.out.println(sb2);
		
		System.out.println("=============");
		StringBuilder sb3 = new StringBuilder("animalsabc");
		sb3.substring(1, 9);
		sb3.insert(7, "-").insert(0, "-").insert(4, "-"); // sb = -ani-mals
		System.out.println(sb2);
		
		System.out.println("=============");

		StringBuilder a = new StringBuilder("abc"); 
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		a.append('h');
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		System.out.println("=============");
		String a1 = new String("abc"); 
		String b1 = a1.concat("de");
		b1 = b1.concat("f").concat("g");
		a1.concat("h");
		a1=a1.concat("i");
		System.out.println("a1=" + a1);
		System.out.println("b=" + b1);
		
		System.out.println("=============");

        StringBuilder sb10 = new StringBuilder(5);
        System.out.println(sb10.capacity());
        sb10.append("anim");
        System.out.println(sb10.capacity());
        sb10.append("als");
        System.out.println(sb10.capacity());        
        System.out.println(sb10);
		
        System.out.println("=============");
        StringBuffer1 sbf = new StringBuffer1();
        //sbf.append("dfdfdfd");
	}
	

	
}
