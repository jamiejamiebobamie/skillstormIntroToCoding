/**
*  This is the only class in this project with requirements. You should only
*  have to work within this class to complete the project.
*/
public class TaxiService {

	/**
	 * Ride cannot have more than 4 passengers. If ride has more than 4 passengers, throw InvalidRideException  
	 * Ride must have a driver and at least 1 passenger. Hint: if driver is null, a driver hasn't been assigned. 
     * If the ride does not have a driver, throw InvalidRideException. If the ride has less than 1 passenger, throw InvalidRideException. 
	 * 
	 * @param ride
	 * @return
	 */
	public void validate(Ride ride) throws InvalidRideException {
      if (ride.getPassengers().length>4
          || ride.getDriver() == null
          || ride.getPassengers().length <= 0) {
          throw new InvalidRideException();
      }
	}
	
	/**
	 * Return the number of passengers with 
	 * accountType = BUSINESS.
	 * 
	 * Hint: Use the equals method in String class
	 * to compare Strings.
	 * 
	 * @param ride
	 * @return
	 */
	public int business(Ride ride) {
        int count = 0;
        Passenger[] passengers = ride.getPassengers();
        String desiredType = "BUSINESS";
        for (int i = 0; i< passengers.length; i++){
            if (desiredType.equals(passengers[i].getAccountType())){
                count++;
            }
        }
		return count;
	}
	
}
