package egresosIngresos;

import java.util.List;

public class OrdenValorPrimeroEgreso extends Requerimiento {

	@Override
	public IngresosEgresos ordenar(List<OperacionEgreso> egresosAVincular, List<OperacionIngreso> ingresoAVincular) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	private ArrayList<ArrayList<OperacionEgreso>> egresosAceptados=new ArrayList<ArrayList<OperacionEgreso>>();
	public void ordenarEgresosPorValor() {
		Collections.sort(organizacion.egresos, new Comparator<OperacionEgreso>(){
			public int compare(OperacionEgreso unEgreso,OperacionEgreso otroEgreso) {
				return new Float(unEgreso.getValorDeEgreso()).compareTo(new Float(otroEgreso.getValorDeEgreso()));
			}
			
		});
			
	}
	@Override
	public void ordenar() {
		int i=0;
	    ArrayList<OperacionEgreso> egresosOrganizacion=new ArrayList<OperacionEgreso>();
	    this.ordenarEgresosPorValor();
	    for(OperacionEgreso unEgreso:organizacion.egresos){
	        egresosOrganizacion.add(unEgreso);
	        }
		for(OperacionIngreso unIngreso:organizacion.ingresos) {
	    	float valorIngreso = unIngreso.getMontoTotal();
	    	for(OperacionEgreso unEgreso:egresosOrganizacion) {
	    		if(unEgreso.compararFechas(unIngreso)) {
	    	    valorIngreso-=unEgreso.getValorDeEgreso();
	    	    egresosAceptados.get(i).add(unEgreso);
	    	    egresosOrganizacion.remove(unEgreso);
	    		}
	        }
	    	i+=1;
	    }
	}
*/
}