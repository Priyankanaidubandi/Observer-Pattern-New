

public class IndiaNewsChannel implements Observer{

	 

	@Override
	public void covidUupdate(CovidMessage message) {
		System.out.println("India :: " + message.getMessageContent());
		
	} 
	
}
