package parcheggioauto;

public class Livello {

    private Posto[] posti;
    private int price = 0;
    private final int POSTI = 100;

    public Livello() {
        this.posti = new Posto[POSTI];
    }

    public boolean PostiLiberiLivello() {
        for (int i = 0; i < this.posti.length; i++) {
            if (this.posti[i].isLibero() == true) {
                return true;
            }

        }
        return false;
    }

    public int PostiAffittatiMensilmente() {
        int posti_mensili = 0;
        for (int i = 0; i < this.posti.length; i++) {
            if (posti[i].getTipo().equals("Mensile")) {
                posti_mensili++;
            }
        }
        return posti_mensili;
    }

    public int getPrice() {
        return price;
    }

    public int getPOSTI() {
        return POSTI;
    }
   
    
}
