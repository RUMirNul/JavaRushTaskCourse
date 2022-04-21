package com.javarush.task.task14.task1408;

public class RussianHen extends Hen implements Country{
    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    String getDescription() {
        StringBuilder str = new StringBuilder();
        str.append(super.getDescription()).append(" Моя страна - ").append(Country.RUSSIA).append(".").append(" Я несу ")
                .append(getCountOfEggsPerMonth()).append(" яиц в месяц.");
        return str.toString();
    }
}
