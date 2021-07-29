package operator;

import static java.lang.Math.*;

import javax.swing.*;

public class Exercise03 {
    public static void main(String[] args) {

        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;
        b = (byte) i;         //큰 -> 작
        ch = (char) b;         //-128~126 -> 0~65535 음수때문에 형변환 필요
        short s = (short) ch;       //0~65535 -> -32768~32767
        float f = (float) l;        //생략가능 float보다 long이 표현범위가 작음
        i = (int) ch;        //생략가능

//        int x = 2;
//        int y=5;
//        char c ='A';
//        System.out.println(y>=5||x<0&&x>2);
//        System.out.println(y += 10 - x++);
//        System.out.println(x +=2);
//        System.out.println(!('A' <= c && c<= 'Z'));
//        System.out.println('C' - c);
//        System.out.println('5' - '0');
//        System.out.println(c + 1);
//        System.out.println(++c);
//        System.out.println(c++);
//        System.out.println(c);

//        int num = 456;
//        int numEx = (num == 456)?400:(num == 111)?100:num;
//        System.out.println((num == 456)?400:(num == 111)?100:num);
//        System.out.println((int) (floor(num/pow(10,2))*pow(10,2)));
//        System.out.println(num % 100 > 0 ? num / 100 * 100 : num);
//        System.out.println(num/100*100);
//        System.out.println(numEx);

//        int numOfApples = 123;
//        int sizeOfBucket = 10;
//        int numOfBucket = (int) Math.ceil(numOfApples / (float)sizeOfBucket);
//        int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);
//        System.out.println("필요한 바구니의 수: " + numOfBucket);

//        int num = 10;
//        System.out.println((num > 0)?"양수":(num == 0)?"0":"음수");

//        int fahrenheit = 100;
//        float celcius = (float) 5 / 9 * (fahrenheit - 32);
//        float celcius = (int) ((5 / 9 * (fahrenheit - 32)) *100 +0.5) / 100f; //이것도 가능
//
//        System.out.println("Fahrenheit: " + fahrenheit);
//        System.out.println("Celcius: " + String.format("%.2f", celcius));
    }
}

