


````

 Lock lock = new ReentrantLock();
        //获得锁
        lock.lock();
        try {
            //do somethings 
            
        }catch (Exception e)
        {
            // catch something 
        }finally {
            //释放锁放在finally ，保证锁能够正常释放
            lock.unlock();
        }
		
		````