
package mundo;


public class Computador extends Electronico{

    public enum Sistema{
        WINDOWS, IOS
    }
    
    private Sistema sistema;
    
        public Computador(Gama pGama, double pPrecio, Sistema pSistema) {
            
        super(pGama, pPrecio);
        sistema = pSistema;
    }


    public String toString() {
        return "Celular "+sistema.name()+" - "+"Gama "+gama;
    }
    
        
    
}
