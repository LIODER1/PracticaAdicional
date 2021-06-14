package interfas.ito.poo;

import ecepciones.ito.poo.*;

public interface interfas<T> {
	
		
		public boolean hayItem(T item); public boolean isFull();
		
		public T getItem(int pos); public boolean isFree();
		
	    public int getSize(); public boolean clear(T item);
		
	}
