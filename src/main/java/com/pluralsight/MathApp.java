package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
//        double bobSalary = 146000.00;
//        double garySalary = 200000.00;
//        double highestSalary = Math.max(bobSalary, garySalary);
//        System.out.println("The highest salary is $" + highestSalary);
//
        //2
//        double carPrice = 25000.00;
//        double truckPrice = 35000.00;
//        double lowestPrice = Math.min(carPrice, truckPrice);
//        System.out.println("The lowest price is $" + lowestPrice);

        //3
//        double radius = 7.25;
//        double circleArea = Math.PI * radius * radius;
//        System.out.println("The area of the circle is " + circleArea);

        //4
//        double num = 5.0;
//        double squareRoot = Math.sqrt(num);
//        System.out.println("The square root of " + num + " is " + squareRoot);

        //5
//        double x1 = 5;
//        double y1 = 10;
//        double x2 = 85;
//        double y2 = 50;
//
//        double xDistance = x2 - x1;
//        double yDistance = y2 - y1;
//
//        double distance = Math.sqrt(
//                xDistance * xDistance + yDistance * yDistance
//        );
//
//        System.out.println("The distance between the two points is " + distance);

        //6
//        double negativeNumber = -3.8;
//        double positiveValue = Math.abs(negativeNumber);
//
//        System.out.println("The absolute value of " + negativeNumber + " is " + positiveValue);

        //7
//        double randomNumber = Math.random();
//        System.out.println("The random number is " + randomNumber);

        //8
        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int secondsPerMinute = 60;
        int millisecondsPerSecond = 1000;

        int totalHours = days * hoursPerDay;
        int totalMinutes = totalHours * minutesPerHour;
        int totalSeconds = totalMinutes * secondsPerMinute;
        long totalMilliseconds = (long) totalSeconds * millisecondsPerSecond;

        System.out.println("There are " + totalMinutes + " minutes in " + days + " days.");
        System.out.println("There are " + totalMilliseconds + " milliseconds in " + days + " days.");



    }
}
