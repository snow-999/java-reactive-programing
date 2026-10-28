package com.example.reacite_Programing;

import com.example.reacite_Programing.publisher.PublisherImpl;
import com.example.reacite_Programing.subscriber.SubscriberImpl;

import java.time.Duration;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        demo2();
    }

    private static void demo1() {
            var publisher = new PublisherImpl();
            var subscriber = new SubscriberImpl();
            publisher.subscribe(subscriber);
    }

    private static void demo2() throws InterruptedException {
        long requsest = 2L;
        var publisher = new PublisherImpl();
        var subscriber = new SubscriberImpl();
        publisher.subscribe(subscriber);
        subscriber.getSubscription().request(requsest);
        Thread.sleep(Duration.ofSeconds(2));
        subscriber.getSubscription().request(requsest);
        Thread.sleep(Duration.ofSeconds(2));
        subscriber.getSubscription().request(requsest);
        Thread.sleep(Duration.ofSeconds(2));
        subscriber.getSubscription().request(requsest);
        Thread.sleep(Duration.ofSeconds(2));
        subscriber.getSubscription().request(requsest);
        Thread.sleep(Duration.ofSeconds(2));
    }

}
