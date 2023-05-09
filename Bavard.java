package AzizJava;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

public abstract class Bavard implements PapotageListener  {
     private String nom;
     ArrayList<PapotageListener> destinataires = new ArrayList<PapotageListener>(); 
     public Concierge concierge; 
     public boolean etat= true;
    

    public Bavard(Concierge concierge , String nom) {
        this.nom=nom;
        this.concierge=concierge;
        
    }
    // Créateur de l evenement PapotageEvent.
    public void generateNouveauMessage(String sujet, String corps) {
    	PapotageEvent message = new PapotageEvent(this, sujet,corps);
    	for ( PapotageListener P: destinataires) {
    		P.nouveaumessage(corps);
    	}
    }
    
 // Réception de l'événement PapotageEvent émis par d'autres bavards.
    public void recevoirPapotage(PapotageEvent event) {
        String message = event.getCorps();
        System.out.println("Message reçu : " + message);
    }
    public void connecter(Concierge concierge) {
        concierge.ajouterBavard(this);
    }

    public void seDeconnecter(Concierge concierge) {
        concierge.retirerBavard(this);
    }
    
    public boolean getEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
}
