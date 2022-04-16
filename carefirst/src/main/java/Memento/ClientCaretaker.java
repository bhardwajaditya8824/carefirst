package Memento;

import java.util.ArrayDeque;
import java.util.Deque;

//Caretaker
public class ClientCaretaker {
	
	 final Deque<ClientMemento> mementos = new ArrayDeque<>();
	    public ClientMemento getMemento()
	    {
	    	ClientMemento clientMemento= mementos.pop();
	        return clientMemento;
	    }
	    public void addMemento(ClientMemento memento)
	    {
	        mementos.push(memento);
	    }

}
