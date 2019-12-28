package com.icode.interview.thread;

import com.icode.interview.enums.CountryEnum;

import java.util.concurrent.CountDownLatch;

/**
 * @author Unicorn
 */
public class CountDownLatchDemo {

    public static void main(String[] args) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        // 韩,赵,魏,楚,燕,齐
//        String[] arr = new String[]{"韩", "赵", "魏", "楚", "燕", "齐"};

        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t国, 被灭");
                countDownLatch.countDown();

            }, CountryEnum.foreach_CountryEnum(i).getMsg()).start();
        }

        countDownLatch.await();

        System.out.println(Thread.currentThread().getName() + "\t**********秦帝国, 一统华夏...");
    }

    private static void closeDoor() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);

        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t上完自习, 离开教室...");
                countDownLatch.countDown();

            }, String.valueOf(i)).start();
        }

        countDownLatch.await();

        System.out.println(Thread.currentThread().getName() + "\t**********班长最后关门走人...");
    }
}
