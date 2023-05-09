package AzizJava;
import java.util.EventObject;
public class PapotageEvent  extends EventObject{
	private String sujet;
	private String corps;
	
	public PapotageEvent (Object source , String sujet, String corps) {
		super(source);
        this.setSujet(sujet);
        this.setCorps(corps);
	}

	public String getCorps() {
		return corps;
	}

	public void setCorps(String corps) {
		this.corps = corps;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}   
	
	

}
 