
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	public boolean autentica(int senha) {

		if (this.senha == senha) {
			return true;
		}

		return false;
	}

	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
