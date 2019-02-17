import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class backend {

	JFrame f;
	JFrame f1;
	int[] passengers;
	int[] busStops;
	
	/**
	 * busStops are assigned and all passengers are randomized from 100 to 200.
	 * passengers are them distributed.
	 */
	public backend() {
		busStops = new int [] { 0, 1, 2, 3, 4, 5,
				 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 ,18, 19 };
		
		Random rand = new Random();
		
		 f=new JFrame("Bus Stops"); 
		 
		
		int numberPassenger = rand.nextInt(101) + 100;
		
		System.out.println(numberPassenger + "\n\n");
		
		passengers = new int [busStops.length];
		
		
		for( int i = 0; i < busStops.length; i++) {
			
			int dummy = rand.nextInt(numberPassenger + 1);
			
			passengers[i] = dummy;
			
			numberPassenger -= dummy;
		}
		
		String output = "";
		
		for(int j = 0; j < passengers.length;j++) {
			
			output += "Bus Stop Number: " + busStops[j] + 
					" Number of Passengers: " + passengers[j] + "\n";
			
		}	
		
		JOptionPane.showMessageDialog(f, output) ;		
		
		inputBusStop();
		
	}
	/**
	 * this method ask the user for the input of his/her bus stop
	 */
	
	public void inputBusStop() {
		
		JFrame f1 = new JFrame();
		
		String busPassenger = "";
		
		int BusStopNumber = -1;
		
		while(BusStopNumber < 0 || BusStopNumber > 19) {
			
			busPassenger=JOptionPane.showInputDialog(f,"Enter Bus stop number(0-19)");
			
			BusStopNumber = Integer.parseInt(busPassenger);
		}
		
		passengers[BusStopNumber ] ++;
		
		String newOutput = "";
		
		for(int j = 0; j < busStops.length;j++) {
					
					newOutput += "Bus Stop Number: " + busStops[j] + 
							" Number of Passengers: " + passengers[j] + "\n";
					
			}	
				
		JOptionPane.showMessageDialog(f, newOutput) ;	
		
	}
}

