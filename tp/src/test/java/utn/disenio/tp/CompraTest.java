package utn.disenio.tp;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import general.Compra;
import general.Presupuesto;
import general.Producto;
import general.ProveedorMenorValor;
import general.Usuario;

public class CompraTest 
{

	@Test
	public void validarMethodsCompra() {
		Producto producto1 = new Producto("heladera",2000);
		Producto producto2 = new Producto("televisor",300);
		Producto producto3 = new Producto("televisor",350);
		List<Producto> listaProductos = Arrays.asList(producto1,producto2,producto3);
		
		ArrayList<Presupuesto> listaPresupuestos = new ArrayList<Presupuesto>();
		Presupuesto presupuesto1 = new Presupuesto();
		Presupuesto presupuesto2 = new Presupuesto();
		Presupuesto presupuesto3 = new Presupuesto();
		
		listaPresupuestos.add(presupuesto1);
		listaPresupuestos.add(presupuesto2);
		listaPresupuestos.add(presupuesto3);
		
		ArrayList<Usuario> listaUsuariosRevisores = new ArrayList<Usuario>();
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		Usuario usuario3 = new Usuario();
		Usuario usuario4 = new Usuario();
						
		
		listaUsuariosRevisores.add(usuario1);
		listaUsuariosRevisores.add(usuario2);
		listaUsuariosRevisores.add(usuario3);
		
		ProveedorMenorValor criterio = new ProveedorMenorValor();
		
		Compra compra = new Compra(listaProductos, listaPresupuestos,presupuesto1, 3,listaUsuariosRevisores, criterio);
		
		compra.agregarRevisor(usuario4);
		
		assertTrue(compra.getValorTotal() == 2650);
		assertTrue(compra.getPresupuestoElegido()== presupuesto1);
		assertTrue(compra.isRequierePresupuestos());
		assertTrue(compra.getCriterio()== criterio);
		assertTrue(compra.getCantidadMinimaPresupuestos()== 3);
	}
}