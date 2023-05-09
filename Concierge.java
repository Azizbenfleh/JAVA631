package AzizJava;

import java.util.ArrayList;
import java.util.List;

public abstract class Concierge implements PapotageListener{
	public List<Bavard> bavardList=new ArrayList<Bavard>();
	private String nom;
	 
	 
	// Constructeur
	    public Concierge() {
	        this.nom=nom;
	    }
	
    // methode pour recevoir des messages de papoutage
	    public void recevoirPapotage(PapotageEvent event) {
	        String message = event.getCorps();
	        System.out.println("Message reçu : " + message);
	    }
	    
	 // envoyer message a tout les utilisateurs
		public void EnvoyerLesMessage(PapotageEvent event) {
			this.recevoirPapotage(event);
			for (int i=0;i<bavardList.size();i++) {	
					if(bavardList.get(i).getEtat()) {
					bavardList.get(i).recevoirPapotage(event);
					}
			 
			
		}
			} 
	    
	    

		public void ajouterBavard(Bavard bavard) {
			bavardList.add(bavard);
			
		}

		public void retirerBavard(Bavard bavard) {
			 bavardList.remove(bavard);
			
		}

}
