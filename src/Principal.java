
import org.hibernate.Session;

public class Principal {

	public static void main(String[] args) {

		Session session = HibernateUtilities.getSessionFactory().openSession();	
		IntroducirDatos(session);
		session.close();
		HibernateUtilities.getSessionFactory().close();
		
	}

	public static void IntroducirDatos(Session session) {

		/*Añadimos la primera empresa*/

		session.beginTransaction();

		Empresa e1 = new Empresa();
		e1.setNombre("Carnicas Garcia");
		e1.setDireccion("Jaume I, Catarroja");
		e1.setFundacion(1975);

		Empleado a1 = new Empleado();
		a1.setNombre("Juan");
		a1.setEdad(32);

		Datos d1 = new Datos();
		d1.setPuesto("Director");
		d1.setSegsocial("43584946875");



		Empleado a2 = new Empleado();
		a2.setNombre("Rosario");
		a2.setEdad(41);

		Datos d2 = new Datos();
		d2.setPuesto("Dependiente");
		d2.setSegsocial("56456487984");


		/* TODO:
		 * Añadir a1 y a2 en la empresa e1
		 * Enlazar a1 con d1 y a2 con d2
		 */
		a1.setDato(d1);
		a2.setDato(d2);

		e1.addEmpleados(a1);
		e1.addEmpleados(a2);
		
		session.save(e1);

		session.getTransaction().commit();

		/*Añadimos la segunda empresa*/

		session.beginTransaction();

		e1 = new Empresa();
		e1.setNombre("Perfumerias Plaza");
		e1.setDireccion("Plaza Gibraltar, Valencia");
		e1.setFundacion(2001);

		a1 = new Empleado();
		a1.setNombre("Maria");
		a1.setEdad(35);

		d1 = new Datos();
		d1.setPuesto("Administrativa");
		d1.setSegsocial("564894856418");


		a2 = new Empleado();
		a2.setNombre("Andres");
		a2.setEdad(38);

		d2 = new Datos();
		d2.setPuesto("Contable");
		d2.setSegsocial("878946545648");



		/* TODO:
		 * Añadir a1 y a2 en la empresa e1
		 * Enlazar a1 con d1 y a2 con d2
		 */
		a1.setDato(d1);
		a2.setDato(d2);

		e1.addEmpleados(a1);
		e1.addEmpleados(a2);
		

		session.save(e1);

		session.getTransaction().commit();		
		

	}

}
