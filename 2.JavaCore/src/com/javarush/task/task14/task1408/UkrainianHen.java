package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen implements Country{
    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    String getDescription() {
        StringBuilder str = new StringBuilder();
        str.append(super.getDescription()).append(" Моя страна - ").append(Country.UKRAINE).append(".").append(" Я несу ")
                .append(getCountOfEggsPerMonth()).append(" яиц в месяц.");
        return str.toString();
    }
}
