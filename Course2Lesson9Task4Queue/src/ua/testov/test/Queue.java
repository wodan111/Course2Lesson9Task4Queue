package ua.testov.test;

import java.util.ArrayDeque;

public class Queue {
private ArrayDeque<String> q = new ArrayDeque<>();

public Queue() {
	super();
	queue();
}
private void queue(){
	q.add("Sheldon");
	q.add("Leonard");
	q.add("Volovitc");
	q.add("Kutrapalli");
	q.add("Penny");
}
public ArrayDeque<String> magicQueue(int cup) {
	for (int i = 0; i < cup; i++) {	
		String x=q.pollFirst();
		q.addLast(x);
		q.addLast(x);
	}	
	return q;
}
}
