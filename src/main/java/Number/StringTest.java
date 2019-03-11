package Number;

import org.junit.Test;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author HASEE
 * @create 2019-03-11
 * @since 1.0.0
 */
public class StringTest {

    @Test
    public void testString(){
        char a[]={'s','t','u','d','e','n','t'};
        String s = new String(a,2,4);
        System.out.println(s);
    }

    @Test
    public void testString2(){
//        String str = "StringTestinni";
//        str = str.replace("i","a");
//        System.out.println(str);
        String str1 = "Stringinni";
        String str = str1.replaceAll("i","bbb");
        System.out.println(str1.replaceAll("i","bbb"));
        System.out.println(str1.replace("i","bbb"));
    }

}
