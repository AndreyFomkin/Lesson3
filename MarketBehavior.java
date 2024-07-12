package com.company;

import java.util.List;

public interface MarketBehavior {
    void acceptToMarket(Actor actor);//вход в маг
    void releaseFromMarket(List<Actor> actors);// выход из маг
    void update(int x);// обновление
}
