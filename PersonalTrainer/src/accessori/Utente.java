package accessori;

import java.io.Serializable;

public class Utente implements Serializable{
	public Utente(){
		
	}
	public Utente(String et�, String sesso, String peso, String altezza, String polso,
			String preparazione){
		this.et�=et�;
		this.sesso=sesso;
		this.peso=peso;
		this.altezza=altezza;
		this.polso=polso;
		this.preparazione=preparazione;
	}
	
	public String getEt�(){
		return et�;
	}
	
    public void setEt�(String et�){
		this.et�=et�;
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
    
private String et�,sesso,peso,altezza,polso,preparazione;
}
