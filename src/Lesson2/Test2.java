package Lesson2;

public class Test2 {
    static public void main(String []args){
        byte b1 = 12;
        byte b2 = 0B1100;
        byte b3 = 014;
        byte b4 = 0xC;

        short s1 = 1300;
        short s2 = 0B010100010100;
        short s3 = 02424;
        short s4 = 0x514;

        int i1 = 0;
        int i2 = 0B0;
        int i3 = 00;
        int i4 = 0x0;

        long l1 = 123456789;
        long l2 = 0B0111010110111100110100010101;
        long l3 = 0726746425;
        long l4 = 0x75BCD15;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        float a = 12.3F;
        float b = 234.999F;
        System.out.println(a);
        System.out.println(b);

        double c = 12.3;
        double d = 234.999;
        System.out.println(c);
        System.out.println(d);

        boolean e = true;
        boolean f = false;
        System.out.println(e);
        System.out.println(f);

        char g = 'g';
        char j = 256;
        char k = '\u0100';
        System.out.println(g);
        System.out.println(j);
        System.out.println(k);


    }
}
