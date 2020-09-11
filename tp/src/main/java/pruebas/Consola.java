package pruebas;

import java.io.IOException;
import java.util.List;

import com.API.Moneda;
import com.API.Pais;
import com.API.Provincia;

import persistencia.MapperBD;
import persistencia.MonedaMapperBD;
import persistencia.PaisMapperBD;
import persistencia.ProvinciaMapperBD;

public class Consola {
	public static void main(String args[]) throws IOException {
		
		Moneda m = new Moneda();
		MonedaMapperBD mbd = new MonedaMapperBD();
		List<Moneda> monedas = m.obtenerListaAPI();
		mbd.insert(monedas);
		
		Pais p = new Pais();
		PaisMapperBD pbd = new PaisMapperBD();
		List<Pais> paises = p.obtenerPaises();
		pbd.insert(paises);
		
		Provincia pr = new Provincia();
		ProvinciaMapperBD prbd = new ProvinciaMapperBD();
		
		//prbd.insert(paises.get(0).getStates());
		
		
	}
}
