
public class TestaConexao {

	public static void main(String[] args) throws Exception {
		
		Conexao con = null;
		
		/*
		try {
//			Conexao con = new Conexao();
			con = new Conexao();
			con.leDados();
			con.fecha();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
		*/
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
	}
}
