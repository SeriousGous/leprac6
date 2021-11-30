package com.company;

public class Main {

    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(new Point(1,2),new Point(3,4), new Point(1,2),new Point(2,3));

        movableRectangle.move(1,2);

        System.out.println(movableRectangle);

    }
}