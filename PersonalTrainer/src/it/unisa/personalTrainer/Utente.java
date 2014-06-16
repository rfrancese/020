package it.unisa.personalTrainer;

import java.io.Serializable;

public class Utente implements Serializable{
	/**
	 * 
	 */




	public Utente(){
		
	}
	public Utente(String età, String sesso, String peso, String altezza, String polso){
		this.età=età;
		this.sesso=sesso;
		this.peso=peso;
		this.altezza=altezza;
		this.polso=polso;

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
    
  
    
private String età,sesso,peso,altezza,polso;
}
