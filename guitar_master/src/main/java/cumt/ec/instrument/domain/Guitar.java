package cumt.ec.instrument.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="instrument")
public class Guitar implements java.io.Serializable{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "gid")
	private Integer id;
	
	@Column(name="serialNumber",unique=true)
    private String serialNumber;
	
	@Column(name="builder")
	private String builder; 
	
	@Column(name="model")
	private String model;
	
	@Column(name="numStrings")
	private String numStrings;
	
	@Column(name="backWood")
	private String backWood;
	
	@Column(name="topWood")
	private String topWood;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getNumStrings() {
		return numStrings;
	}
	public void setNumStrings(String numStrings) {
		this.numStrings = numStrings;
	}
	public String getBackWood() {
		return backWood;
	}
	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}
	public String getTopWood() {
		return topWood;
	}
	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}
	public boolean matches(Guitar otherSpec) {
		if(!builder.equalsIgnoreCase(otherSpec.getBuilder()) && otherSpec.getBuilder().length() > 0){
			return false;
		}else if(!model.equalsIgnoreCase(otherSpec.getModel()) && otherSpec.getModel().length() > 0){
			return false;
		}else if(!numStrings.equalsIgnoreCase(otherSpec.getNumStrings()) && otherSpec.getNumStrings().length() > 0){
			return false;
		}else if(!backWood.equalsIgnoreCase(otherSpec.getBackWood()) && otherSpec.getBackWood().length() > 0){
			return false;
		}else if(!topWood.equalsIgnoreCase(otherSpec.getTopWood()) && otherSpec.getTopWood().length() > 0){
			return false;
		}
		return true;

	  }
	 
	}

