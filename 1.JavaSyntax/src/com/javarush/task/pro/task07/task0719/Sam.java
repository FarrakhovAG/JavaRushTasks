package com.javarush.task.pro.task07.task0719;

public class Sam {
    public class Point {
        public int x;
        public int y;
        public int color;

        public void print()

        {
            System.out.println("Цвет точки x=" + x + ", y=" + y + " " + color);
        }
    }
        public static void printPoints(Point[] points)
        {
            for (int i = 0; i < points.length; i++)
                points[i].print();
        }

        public void main(String[] args)
        {
            Point[] data = new Point[100];
            for (int i = 0; i < data.length; i++)
                data[i] = new Point();
            printPoints(data);
        }
}


