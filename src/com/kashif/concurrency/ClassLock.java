package com.kashif.concurrency;

public class ClassLock {

}

class DemoClass
{
	//synchronized DemoClass() { cannot use synchrinized keyword with constructor
		
	//}
	
	
    //Method is static
    public synchronized static void demoMethod(){
 
    }
}
 
 
class DemoClass1
{
    public void demoMethod()
    {
        //Acquire lock on .class reference
        synchronized (DemoClass.class)
        {
            //other thread safe code
        }
    }
}
 
 
class DemoClass2
{
    private final static Object lock = new Object();
 
    public void demoMethod()
    {
        //Lock object is static
        synchronized (lock)
        {
            //other thread safe code
        }
    }
}