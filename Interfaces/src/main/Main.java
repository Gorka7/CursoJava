package main;

import aparato.Aparato;
import aparato.Radio;
import aparato.Tv;
import ave.Ave;
import ave.Buitre;
import ave.Canario;
import ave.Loro;
import ave.Piolin;
import intefaces.Hablador;
import persona.Alumno;
import persona.Bedel;
import persona.Persona;
import persona.Profesor;

public class Main {

	public static void main(String[] args) {

		Persona persona = new Persona("Alberto", 37);
		Ave ave = new Ave("Masculino", 4);
		Aparato aparato = new Aparato(200, 400);
		Buitre buitre = new Buitre("Femenino", 5, 20, 40);
		Canario canario = new Canario("Masculino", 5, false);
		Loro loro = new Loro("Masculino", 4, "Sur", "Blanco");
		Piolin piolin = new Piolin("Masculino", 5, "En la Ducha", 10);
		Alumno alumno = new Alumno("Gorka", 31, "Informatica", "ASIR");
		Profesor profesor = new Profesor("Pepe", 45, "Informatica", "pepe@gmail.com");
		Bedel bedel = new Bedel("Pepe", 55, "Mañana", 10);
		Tv tv = new Tv(40, 400, false, 10);
		Radio radio = new Radio(56, 300, false, 30);

		Object[] habladores = new Object[12];

		habladores[0] = persona;
		habladores[1] = ave;
		habladores[2] = aparato;
		habladores[3] = buitre;
		habladores[4] = canario;
		habladores[5] = loro;
		habladores[6] = piolin;
		habladores[7] = alumno;
		habladores[8] = profesor;
		habladores[9] = bedel;
		habladores[10] = tv;
		habladores[11] = radio;

		for (int i = 0; i < habladores.length; i++) {
			if (habladores[i] instanceof Hablador) {
				Hablador h = (Hablador) habladores[i];
				h.hablar();
			}
		}

	}

}
