package recuperacion2;

public class Dataprovedor {
	int idProvedor;
	String nombre;
	String telfono;
	String correo;
	String direccion;
	String url;
	String contacto; 
	provedor dc=new provedor();
	
	public boolean insertar() {
		if (dc.insertar(this)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean eliminar() {
		if (dc.eliminar(this.getidProvedor())) {
			return true;
		} else {
			return false;
		}
	}

	public boolean actualizar() {
		if (dc.actualizar(this)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean cargar() {
		if (dc.cargar(this)) {
			return true;
		} else {
			return false;
		}

}
	public Dataprovedor() {
	}

	public Dataprovedor(int idProvedor, String nombre, String telfono, String correo, String direccion, String url,
			String contacto, provedor dc) {
		super();
		this.idProvedor = idProvedor;
		this.nombre = nombre;
		this.telfono = telfono;
		this.correo = correo;
		this.direccion = direccion;
		this.url = url;
		this.contacto = contacto;
		this.dc = dc;
	}

	public int getidProvedor() {
		return idProvedor;
	}

	public void setidProvedor(int idProvedor) {
		this.idProvedor =idProvedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelfono() {
		return telfono;
	}

	public void setTelfono(String telfono) {
		this.telfono = telfono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public provedor getDc() {
		return dc;
	}

	public void setDc(provedor dc) {
		this.dc = dc;
	}
	
}

