
public class PCObs implements Observer, Display {
	
	WeatherStationObs wthStation;
	private float temp;
	private float hum;
	private float press;
	private float counter=0;
	private float tempAvg;
	private float humAvg;
	private float pressAvg;
	
	
	public PCObs(WeatherStationObs wthStation){ 
		// TODO Auto-generated constructor stub
	
		
		this.wthStation=wthStation;
		
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("PC AVERAGES");
		System.out.println("Temp averages for "+counter+" days is: "+tempAvg/counter);
		System.out.println("Hummidity averages for "+counter+" days is: "+ humAvg/counter);
		System.out.println("Preassure averages for "+counter+" days is: "+ pressAvg/counter);
		System.out.println("");
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.temp=wthStation.getTemp();
		this.hum=wthStation.getHum();
		this.press=wthStation.getPress();
		counter++;
		tempAvg+=temp;
		humAvg+=hum;
		pressAvg+=press;
		
		display();
	}

}
