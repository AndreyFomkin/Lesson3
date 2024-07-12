package com.company;

public interface QueueBehavior {
    void takeInQueue(Actor actor);
    void takeOrders();// сделать заказ
    void giveOrders(); // забрать заказв
    void releaseFromQueue(); // выйти из очереди
}
