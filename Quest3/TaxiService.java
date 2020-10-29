import java.util.List;
import java.util.ArrayList;

public class TaxiService {

	/**
	 * Assemble the Vehicles into a list. Be sure the order of the Vehicles remain:
	 * one, two, three.
	 * 
	 * @param one
	 * @param two
	 * @param three
	 * @return
	 */
	public List<Vehicle> list(Vehicle one, Vehicle two, Vehicle three) {
        List<Vehicle> myList = new ArrayList<Vehicle>();
        myList.add(one);
        myList.add(two);
        myList.add(three);
		return myList;
	}

	/**
	 * Ride cannot have more than 4 passengers. Ride must have a driver and at least
	 * 1 passenger.
	 * 
	 * If the Ride is not valid, throw the InvalidRideException.
	 * 
	 * @param ride
	 * @return
	 */
	public void validate(Ride ride) throws InvalidRideException {
        if ((ride.getPassengers().size()<1) || (ride.getPassengers().size()>4) || (ride.getDriver() == null)){
            throw new InvalidRideException();
        }
		
	}
}
