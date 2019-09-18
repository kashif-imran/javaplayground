package com.kashif.concurrency.synchronizedkeyword;

public class Main
{
    public static void main(String args[])
    {
        final MathClass mathClass = new MathClass();
 
        //first thread
        Runnable r = new Runnable()
        {
            public void run()
            {
                try {
                    mathClass.printNumbers(3);
                    mathClass.printNumbers2(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
       
        new Thread(r, "ONE").start();
        new Thread(r, "TWO").start();
    }
}
