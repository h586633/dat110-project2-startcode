package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// DONE? (Not sure about client user name should be something else) - start

		// create a client object and use it to

		// - connect to the broker
		// - publish the temperature(s)
		// - disconnect from the broker

		// DONE? - end
		
		Client client = new Client("temperatureClient", Common.BROKERHOST, Common.BROKERPORT);
		
		client.connect();
		
		for (int i = 0; i < COUNT; i++) {
		
			client.publish(Common.TEMPTOPIC, sn.toString());
		
		}
		
		client.disconnect();

		System.out.println("Temperature device stopping ... ");

	}
}
