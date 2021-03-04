package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to publish a message on a topic 

	// DONE?:
	// Implement object variables - a topic and a message is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	//private String user;
	private String topic;
	private String message;
	
	public PublishMsg (String user, String topic, String message) {
		super(MessageType.PUBLISH, message);
	}
	
	public String getTopic() {
		return topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String toString() {
		return "Publish the " + message + " message on the " + topic + " topic on the broker";
	}
}
