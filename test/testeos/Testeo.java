package testeos;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import mi.empresa.Empresa;
import mi.personas.Acompaniante;
import mi.personas.Chofer;
import mi.personas.Pasajero;
import mi.vehiculos.Autobus;
import mi.vehiculos.Flota;
import mi.vehiculos.Automovil;
import mi.vehiculos.Motocicleta;
public class Testeo {
    @Test
	public void quePuedaCambiarDeChoferSiLaMotoNoTieneAcompaniante() {
		Motocicleta nuevaMoto = new Motocicleta();
		assertNotNull(nuevaMoto);
	}
    @Test
	public void verificarQueSeAgregaNuevasFlotass() {
		Flota nuevaFlota = new Flota();
		assertNotNull(nuevaFlota);
		Empresa nuevaEmpresa = new Empresa();
		assertNotNull(nuevaEmpresa);
		assertNotNull(nuevaEmpresa.getFlotas());
		nuevaEmpresa.agregarFlota(nuevaFlota);
		nuevaEmpresa.agregarFlota(nuevaFlota);
		assertEquals(2,nuevaEmpresa.getFlotas().size());
	}
    @Test
	public void queExistaUnaEmpresaInstanciada() {
		Empresa nuevaEmpresa = new Empresa();
		assertNotNull(nuevaEmpresa);
	}
}
