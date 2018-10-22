
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeatherStationObs wso1 = new WeatherStationObs();
		Mobitel mob1= new Mobitel(wso1);
		
		wso1.add(mob1);
		
		wso1.setAll(21, 15, 12);
						
		System.out.println("************************");
		wso1.setAll(12, 9, 2);
		
	}

}
