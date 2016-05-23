
package parcheggioauto;

public class Posto {
    //tipo= ora o mensile
    String tipo;
    float ora_arrivo;
    float  ora_ritiro;
    boolean libero;
    
    public Posto(){
        this.tipo=null;
        this.libero= true;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isLibero() {
        return libero;
    }

    public void setLibero(boolean libero) {
        this.libero = libero;
    }
    
    public void AffittaPosto(float OraArrivo){
    if(this.isLibero()==true){
        this.libero =false;
        this.ora_arrivo= OraArrivo;
    }
    }
    public void RilasciaPosto(float OraRitiro){
        if(this.isLibero()==false){
            this.ora_ritiro= OraRitiro;
            this.libero =true;
        }
    }

 
}
