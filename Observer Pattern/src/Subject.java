

public interface Subject {

	public void addNewsChannel(Observer o);
    public void removeNewsChannel(Observer o);
    public void notifyCovidUpdate(CovidMessage m);

}
