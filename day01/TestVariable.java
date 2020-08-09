/*
变量声明与使用

* */

public class TestVariable {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 2.3;
        System.out.println(num1 + num2);

        // 整数类型：byte, short, int, long

        byte b1 = 18;
        // byte b2 = 128; //超出范围
        System.out.printf("b1:%d", b1);
        short s1 = 128;
        System.out.println("s1: " + s1);
        int i1 = 999;
        System.out.println("i1: " + i1);

        // long整型，需要在末尾加 "l"或"L"，当不加，范围没超过 int范围时，是用了默认使用了int型转的，超了范围不加标识符将报错: 整数太大
        long l1 = 999;
        // long l2 = 999999999999;超出范围报错：整数太大
        long l3 = 999999999999L;
        System.out.print("l1: " + l1);
        System.out.print("l3: " + l3);

        // 浮点型：double, float
        double d1 = 3.336;
        System.out.println("d1: " + d1);
        float f1 = 5.03F;
        System.out.println("f1: " + f1);

        // 字符类型： char，用''括起来
        // <1>世界上所有书面上的任意一个字符
        char c1 = 'a';
        // char c11 = "ab"; // 不行
        System.out.println("c1: " + c1);
        char c2 = '$';
        System.out.println("c2: " + c2);
        char c3 = '字';
        System.out.println("c3: " + c3);
        // <2>转义字符
        char c4 = '\n';
        System.out.println("c4: " + c4);
        // <3>Unicode值
        char c5 = '\u1234';
        System.out.printf("c5: %s %s", c5, "\n");

        // 布尔类型：boolean，只能取值 true和false,不能取值null
        boolean bool1 = true;
        if (bool1) {
            System.out.println("京东货真好！！");
        } else {
            System.out.println("操，假货一大堆！！");
        }

    }

    public int method1() {
        int age = 18;
        System.out.println(age);
        return age;
    }
}