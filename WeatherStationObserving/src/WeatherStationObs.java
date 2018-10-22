import java.util.ArrayList;

public class WeatherStationObs implements Observable {

	private ArrayList<Observer> observers;
	private float temp;
	private float hum;
	private float press;
	
	public WeatherStationObs() {
		// TODO Auto-generated constructor stub
		observers= new ArrayList<>();
	}
	
	@Override
	public void add(Observer obs) {
		// TODO Auto-generated method stub
		observers.add(obs);
	}

	@Override
	public void remove(Observer obs) {
		// TODO Auto-generated method stub
		observers.remove(obs);
	}

	@Override
	public void notifyObs() {
		// TODO Auto-generated method stub
		for(Observer obs:observers) {
			obs.update();
		}
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public float getTemp() {
		return temp;
	}

	public float getHum() {
		return hum;
	}

	public float getPress() {
		return press;
	}

	public void setAll(float temp, float hum, float press) {
		this.temp=temp;
		this.hum=hum;
		this.press=press;
		
		stateChanged();
	}

	public void stateChanged() {
		notifyObs ();
	}

}
