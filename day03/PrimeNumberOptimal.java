/*
查找质数优化版
题目：
    打印1-100内的所有质数

质数定义：
    质数又称素数。一个大于1的自然数，除了1和它自身外（没有其他的约数/因数），不能被其他自然数整除的数叫做质数；否则称为合数。
    注意：1不是质数也不是合数，2是最小的质数


为什么判断一个数是否为素数时只需开平方根就行了！
素数是只有1和本身能整除的整数。所以在求素数的时候，要将素数与1到素数本身中间的所有整数都相除，看是否有整除的数，
如果有，那肯定不是素数了。但是从算法上考虑，为了减少重复量，开平方后面的数就不用相除了，因为a/b（平方数）=c（小一点的数），
同样a/c=b。举例说明：
25，开平方以后是5,那么整除2~5就可以了，如果有满足条件的，就是素数。
这样做可以减少循环次数，素数是因子为1和本身， 如果数c不是素数，则还有其他因子，其中的因子，假如为a,b.其中必有一个大于sqrt(c) ，一个小于sqrt(c) 。
所以m必有一个小于或等于其平方根的因数，那么验证素数时就只需要验证到其平方根就可以了。
即一个合数一定含有小于它平方根的质因子。

运行：javac -encoding utf8 PrimeNumberOptimal.java && java PrimeNumberOptimal
* */



class PrimeNumberOptimal {
    public static void main(String[] args) {
        System.out.println("1-100内的所有质数：");
        long start_time = System.currentTimeMillis(); // 获取系统当前时间的毫秒数（时间戳）
        for (int i = 2; i <= 100000; ++i) {
            boolean is_prime = true;
            if (i == 1) { // 跳过1，因为1即不是质数也不是合数
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); ++j) {
                if (i % j == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                // System.out.println(i);
            }
        }
        long end_time = System.currentTimeMillis();
        System.out.println("运行耗时(ms)：" + (end_time - start_time)); // 15

    }
}