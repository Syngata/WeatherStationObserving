
public class Stanje implements Observer {
	
	WeatherStationObs wbo;
	
	private float temp;
	private float hum;
	private float press;
	
	public Stanje(WeatherStationObs wbo) {
		
		this.wbo=wbo;
		
		
		
		
		}

	public WeatherStationObs getWbo() {
		return wbo;
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



	@Override
	public void update(Stanje st) {
		// TODO Auto-generated method stub
		this.temp=wbo.getTemp();
		this.hum=wbo.getHum();
		this.press=wbo.getPress();
		
		
	}
	
	
}
