package it.unisa.personalTrainer;

import java.io.Serializable;

public class Utente implements Serializable{
	/**
	 * 
	 */




	public Utente(){
		
	}
	public Utente(String et�, String sesso, String peso, String altezza, String polso){
		this.et�=et�;
		this.sesso=sesso;
		this.peso=peso;
		this.altezza=altezza;
		this.polso=polso;

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
    
  
    
private String et�,sesso,peso,altezza,polso;
}
