package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// DONE? (not sure if correct) - START
				
		// create a client object and use it to
		
		// - connect to the broker
		// - create the temperature topic on the broker
		// - subscribe to the topic
		// - receive messages on the topic
		// - unsubscribe from the topic
		// - disconnect from the broker
		
		// TODO - END
		
		Client client = new Client("displayClient", Common.BROKERHOST, Common.BROKERPORT);
		
		client.connect();
		
		client.createTopic(Common.TEMPTOPIC);
		
		client.subscribe(Common.TEMPTOPIC);
		
		client.receive();
		
		client.unsubscribe(Common.TEMPTOPIC);
		
		client.disconnect();
		
		System.out.println("Display stopping ... ");
		
	}
}
