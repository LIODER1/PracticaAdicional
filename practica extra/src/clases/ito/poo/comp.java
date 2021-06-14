package clases.ito.poo;
import java.time.LocalDate;
public class comp {
	
	public comp( float min, float seg, LocalDate registro, String solicitudes, String elaboracion, LocalDate estreno,
			String nombre, String genero) {
		super();
		
		this.registro = registro; this.estreno = estreno; this.solicitudes = solicitudes;
		
		this.nombre = nombre; this.genero = genero; this.min = min; this.seg = seg;
	
	}

	
	
	private float min = 0F; private float seg = 0F; private LocalDate registro = null;
	
	private String solicitudes =""; private LocalDate estreno = null; private String nombre = ""; private String genero ="";
	
	
	public int compareTo(comp o) {
		int compare=0;
		if (this.nombre.equalsIgnoreCase(o.getNombre()))
			compare=-1;
		else if(this.nombre.equalsIgnoreCase(o.getNombre()))
			compare=1;
		return compare;
	
		
	}
	
	
	public float getMin() {
		return min;
	}


	
	public void setMin(float min) {
		this.min = min;
	}


	
	public float getSeg() {
		return seg;
	}


	
	public void setSeg(float seg) {
		this.seg = seg;
	}
	
	
	
	public LocalDate getRegistro() {
		return registro;
	}

	
	
	public void setRegistro(LocalDate registro) {
		this.registro = registro;
	}

	
	
	public String getSolicitudes() {
		return solicitudes;
	}

	
	
	public void setSolicitudes(String solicitudes) {
		this.solicitudes = solicitudes;
	}

	
	
	public LocalDate getEstreno() {
		return estreno;
	}

	
	
	public void setEstreno(LocalDate estreno) {
		this.estreno = estreno;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	public String getGenero() {
		return genero;
	}

	
	
	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	
	@Override
	public String toString() {
		return "comp [ min=" + min + ",seg=" + seg + ", solicitudes=" + solicitudes + ", nombre="
				+ nombre + ", genero=" + genero + "]";
	}

}
