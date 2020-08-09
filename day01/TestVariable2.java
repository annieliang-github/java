/*
* 变量之间的运算：（不考虑boolean。即char, byte, short, int, long, float, double）
* 1 自动类型转换
* 2 强制类型转换
* */

class TestVariable2 {
    public static void main(String[] args) {
        /*
        ## 自动类型转换，
        :>当容量小的数据类型与容量大的数据类型做运算时，容量小的会自动转换为容量大的数据类型：
        char, byte, short ==> int ==> long ==> float ==> double
        :>当char,byte,short之间做运算时，默认的结果为int类型。
        * */
        int i1 = 20;
        short s1 = 100;
        int i2 = i1 + s1;
        float f1 = 28.8F;
        float f2 = 3.14F;
        float f3 = f1 + f2;
        // float f4 = f2 + 12.9; //  报错，因为12.9 默认为double型

        float f5 = f1 + i1;
        long l1 = 999999L;
        float f6 = l1; // long型可以赋值给float型

        System.out.println("i2: " + i2);
        System.out.println("f3: " + f3);
        System.out.println("f6: " + f6);

        char c1 = 'c';
        int i3 = 3;
        int i4 = i3 + c1;
        System.out.println(i4);

        short ss1 = 88;
        byte bb1 = 127;
        char cc1 = 'q';

        // short ss2 = ss1 + bb1; // 使用int型以确保数据精确度
        int ii1 = ss1 + bb1;
        short ss3 = 99;
        // short ss4 = ss1 + ss3; // 范围可能会超过出short,使用int型以确保数据精确度
        System.out.println("ii1: " +  ii1);

        // ## 强制类型转换
        /*
        :>容量大的转换为容量小的，要使用强制类型转换符：(类型)变量
        :>强制类型转换导致的问题：可能损失精度，它的算是方式就是直接把高位截掉。
        * */

        long long2 = 123456L;
        int i52 = (int) long2;
        System.out.println("i52: " + i52);

        byte b56 = (byte)long2;
        System.out.printf("b56: " + b56);

        // String字符串与基本数据之间的运算，只能是连接运算：+，得到的结果为一个字符串
        /*String类是一个典型的不可变类，String对象创建出来就不可被改变。创建出来的字符串
        将存放在数据区，保证每个字符串常量只有一个，不会产生多个副本。
        */
        String str62 = "abc";
        String str63 = str62 + i52; // 结果为：abc123456
        System.out.println("str63: " + str63);

        // 示例
        String s65 = "Daydayup";
        int i66 = 21;
        char c67 = 'c'; // 99
        // System.out.println((short)c67);
        System.out.println(s65 + i66 + c67); // Daydayup21c
        System.out.println( c67 + i66 + s65); // 120Daydayup
        System.out.println(i66 + s65 + c67); // 21Daydayupc

        String sss0 = "hello";
        String sss1 = "hello";
        String sss2 = "he" + "llo";
        System.out.println(sss0 == sss1); // true
        System.out.println(sss0 == sss2); // true

    }

}
