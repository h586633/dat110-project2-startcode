package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
	
	// DONE: 
	// Implement object variables - a topic is required
	
	// Constructor, get/set-methods, and toString method
    // as described in the project text	
	
	private String topic;
	
	public CreateTopicMsg (String user, String topic) {
		super(MessageType.CREATETOPIC, topic);
	}
	
	public String getTopic() {
		return topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public String toString() {
		return "Creating the " + topic + " topic on the broker";
	}
}
