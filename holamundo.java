
package curso.java.holamundo;
import java.util.*;
import org.joda.time.*;

public class holamundo{

public static void main(String[] args){

DateTime ahora = new DateTime();
DateTime ayer = ahora.plusDays(-1);
System.out.println("ahora=" + ahora);
System.out.println("ayer=" + ayer);

System.setProperty("NOMBRE", "Carlos");
String path = System.getProperty("PATH");
String nombre = System.getProperty("NOMBRE");
System.out.println("PATH=" + path);
System.out.println("NOMBRE=" + nombre);
System.out.println("Time=" + System.currentTimeMillis() 
	+ " milisegundos desde 1970");

/*

Calendar f = Calendar.getInstance();
String dia = Integer.toString(f.get(Calendar.DATE));
String mes = Integer.toString(f.get(Calendar.MONTH));
String year = Integer.toString(f.get(Calendar.YEAR));
System.out.println ("Usando Calendar, hoy es " + dia + " del " 
	+ mes + " de " + year );
	*/
}
}


/*
public static void main(String[] args){
System.out.println("Hola Mundo");
int l = args.length;
if (1 >= 1) {
	String nombre = args[0];
	System.out.println(nombre);
}else{
	System.out.println("Anónimo");
}
}

*/