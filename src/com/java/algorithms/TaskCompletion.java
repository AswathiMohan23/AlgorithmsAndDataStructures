package com.java.algorithms;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;


public class TaskCompletion {
    static Scanner sc = new Scanner(System.in);

    static LocalDateTime timeNeeded;
    static LocalDateTime deadLine = LocalDateTime.of(2022,11,13,12,34,3);

    public static void main(String[] args) throws ParseException {

        System.out.println("enter the no of tasks(1 to 6) : ");
        int numberOfTasks = sc.nextInt();
        LocalDateTime timeNeeded = LocalDateTime.of(2022,11,13,12,35,4);
        System.out.println("the total time required to do all the tasks  : "+timeNeeded);
        System.out.println("the deadLine for all the tasks : "+deadLine);
        LocalDateTime startTime=LocalDateTime.now();
        task(startTime);

    }
    private static void task(LocalDateTime startTime) {
        System.out.println("Enter the task no :   ");
        int number = sc.nextInt();
        switch (number){
            case 1 :        display(1,startTime);
                break;
            case 2 :      display(2,startTime);
                break;
            case 3 :      display(3,startTime);
                break;
            case 4 :      display(4,startTime);
                break;
            case 5 :      display(5,startTime);
                break;
            case 6 :      display(6,startTime);
                break;
            default:

                break;

        }

    }
    public static void display(int taskNo,LocalDateTime time) {
        System.out.println("............... executing " + taskNo + " ......................\n\n press 1 to change the task\npres 2 to exit the task");
        Duration executionTime=Duration.between(time,LocalDateTime.now());
        System.out.println("time taken for the previous work : "+executionTime);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                task(LocalDateTime.now());
                break;
            case 2:
                LocalDateTime endTime = LocalDateTime.now();
                System.out.println("The Start time of the task is : " + time);
                Duration timeTaken = Duration.between(time, endTime);
                System.out.println("Total time taken to complete the task : " + timeTaken);
                System.out.println("completed the task at  : " + endTime);
                System.out.println("DeadLine : " + deadLine);
                Duration timeDelay = Duration.between(endTime,deadLine);
                System.out.println("Time delay: " + timeDelay);

        }
    }


}
