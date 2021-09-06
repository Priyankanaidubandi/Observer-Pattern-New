import java.util.ArrayList;
import java.util.List;

public class CovidObserver implements Subject {

	private List<Observer> observers = new ArrayList<>();

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	@Override
	public void notifyCovidUpdate(CovidMessage m) {

		for (Observer o : observers) {
			o.covidUupdate(m);
		}

	}

	@Override
	public void addNewsChannel(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeNewsChannel(Observer o) {
		observers.remove(o);

	}

}
