package JUnit;

import static org.junit.Assert.*;

import java.io.Serializable;


public class AccesoUsuarioTest {

	
	public void testConstructor() throws Exception{
//		AccesoUsuario a = new AccesoUsuario();
		AccesoUsuario a = AccesoUsuario.class.getConstructor().newInstance();
		assertNotNull("No se ha podido crear el objeto", a);
	}
	
	public void testId(){
		AccesoUsuario a = new AccesoUsuario();
		Long l = (long) 9999999l;
		a.setId(l);
		assertNotEquals("Id no esperado", l, a.getId());
	}
	
	public void testSerializable(){
		AccesoUsuario a = new AccesoUsuario();
		assertTrue("No se puede serializar", a instanceof Serializable);
	}
	
	public void testNombre(){
		AccesoUsuario a = new AccesoUsuario();
		String s = "-";
		a.setNombre(s);
		assertNotEquals("Nombre no esperado", s, a.getNombre());
		
	}
	
	public void testUsuarioExiste(){
		AccesoUsuario a = new AccesoUsuario();
		a.setId(1234l);
		a.setNombre("-");
		AccesoUsuario a2 = new AccesoUsuario();
		a2.setId(1234l);
		a2.setNombre("-");
		assertEquals("No son iguales", a, a2);
		
	}
	
	public void testUsuarioNoExiste(){
		AccesoUsuario a = new AccesoUsuario();
		a.setId(1234l);
		a.setNombre("-");
		AccesoUsuario a2 = new AccesoUsuario();
		a2.setId(1234l);
		a2.setNombre(".");
		assertNotEquals("No son iguales", a, a2);
		
	}
	
	public void tesHashCode(){
		AccesoUsuario a = new AccesoUsuario();
		assertEquals("HashCode erroneo", 0, a.hashCode());
		Long l = 1234l;
		a.setId(l);
		assertEquals("HashCode erroneo", l.hashCode(), a.hashCode());
	}


}
