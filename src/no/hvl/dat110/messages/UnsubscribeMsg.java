package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

	// DONE?:
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
	
	public UnsubscribeMsg (String topic) {
		super(MessageType.UNSUBSCRIBE, topic);
	}
	
	public String toString() {
		return "Unsubscribing on the " + topic + " topic on the broker";
	}	
}
