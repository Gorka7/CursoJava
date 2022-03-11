package pajaritos;

public class Main3 {

	public static void main(String[] args) {

		Ave[] pajaritos = new Ave[2];

		pajaritos[0] = new Loro("Hembra", 3, "N", "Azul");
		pajaritos[1] = new Piolin("Masculino", 1, 10);

		for (int i = 0; i < pajaritos.length; i++) {
			if (pajaritos[i] instanceof Loro) {
				// System.out.println(((Loro)pajaritos[i]).getRegion());
				Loro lorit = (Loro) pajaritos[i];
				System.out.println("Region Loro : "+lorit.getRegion());
			} else {
				// System.out.println(((Piolin)pajaritos[i]).getNumPeliculas());
				Piolin pio = (Piolin) pajaritos[i];
				System.out.println("Numero Peliculas Piolin : "+pio.getNumPeliculas());
			}
		}

		Ave.numeroAvesCreadas();
	}

}
