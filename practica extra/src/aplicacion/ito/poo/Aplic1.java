package aplicacion.ito.poo;


	
	import java.awt.HeadlessException;
	
	import java.time.LocalDate;
	
	import interfas.ito.poo.interfas;
	
	import ecepciones.ito.poo.QuitarSong;
	
	import ecepciones.ito.poo.ConsultaSong;
	
	import ecepciones.ito.poo.QuitarInt;
	
	import ecepciones.ito.poo.solicitud;
	
	import ecepciones.ito.poo.tit;
    
	import ecepciones.ito.poo.CancionesExistentes;
	
	import javax.swing.JOptionPane;
	
	import clases.ito.poo.*;
	
	import java.io.FileNotFoundException;
    
	import write.Doc1;
    
	import write.Doc2;
    
	import javax.swing.JPanel;
    
	import java.util.Scanner;
    
    
	
	public class Aplic1 {
		
		static Scanner leer= new Scanner(System.in);

		static song e;
		static comp c;
		static Doc1 Doc1;
		static Doc2 Doc2;

		static void menu() throws HeadlessException, CancionesExistentes, QuitarSong, ConsultaSong, solicitud, tit, QuitarInt, FileNotFoundException {
			Comenzar();
			
			
			final JPanel
			panel=new JPanel();
			boolean error=true;
			while(error) {
			try {
			boolean ciclo=true;
			int respuesta=0;
			while(ciclo) {
			String opciones="Seleccione la opccion\n 1)Agregar composición\n2)Quitar interprete\n 3)Quitar cancion\n4)Enseñar composición\n5)salir ";
			respuesta=Integer.parseInt(JOptionPane.showInputDialog(opciones));
			
			
			switch(respuesta) {
			case 1:adicionarComposicion();break;
			case 2: System.out.print ("Quitar interprete");
			for(int i=0;i<=e.getSize();i++)
			System.out.println("Localizacion"+(i+1)+e.getItem(i));
			System.out.print("Escoge la posicion");
			int z = leer.nextInt();
			case 3:QuitarSong();break;
			case 4:vercancion();break;
			case 5:registro();ciclo=false;error=false;break;
			default:JOptionPane.showMessageDialog(null,"Ingresar opcion");
			}
			}

			
			
			}catch(tit e){

			JOptionPane.showMessageDialog(panel,e.getMessage(),"¡¡¡ERROR!!!", JOptionPane.ERROR_MESSAGE);

			}catch(solicitud e) {

			JOptionPane.showMessageDialog(panel,e.getMessage(),"¡¡¡ERROR!!!", JOptionPane.ERROR_MESSAGE);

			}catch(CancionesExistentes e) {

			JOptionPane.showMessageDialog(panel,e.getMessage(),"¡¡¡ERROR!!!", JOptionPane.ERROR_MESSAGE);

			}catch(QuitarInt e) {

			JOptionPane.showMessageDialog(panel,e.getMessage(),"¡¡¡ERROR!!!", JOptionPane.ERROR_MESSAGE);

			}catch(QuitarSong e) {

			JOptionPane.showMessageDialog(panel,e.getMessage(),"¡¡¡ERROR!!!", JOptionPane.ERROR_MESSAGE);

			}catch(ConsultaSong e) {

			JOptionPane.showMessageDialog(panel,e.getMessage(),"¡¡¡ERROR!!!", JOptionPane.ERROR_MESSAGE);

			}
			}
			}

		
		
		static void tex() throws tit ,CancionesExistentes {

			while(!Doc2.isEOF()) {
			comp n=null;
			n.setNombre(Doc2.readString());
			n.setMin(Doc2.readInt());
			n.setSeg(Doc2.readInt());
			n.setGenero(Doc2.readString());
			n.setSolicitudes(Doc2.readString());
			n.setRegistro(LocalDate.parse(Doc2.readString()));
			n.setEstreno(LocalDate.parse(Doc2.readString()));
			String fechaAct;
			fechaAct=Doc2.readString();
			if(fechaAct.equals("null"))
			n.setEstreno(null);
			else
			n.setEstreno(LocalDate.parse(fechaAct));
			e.addItem(c);
			Doc2.isFinLinea();


			}
			}
		
		
		
		static comp capturarComposición() throws CancionesExistentes,ConsultaSong,QuitarInt,QuitarSong,tit,solicitud  {
		comp c = new comp (0, 0, null, null, null, null, null, null);
		
				String nombre, solicitudes, genero, registro, estreno;float min;float seg;
				nombre=JOptionPane.showInputDialog("Colocar nombre");
				solicitudes=JOptionPane.showInputDialog("Nombre del solicitante:");
				genero=JOptionPane.showInputDialog("Colocar el genero musical");
				registro=JOptionPane.showInputDialog("Introduce la fecha en la que se registro la canción\nColocar:(Año-Mes-Día):");
				estreno=JOptionPane.showInputDialog("Introduce la fecha en la que se estreno la canción\nColocar:(Año-Mes-Día):");
				min=Float.parseFloat(JOptionPane.showInputDialog("Colocar los minutos"));
				seg=Float.parseFloat(JOptionPane.showInputDialog("Colocar los segundos"));
				c.setNombre(nombre);
				c.setSolicitudes(solicitudes);
				c.setGenero(genero);
				c.setRegistro(LocalDate.parse(registro));
				c.setEstreno(LocalDate.parse(estreno));
				c.setMin(min);
				c.setSeg(seg);
				return c;
			}
		
		static void vercancion() {
				
				
				if(e.isFree())
					JOptionPane.showMessageDialog(null,"No hay ninguna composicion");
				else {
					
				String abc="";
				for(int i=0;i<e.getSize();i++)
					abc=abc+"\n"+(e.getItem(i));
				JOptionPane.showMessageDialog(null,abc);
				
				  }
		        }
		
			
		
			static void QuitarInterprete(int a) {
				String interprete = "";
				e.getItem(a).setSolicitudes(interprete);
				
				
			}
			
		
		static void Comenzar() {
			e=new song();
		}
		
		
			
			static void QuitarSong() throws QuitarSong {
				int pos=0;
				if(e.isFree())
					JOptionPane.showMessageDialog(null,"No hay canciones");
				else {
					boolean CUENTA=true;
					while(CUENTA) {
				    String abc="";
				    
				    for(int i=0;i<e.getSize();i++)
					    abc=abc+"\n"+(i+1)+")"+(e.getItem(i));
				    pos=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la cancion que desea eliminar\n"+abc));
				    if((e.getSize())>=pos&&pos>0) {
				    	e.QuitarSong(e.getItem(pos-1));
				    	e.clear(e.getItem(pos-1));
				    	
				    	JOptionPane.showMessageDialog(null,"La cancion fue eliminada");
				    	CUENTA=false;
				    }	
				    else
			
				    	
				    	JOptionPane.showMessageDialog(null,"No hay canciones, por lo tanto no se puede eliminar");
				  }
				}
			}
			
			
			
			static void registro() throws FileNotFoundException,CancionesExistentes,QuitarInt,ConsultaSong {
				if (e.isFree()) {

				}
				else {
				Doc1=new Doc1("Ahorra abc");
				for(int i=0;i<e.getSize();i++) {
				Doc1.writeString(e.getItem(i).getGenero());
				Doc1.writeString(e.getItem(i).getNombre());
				Doc1.writeString(e.getItem(i).getSolicitudes());
				if(e.getItem(i).getRegistro()==null) {
				Doc1.writeString(e.getItem(i).getEstreno().toString());
				Doc1.writeStringLn("null");
				}
				else {
				Doc1.writeString(e.getItem(i).getRegistro().toString());
				Doc1.writeStringLn(e.getItem(i).getEstreno().toString());
				}

				}
				Doc1.close();
				}

				}

			
			
		static void adicionarComposicion() throws  CancionesExistentes,ConsultaSong,QuitarInt,QuitarSong,tit,solicitud {
			comp adicionar;
			adicionar=capturarComposición();
			
			e.addItem(adicionar);
		    JOptionPane.showMessageDialog(null,"La composicion se agrego");
				if(e.isFull())
					e.aumenta();
			
		}
			
			
	}