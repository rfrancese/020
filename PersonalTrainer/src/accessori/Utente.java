package accessori;

import java.io.Serializable;

public class Utente implements Serializable{
	public Utente(){
		
	}
	public Utente(String età, String sesso, String peso, String altezza, String polso,
			String preparazione){
		this.età=età;
		this.sesso=sesso;
		this.peso=peso;
		this.altezza=altezza;
		this.polso=polso;
		this.preparazione=preparazione;
	}
	
	public String getEtà(){
		return età;
	}
	
    public void setEtà(String età){
		this.età=età;
	}
    
	public String getPeso(){
		return peso;
	}
	
    public void setPeso(String peso){
		this.peso=peso;
	}
    
    public String getSesso(){
		return sesso;
	}
    
    public void setSesso(String sesso){
		this.sesso=sesso;
	}
    
    public String getAltezza(){
		return altezza;
	}
    
    public void setAltezza(String altezza){
		this.altezza=altezza;
	}
    
    public String getPolso(){
		return polso;
	}
    
    public void setPolso(String polso){
		this.polso=polso;
	}
    
    public String getPreparazione(){
		return preparazione;
	}
    
    public void setPreparazione(String preparazione){
		this.preparazione=preparazione;
	}
    
private String età,sesso,peso,altezza,polso,preparazione;
}
