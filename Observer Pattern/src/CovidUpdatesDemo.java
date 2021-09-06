

public class CovidUpdatesDemo { 
	
	public static void main(String[] args) 
    {
		
		IndiaNewsChannel india = new IndiaNewsChannel();
		USANewsChannel usa = new USANewsChannel();
	    CanadaNewsChannel ca = new CanadaNewsChannel();
	     
	    CovidObserver p = new CovidObserver();
	    
	    p.addNewsChannel(india);
	    p.addNewsChannel(usa);
	    p.addNewsChannel(ca);
	    
	    System.out.println("\n *** Total world wide Covid count Updates ***\n");
	    
	    p.notifyCovidUpdate(new CovidMessage("Total Covid possitve cases 300000 , Death count : 50000"));
  
      
        
       
		
    }
	
    
}
	
 
