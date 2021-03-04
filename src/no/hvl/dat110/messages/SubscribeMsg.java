package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 

	// DONE:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	private String topic;
	
	public String getTopic() {
		return topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public SubscribeMsg (String user, String topic) {
		super(MessageType.SUBSCRIBE, topic);
	}
	
	public String toString() {
		return "Subscribing on the " + topic + " topic on the broker";
	}	
}
