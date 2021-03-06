package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// DONE - start

		// create a client object and use it to

		// - connect to the broker
		// - publish the temperature(s)
		// - disconnect from the broker

		// DONE - end
		
		Client client = new Client("temperatureClient", Common.BROKERHOST, Common.BROKERPORT);
		
		client.connect();
		
		for (int i = 0; i < COUNT; i++) {
		
			client.publish(Common.TEMPTOPIC, Integer.toString(sn.read()));
		
		}
		
		client.disconnect();

		System.out.println("Temperature device stopping ... ");

	}
}
