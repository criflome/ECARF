package uam.mx.Negocio.Dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer ID;

    private String name;

    private String email;
    
	@OneToOne
	@JoinColumn(name="UserID", referencedColumnName="ID")
	private LlaveAcceso llave;
	
    public User() {
		super();
	}
    
	public User(String name, String email, LlaveAcceso llave) {
		this.name = name;
		this.email = email;
		this.llave= llave;
	}

	public Integer getId() {
		return ID;
	}

	public void setId(Integer id) {
		this.ID = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LlaveAcceso getLlave() {
		return llave;
	}

	public void setLlave(LlaveAcceso llave) {
		this.llave = llave;
	}
	
	
    
    
}

