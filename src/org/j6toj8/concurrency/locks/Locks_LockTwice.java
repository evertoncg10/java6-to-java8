package org.j6toj8.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_LockTwice {

  public static void main(String[] args) {
    // tag::code[]
    Lock lock = new ReentrantLock();
    try {
      lock.lock();
      lock.lock();
      System.out.println("ABC");
    } finally {
      lock.unlock(); // desfaz o primeiro lock
      lock.unlock(); // desfaz o segundo lock
    }
    // end::code[]
  }
  
}
