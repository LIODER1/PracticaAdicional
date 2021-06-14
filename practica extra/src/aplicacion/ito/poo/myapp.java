package aplicacion.ito.poo;

import java.awt.HeadlessException;

import java.io.FileNotFoundException;

import clases.ito.poo.song;

import ecepciones.ito.poo.solicitud;

import write.Doc1;

import write.Doc2;

import ecepciones.ito.poo.ConsultaSong;

import ecepciones.ito.poo.QuitarInt;

import ecepciones.ito.poo.QuitarSong;

import ecepciones.ito.poo.CancionesExistentes;

import ecepciones.ito.poo.tit;


public class myapp {

static song e=new song(); static Doc1 Doc1; static Doc2 Doc2;


static void run() throws HeadlessException, CancionesExistentes, QuitarSong, FileNotFoundException, tit, solicitud, ConsultaSong, QuitarInt {

Aplic1.menu();


}


static void crearArchivo() throws FileNotFoundException {

	Doc1 = new Doc1("Guardar");

}


public static void main(String[] args) throws HeadlessException, CancionesExistentes, QuitarSong, FileNotFoundException, tit, solicitud, ConsultaSong, QuitarInt {

	run();

}

}

