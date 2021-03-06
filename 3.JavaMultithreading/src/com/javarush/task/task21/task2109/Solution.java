package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/

public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        @Override
        public int getI() {
            return super.getI();
        }

        @Override
        public int getJ() {
            return super.getJ();
        }

        public String getName() {
            return name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public int getI() {
            return super.getI();
        }

        @Override
        public int getJ() {
            return super.getJ();
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            C c = new C(getI(), getJ(), getName());
            return c;
        }
    }

    public static void main(String[] args) {

    }
}
