/*
集合遍历

* */

package com.java.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionErgodic {
    Collection c1 = new ArrayList();

    {
        c1.add(22);
        c1.add("MM");
        c1.add(true);
        c1.add(new Person("alisha", 18));
    }

    @Test
    public void ergodic1() {
        Iterator it = c1.iterator();
        while (it.hasNext()) {
            it.remove();
            System.out.println(it.next());
        }
    }

    @Test
    public void test2() {
        // 增强for循环，类似 python中的for i in obj:
        System.out.println("增强for循环遍历集合");
        for (Object o : c1) { // 这里的o为局部变量
            System.out.println(o);
        }

    }

    @Test
    public void test3() {
        // 错误的写法，报NoSuchElementException 异常
        System.out.println("===");
        Iterator it = c1.iterator();
        while ((it.next()) != null) {
            System.out.println(it.next());
        }
    }

    @Test
    public void test4() {
        // 增强for遍历数组
        int[] ia = new int[]{11, 22, 44, 66};
        for (int i : ia) {
            System.out.println(i);
        }
    }

    @Test
    public void test5() {
        // 从集合中移除迭代器返回的最后一个元素（可选操作）
        Iterator it = c1.iterator();
        it.next();
        it.remove();
        System.out.println(c1);
    }

}
