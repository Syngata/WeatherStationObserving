
public class Mobitel implements Observer, Display {
	
	Stanje st;
	private float temp;
	private float hum;
	private float press;
	
	
	public Mobitel() {
		
		 
		
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("MOBILE DATA");
		System.out.println("Temp: "+temp);
		System.out.println("Hummidity: "+ hum);
		System.out.println("Preassure: "+ press);
		
		
		
	}

	@Override
	public void update(Stanje st) {
		// TODO Auto-generated method stub
		this.temp=st.getTemp();
		this.hum=st.getHum();
		this.press=st.getPress();
		display();
	}

}
