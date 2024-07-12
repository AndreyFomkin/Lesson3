package com.company;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavior, QueueBehavior {

    private List<Actor> actors = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
actors.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
actors.remove(0);
    }

    @Override
    public void update(int x) {
      //добавить аргументы продукты
    }

    @Override
    public void takeInQueue(Actor actor) {

    }

    @Override
    public void takeOrders() {

    }

    @Override
    public void giveOrders() {

    }

    @Override
    public void releaseFromQueue() {

    }
}
