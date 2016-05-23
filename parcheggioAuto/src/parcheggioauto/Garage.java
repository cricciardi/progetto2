
package parcheggioauto;

public class Garage {
      private Livello[] livello;
    
    public Garage() {
        this.livello = new Livello[3];
    }
    
    public boolean disponibilitAffittoaOre(){
        for (int i = 0; i < this.livello.length; i++) {
            if(livello[i].PostiLiberiLivello()==true){
                return true;
            }
        }
        return false;
    }
    
 public boolean DisponibilitaAffittoMensile(){
     int conta_posti=0;
     int posti_tot=0;
      for (int i = 0; i < this.livello.length; i++){
          conta_posti= conta_posti+ livello[i].PostiAffittatiMensilmente();
      }
      for (int i = 0; i < this.livello.length; i++)
          posti_tot = posti_tot+ livello[i].getPOSTI();
      
      if(conta_posti< (posti_tot/2)){
          return true;
      }
      return false;
     
 }
 
 public float CalcolaPrezzo(Posto posto, float tariffaAdOra){
     float permanenza;
     float prezzo;
     float penale=20;
     permanenza=  posto.ora_ritiro-posto.ora_arrivo;
     prezzo= tariffaAdOra*permanenza;
     if(permanenza> 8){
         return prezzo = prezzo+ penale;
     }
     else return prezzo;

  }
   
}
