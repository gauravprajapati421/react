//import java.util.*;

//import java.util.Scanner;


class MyThreadRunnable1 implements Runnable{
    public void run(){
            System.out.println("I am thread 1 ");       
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
            System.out.println("I am thread 2 ");
    
       
    }
}


public class pakge {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}

// class shape{
//     int dim 1 , dim 2;
//     shape(int dim1, int dim2);




//  @Override
//  public String toString() {
       
//  }
