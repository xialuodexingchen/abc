package Number;

import org.junit.Test;

/**
 * 〈一句话功能简述〉<br>
 * 〈number〉
 *
 * @author HASEE
 * @create 2019-03-06
 * @since 1.0.0
 */
public class Number {

//    public static void main(String[] args) {
//        byte mybate = 124;
//        short myShort=32564;
//        int myint =4567812;
//        long mylong =4567891;
//        long result = mybate+myShort+myint+mylong;
//        System.out.println("结果为："+result);
//    }

//    public static void main(String[] args) {
//        char x = 'a';
//        char x1 = 97;
//        System.out.println(x);
//        System.out.println(x1);
//    }

    public static void main(String[] args) {
        char word = 'd',word2='@';
        int p = 23045,p2=45213;
        System.out.println((int)word);
        System.out.println((int)word2);
        System.out.println((char)p);
        System.out.println((char)p2);
    }

    @Test
    public void test01 (){
        char c1='\\';
        char c2 = '\u2605';
        String c3 = "u2605";
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

}
