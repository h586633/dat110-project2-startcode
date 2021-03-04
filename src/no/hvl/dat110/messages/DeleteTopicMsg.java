package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to delete topic on the broker

	// DONE:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	private String topic;
	
	public DeleteTopicMsg (String user, String topic) {
		super(MessageType.DELETETOPIC, topic);
	}
	
	public String getTopic() {
		return topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public String toString() {
		return "Deleting the " + topic + " topic on the broker";
	}

}
