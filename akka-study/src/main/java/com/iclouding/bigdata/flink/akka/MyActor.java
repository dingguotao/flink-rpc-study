package com.iclouding.bigdata.flink.akka;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

public class MyActor extends AbstractActor {
    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .matchAny(System.out::println)
                .build();
    }
}
