package com.company;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.List;

public class Human extends Actor{
    public  List<String> products = new ArrayList<>();
    products.add("apple");
    products.add("mango");
    public Human(String name,List products) {
        super(name);

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder(boolean flag) {
     this.isMakeOrder = flag;
    }

    @Override
    public void setTakeOrder(boolean flag) {
      this.isTakeOrder = flag;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
