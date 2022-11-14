package com.java.algorithms;

import java.time.LocalDate;

public class Calendar {
    public static void main(String[] args) {
        System.out.println("\n\nToday is : "+LocalDate.now()+" and calender for this month is \n\n");
        int firstDay = 1;
        int calendar[][] = new int[6][7];//7 days in a week and 6  rows are there in a calendar
        String nameOfTheWeeks = "Mon\t" + "Tue\t" + "Wed\t" + "Thu\t" + "Fri\t" + "Sat\t" + "Sun\t";
        System.out.println(nameOfTheWeeks);

        //initializing
        int lengthOfMonth = LocalDate.now().lengthOfMonth();
        int firstDayOfTheMonth = LocalDate.now().withDayOfMonth(1).getDayOfWeek().getValue();
// use a labeled break statement to terminate the outer for loop when we reach the end of the month
       month:
        for (int i = 0; i <6; i++) {
            for (int j = 0; j < 7; j++) {
                if(--firstDayOfTheMonth > 0){ // fixing first day of month's weekday to start counting from tuesday for example
                    continue;
                }

                calendar[i][j] = firstDay++;
                if (firstDay > lengthOfMonth) {
                    break month;                   // the execution will continue after the outer loop
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print((calendar[i][j] == 0 ? " " : calendar[i][j]) + "\t");  // replace 0's in the array with spaces
                if (j == 6) {
                    System.out.println();
                }
            }
        }
            }

}
