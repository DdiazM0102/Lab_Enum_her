package mundo;

public class Camisa extends Vestuario{
    
    public enum Marca
	{
		GEF, POLO, NAUTICA, NINGUNO
	}
	
	private Marca marca;
	
	public Camisa(Marca pMarca, Talla pTalla, double pPrecio)
	{
		super(pTalla, pPrecio);
		marca = pMarca;
	}
	
	public String toString()
	{
		return "Camisa "+marca + " Talla "+talla + "($ "+precio + ")";
	}

}
