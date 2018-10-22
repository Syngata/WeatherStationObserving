
public class Mobitel implements Observer, Display {
	
	WeatherStationObs wthStation;
	private float temp;
	private float hum;
	private float press;
	
	
	public Mobitel(WeatherStationObs wthStation) {
		
		this.wthStation=wthStation;
		
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Temp: "+temp);
		System.out.println("Hummidity: "+ hum);
		System.out.println("Preassure: "+ press);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.temp=wthStation.getTemp();
		this.hum=wthStation.getHum();
		this.press=wthStation.getPress();
		display();
	}

}
