
public class USANewsChannel implements Observer{

 

	@Override
	public void covidUupdate(CovidMessage message) {
		System.out.println("USA News Channel   :: " + message.getMessageContent());
		
	} 
}
