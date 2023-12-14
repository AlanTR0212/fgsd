package recuperacion2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import recuperacion2.Dataprovedor;

class pro {

	@Test
	void testInsertar() {
		
		Dataprovedor x=new Dataprovedor();
		x.setidProvedor(765);
		x.setNombre("15");
		x.setTelfono("20");
		x.setCorreo("30");
		x.setDireccion("25");
		x.setUrl("35");
		x.setContacto("55");
		assertTrue(x.insertar());
	
	}

	@Test
	void testEliminar() {
		Dataprovedor x=new Dataprovedor();
		x.setidProvedor(679);
		assertTrue(x.eliminar());
		
	}

	@Test
	void testActualizar() {
		Dataprovedor x=new Dataprovedor();
		x.setidProvedor(2);
		x.setNombre("15");
		x.setTelfono("20");
		x.setCorreo("30");
		x.setDireccion("25");
		x.setUrl("35");
		x.setContacto("55");
		
		assertTrue(x.actualizar());
	}

	@Test
	void testCargar() {
		Dataprovedor x=new Dataprovedor();
		x.setidProvedor(2);
		
		
		
		assertTrue(x.cargar());
	}

}
