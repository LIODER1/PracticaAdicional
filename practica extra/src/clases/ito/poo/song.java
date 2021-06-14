package clases.ito.poo;


import java.time.LocalDate;

import ecepciones.ito.poo.CancionesExistentes;

import java.util.HashSet;

import clases.ito.poo.comp;

import interfas.ito.poo.interfas;

import ecepciones.ito.poo.QuitarSong;



public class song implements interfas <comp> {
	
	
	private comp comp[]=null;
	
	private int ultimo=0;
	
	private final int INC=5;
	
	static comp c;
	
	public song() {
	   super();
	   this.comp=new comp[INC];
	   this.ultimo=-1;
	}
	
	
	
	public void aumenta() {
		
		comp aumenta[]=new comp[this.comp.length+INC];
		
		for(int i=0;i<comp.length;i++)
			aumenta[i]=this.comp[i];
		comp= aumenta;
	}

	
	
	
	public boolean existeItem(comp item) {
		boolean existe=false;
		
		for(int i=0;i<=this.ultimo;i++)
			if(item.compareTo(this.comp[i])==0) {
				existe=true;
				break;
			}
					
		return existe;
	}
	
	
	
    public void QuitarSong(comp item) throws QuitarSong{
		
		if(item.getSolicitudes()==null) 
		{
			
			throw new QuitarSong("¡Advertencia! Esta compocision no se pueda dar de baja");
		}
	}
    
    
	
	public comp getItem(int pos) {
		comp cb=null;
		
		if(pos<=this.ultimo&&!this.isFree())
			cb=this.comp[pos];
		
		return cb;
	}
	
	

	public boolean addItem(comp item) throws CancionesExistentes {
		boolean add=false;
		
		if(this.isFull()) 
			aumenta();
		
		int j=0;
		for(;j<=this.ultimo;j++)
			if(item.compareTo(this.comp[j])<0) {
				break;
				}
				
				for(int i=this.ultimo;i>=j;i--)
					comp[i+1]=comp[i];
				this.comp[j]=item;
				this.ultimo++;
				add=true;
			
		return add;
	}
	
	
	
    public int getSize() {
		return this.ultimo+1;
	}

    
    
   
    
    public boolean isFree() {
		return this.ultimo==-1;
	}

     public boolean clear(comp item) {
		boolean elimina=false;
		if(this.existeItem(item)) {
			int i=0;
			for(;i<=this.ultimo;i++)
				if(item.compareTo(this.comp[i])==0)
					break;
			for(;i<=this.ultimo;i++)
				comp[i]=comp[i+1];
			this.ultimo--;
			elimina=true;
		}
		return elimina;
	}
    
     
     
    public boolean isFull() {
		
		return this.ultimo+1==this.comp.length;
	}

    
    
	@Override
	public boolean hayItem(clases.ito.poo.comp item) {
		// TODO Auto-generated method stub
		return false;
	}

}
