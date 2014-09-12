// Kevin Chen
// 9/12/14
// CSE 02 Bicycle
// This program calculates the distance, time and speed of a bicycle
//

import java.util.Scanner;
// new scanner class

public class Bicycle{
    //define main method
    public static void main(String[] args) {
        // input data
        Scanner myScanner; //declare scanner
        myScanner = new Scanner( System.in );
        System.out.print("Enter the number of seconds: "); //promt user to enter seconds
        int nSeconds = myScanner.nextInt();
        System.out.print("Enter the number of counts: "); //promt user to enter number of counts
        int nCounts = myScanner.nextInt();
        double wheelDiameter=27.0, //wheel diameter in inches
        PI=3.14159, //pi
        feetPerMile=5280, //convert feet to mile
        inchesPerFoot=12, //convert inches to feet
        secondsPerMinute=60, //convert seconds to minute
        minutesPerHour=60; //convert minutes to hour
        double totalDistance, totalTime, averageSpeed;
        totalDistance = nCounts*wheelDiameter*PI;
        totalDistance/=inchesPerFoot*feetPerMile; //give total distance in miles
        totalTime = nSeconds/(secondsPerMinute*minutesPerHour); //give total time in hours
        averageSpeed = totalDistance/totalTime; //give average speed
        double minuteTime = nSeconds/secondsPerMinute; //time in minutes
        int totalDistance1 = (int)(totalDistance*100);
        double totalDistance2 = totalDistance1/100.0;
        int averageSpeed1 = (int)(averageSpeed*100);
        double averageSpeed2 = averageSpeed1/100.0;
        System.out.println("The distance was " +totalDistance2+ " miles and took " +minuteTime+ " minutes."); //print total distance and time
        System.out.println("The average mph was " +averageSpeed2); //print average speed
        
    }
}