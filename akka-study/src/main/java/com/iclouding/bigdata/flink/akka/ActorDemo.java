package com.iclouding.bigdata.flink.akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

import java.util.concurrent.TimeUnit;

public class ActorDemo {
    public static void main(String[] args) throws InterruptedException {
        ActorSystem actorSystem = ActorSystem.create();
        ActorRef actorRef = actorSystem.actorOf(Props.create(MyActor.class), "aa");
        System.out.println(actorSystem);
        System.out.println(actorRef);
        actorRef.tell("hello", ActorRef.noSender());

        TimeUnit.HOURS.sleep(1);
    }
}
