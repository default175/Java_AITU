package main;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {
        try{
            File file = new File("C://JavaProject_AITU-main/Assignment 1/tasks/source.txt");
            Scanner sc = new Scanner(file);
            Shape shape = new Shape();
            while(sc.hasNext()){
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                Point p = new Point(x,y);
                shape.addPoint(p);
            }
            System.out.println("Perimetr "+shape.calculatePerimetr());
            System.out.println(shape.getLongestSide());
            System.out.println(shape.getAverageSide());
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("File netu");
        }


        
    }

}
