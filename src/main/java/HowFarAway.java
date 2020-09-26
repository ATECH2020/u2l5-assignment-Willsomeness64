import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // "I still don't know what I'm doing" - AWOLNATION 
      
      //initializing my variables
     int startLatitude;
     int startlongitude;
     int endLaditude;
     int endLongitude;

     //Asking the user for inputs for my variables
     System.out.println("Enter the latitude of the starting location:");
     startLatitude = in.nextInt();
     System.out.println("Enter the longitude of the starting location: ");
     startlongitude = in.nextInt();
     System.out.println("Enter the latitude of the ending location: ");
     endLaditude = in.nextInt();
     System.out.println("Enter the longitude of the ending location: ");
     endLongitude = in.nextInt(); 

    //creating two GeoLocation objects, going to try to use these two objects to calculate the distance. 
        GeoLocation startLoc = new GeoLocation(startLatitude,startlongitude);
        GeoLocation endLoc = new GeoLocation(startLatitude,startlongitude);

    }
}