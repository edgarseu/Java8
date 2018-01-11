package chap28.listing4;
 
// A thread of execution that uses a CyclicBarrier. 
class MyThread implements Runnable { 
  CyclicBarrier cbar; 
  String name; 
 
  MyThread(CyclicBarrier c, String n) { 
    cbar = c; 
    name = n; 
  } 
 
  public void run() { 
     
    System.out.println(name); 
 
    try { 
      cbar.await(); 
    } catch (BrokenBarrierException exc) { 
      System.out.println(exc); 
    } catch (InterruptedException exc) { 
      System.out.println(exc); 
    } 
  } 
} 
