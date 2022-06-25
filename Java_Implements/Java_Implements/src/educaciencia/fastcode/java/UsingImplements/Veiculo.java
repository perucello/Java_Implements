package educaciencia.fastcode.java.UsingImplements;

public class Veiculo implements Veiculo_Acao {

	@Override
	public void Ligar() {
		// throw new UnsupportedOperationException("Not supported yet."); //To change
		// body of generated methods, choose Tools | Templates.
		System.out.println("Veiculo Ligado");
	}

	@Override
	public void Desligar() {
		// throw new UnsupportedOperationException("Not supported yet."); //To change
		// body of generated methods, choose Tools | Templates.
		System.out.println("Veiculo Desligado");
	}

}
