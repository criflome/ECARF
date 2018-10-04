package uam.mx.Negocio.Dominio;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity // This tells Hibernate to make a table out of this class
public class LlaveAcceso {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long ID;

   String llave;
   String rol;
   
   
   /**
	 * Columna para poder hacer la relacion @OnetoOne con la clase User
	 */
	@Column(name="UserID")
	private Long UserID;
	
	 @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd KK:mm a", timezone="America/Mexico_City")
	   private Date fechaModificacion;
	
public LlaveAcceso() {
	
}
public LlaveAcceso(String rol) {
	SecureRandom random = new SecureRandom();
	this.llave = new BigInteger(130, random).toString(32);
	this.rol = rol;
	this.fechaModificacion = new Date();
}
public String getLlave() {
	return llave;
}
public void setLlave(String llave) {
	this.llave = llave;
}
public String getRol() {
	return rol;
}
public void setRol(String rol) {
	this.rol = rol;
}
@Override
public String toString() {
	return "LlaveAcceso [id=" + ID + ", llave=" + llave + ", rol=" + rol + "]";
}

   
   
    
    
}

