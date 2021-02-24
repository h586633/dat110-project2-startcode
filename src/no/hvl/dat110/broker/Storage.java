package no.hvl.dat110.broker;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import no.hvl.dat110.common.TODO;
import no.hvl.dat110.common.Logger;
import no.hvl.dat110.messagetransport.Connection;

public class Storage {

	// data structure for managing subscriptions
	// maps from a topic to set of subscribed users
	protected ConcurrentHashMap<String, Set<String>> subscriptions;
	
	// data structure for managing currently connected clients
	// maps from user to corresponding client session object
	protected ConcurrentHashMap<String, ClientSession> clients;

	public Storage() {
		subscriptions = new ConcurrentHashMap<String, Set<String>>();
		clients = new ConcurrentHashMap<String, ClientSession>();
	}

	public Collection<ClientSession> getSessions() {
		return clients.values();
	}

	public Set<String> getTopics() {

		return subscriptions.keySet();

	}

	// get the session object for a given user
	// session object can be used to send a message to the user
	
	public ClientSession getSession(String user) {

		ClientSession session = clients.get(user);

		return session;
	}

	public Set<String> getSubscribers(String topic) {

		return (subscriptions.get(topic));

	}

	public void addClientSession(String user, Connection connection) {

		// DONE?: add corresponding client session to the storage
		
		clients.put(user, getSession(user));
		
	}

	public void removeClientSession(String user) {

		// DONE: remove client session for user from the storage
		
		clients.remove(user);
		
	}

	public void createTopic(String topic) {

		// DONE?: create topic in the storage
		
		subscriptions.put(topic, null);
	
	}

	public void deleteTopic(String topic) {
		
		// DONE: delete topic from the storage
		
		subscriptions.remove(topic);
		
	}

	public void addSubscriber(String user, String topic) {

		// TODO (Unsure about how to connect user to topic using Set<String>): add the user as subscriber to the topic
		
		Set<String> userSet = (Set<String>) user;
		
		subscriptions.put(topic, userSet);
		
		throw new UnsupportedOperationException(TODO.method());
		
	}

	public void removeSubscriber(String user, String topic) {

		// DONE: remove the user as subscriber to the topic
		
		subscriptions.remove(user, topic);

	}
}
