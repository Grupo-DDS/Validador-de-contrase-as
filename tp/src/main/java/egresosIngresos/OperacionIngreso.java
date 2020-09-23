package egresosIngresos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="INGRESOS")
public class OperacionIngreso {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_INGRESO")
	private Long id;
	
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@Column(name="MONTO_TOTAL")
	private float montoTotal;
	
	@Column(name="FECHA_OPERACION")
	private Date fechaOperacion;
	
	@OneToMany(mappedBy="ingreso")
	private List<OperacionEgreso> egresos=new ArrayList<OperacionEgreso>();
	
	private Organizacion organizacion;
	
	private Date fechaInicio= sumarDiasAFecha(fechaOperacion,-5);
	private Date fechaFin= sumarDiasAFecha(fechaOperacion,5);
	@Override
	public String toString() {
		return "OperacionIngreso [id=" + id + ", descripcion=" + descripcion + ", montoTotal=" + montoTotal
				 + ", egresos=" + egresos + ", fechaOperacion=" + fechaOperacion + "]";
	}
	
	
	public OperacionIngreso(String descripcion, float montoTotal,
			 ArrayList<OperacionEgreso> egresos, Date fechaOperacion, Organizacion organizacion) {
		super();
		
		this.descripcion = descripcion;
		this.montoTotal = montoTotal;
		this.egresos = egresos;
		this.fechaOperacion=fechaOperacion;
		this.setOrganizacion(organizacion);
	}

	public OperacionIngreso() {}
	public long getId() {
		return id;
	}
	
	public Date getFechaOperacion() {
		return fechaOperacion;
	}


	public void setFechaOperacion(Date fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public List<OperacionEgreso> getEgresos() {
		return egresos;
	}
	public void setEgresos(ArrayList<OperacionEgreso> egresos) {
		this.egresos = egresos;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(float montoTotal) {
		this.montoTotal = montoTotal;
	}
	public static Date sumarDiasAFecha(Date fecha, int dias){
	      if (dias==0) return fecha;
	      Calendar calendar = Calendar.getInstance();
	      calendar.setTime(fecha); 
	      calendar.add(Calendar.DAY_OF_YEAR, dias);  
	      return calendar.getTime(); 
	}


	public Date getFechaInicio() {
		return fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}


	public Organizacion getOrganizacion() {
		return organizacion;
	}

	public void setOrganizacion(Organizacion organizacion) {
		this.organizacion = organizacion;
	}
}

