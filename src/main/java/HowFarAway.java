import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
            
      //initializing my variables
     Scanner in = new Scanner(System.in);

     double startLatitude;
     double startlongitude;
     double endLaditude;
     double endLongitude;
     

     //Asking the user for inputs for my variables
     System.out.println("Enter the latitude of the starting location:");
     startLatitude = in.nextDouble();
     System.out.println("Enter the longitude of the starting location: ");
     startlongitude = in.nextDouble();
     System.out.println("Enter the latitude of the ending location: ");
     endLaditude = in.nextDouble();
     System.out.println("Enter the longitude of the ending location: ");
     endLongitude = in.nextDouble(); 

    //creating two GeoLocation objects, going to try to use these two objects to calculate the distance. 
        GeoLocation startLocation = new GeoLocation(startLatitude,startlongitude);
        GeoLocation endLocation = new GeoLocation(endLaditude,endLongitude);
    
       System.out.println("The distance is " + startLocation.distanceFrom(endLocation) + " miles");

    }
}