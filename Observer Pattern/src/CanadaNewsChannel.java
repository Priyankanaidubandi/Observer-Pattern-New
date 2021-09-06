
public class CanadaNewsChannel implements Observer{

	 

	@Override
	public void covidUupdate(CovidMessage message) {
		System.out.println("Canada News channel  :: " + message.getMessageContent());
		
	} 
}
