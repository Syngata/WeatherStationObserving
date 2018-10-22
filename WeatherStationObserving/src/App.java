
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeatherStationObs wso1 = new WeatherStationObs();
		Stanje st= new Stanje(wso1);
		Mobitel mob1= new Mobitel();
		PCObs pco= new PCObs();
		
		wso1.add(mob1);
		wso1.add(pco);
		
		wso1.setAll(10, 20, 30);
		wso1.setAll(20, 30, 40);
		wso1.setAll(30, 40, 50);
		wso1.setAll(40, 50, 60);
		
		
	}

}
