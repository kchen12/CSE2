// Kevin Chen
// 9/5/14
// CSE 02 Cyclometer
// This program is meant to record time and distance of a bicycle
//
public class Cyclometer{
    //define main method
    public static void main(String[] args) {
        // input data
        int secsTrip1=480; //time in first trip
        int secsTrip2=3220; //time in second trip
        int countsTrip1=1561; //rounds in first trip
        int countsTrip2=9037; //rounds in second trip
        // intermediate variables and output data
        double wheelDiameter=27.0, //diameter of wheel
        PI=3.14159, //pi
        feetPerMile=5280, //convert feet to mile
        inchesPerFoot=12, //convert inches to feet
        secondsPerMinute=60; //convert seconds to minute
        double distanceTrip1, distanceTrip2,totalDistance;
        //assigning distance for first,second and total trips
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts.");
        //calculate trip 1 and 2 and convert into miles
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance = distanceTrip1 + distanceTrip2;
        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");



        
    } //end of main method
} //end of method