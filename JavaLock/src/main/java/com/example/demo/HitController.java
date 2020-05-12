package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RestController

public class HitController {

    @Autowired
    HitService hitService;

    private static int requestCount =0;

    Object firstFrameLock = new Object();


    @RequestMapping("/hit")
    String hitCounter(){

        String reuslt = "";
//        synchronized (firstFrameLock) {
            reuslt = hitService.hit();
//        }

        return  reuslt;
    }

    private Lock lock = new ReentrantLock();
    @RequestMapping("/hit2")
    String hitCounter2() {

        String reuslt = "";
//        lock.lock();
        reuslt = hitService.hit();
//        lock.unlock();

        return reuslt;
    }
}
/*


 */

