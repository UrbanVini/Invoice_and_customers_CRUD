package Funcionalidades;

//import Funcionalidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Funcionalidades.TelaInicial;
import javax.swing.JOptionPane;

public class MetodosSave {

	TelaInicial teste = new TelaInicial();
	
	public void criarRegistroClienteBD(Cliente c) throws SQLException {
		Connection con = Connector.conectar();
		PreparedStatement stmt = null;
		String sql = "INSERT INTO cliente (cpf_cnpj, cep, telefone, inscricao_municipal, email, razao_social,"
				+ " razao_reduzida, data_de_cadastro, num_endereco, indicacao, complemento, bairro, end_uf)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, c.getCpfCnpj());
			stmt.setString(2, c.getCep());
			stmt.setString(3, c.getTelefone());
			stmt.setString(4, c.getInscricaoMunicipal());
			stmt.setString(5, c.getEmail());
			stmt.setString(6, c.getRazaoSocial());
			stmt.setString(7, c.getRazaoReduzida());
			stmt.setString(8, c.getDataCadastro());
			stmt.setString(9, c.getNumeroEndereco());
			stmt.setString(10, c.getIndicacao());
			stmt.setString(11, c.getComplemento());
			stmt.setString(12, c.getBairro());
			stmt.setString(13, c.getUfEndereco());
			
			stmt.executeUpdate();
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar os dados na tela");
		}finally{
			Connector.desconectar(con, stmt);
		}
	}
	
	public void criarRegistroNfeBD(Nfes nfe) throws SQLException {
		Connection con = Connector.conectar();
		PreparedStatement stmt = null;
		String sql = "INSERT INTO nfe (cod_ver, numero, data_de_emissao, competencia, vencimento, pagamento, base_calc, iss_retido, valor_liq_nfe, valor_servicos, juros," 
				  + " desconto, imposto_retido, valor_pago) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, nfe.getCodVerificacao());
			stmt.setString(2, nfe.getNumero());
			stmt.setString(3, nfe.getDataEmissao());
			stmt.setString(4, nfe.getCompetencia());
			stmt.setString(5, nfe.getDataVencimento());
			stmt.setString(6, nfe.getDataPagamento());
			stmt.setString(7, nfe.getBaseCalculo());
			stmt.setString(8, nfe.getIssRetido());
			stmt.setString(9, nfe.getValorLiquido());
			stmt.setString(10, nfe.getValorServico());
			stmt.setString(11, nfe.getJurosPagamento());
			stmt.setString(12, nfe.getDescontoPagamento());
			stmt.setString(13, nfe.getImpostoRetido());
			stmt.setString(14, nfe.getValorPago());
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar os dados");
		} finally {
			Connector.desconectar(con, stmt);
		}
	}
	
	public void deletarNFE(String codVer) {
		Connection con = Connector.conectar();
		PreparedStatement stmt = null;
		String sql = "DELETE from nfe where cod_ver= ?";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, codVer);
			stmt.executeUpdate();
		} catch (SQLException e) {
			JOptionPane.showConfirmDialog(null, "Erro ao excluir os dados");
		} finally {
			Connector.desconectar(con, stmt);
		}
	}
	
	public ArrayList<Cliente> listarDadosCliente(){
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		Connection con = Connector.conectar();
		PreparedStatement stmt = null;
		String sql = "SELECT * from cliente";
		
		try {
			stmt = con.prepareStatement(sql);
			ResultSet resposta = stmt.executeQuery(sql);
			
			while(resposta.next()) {
				
				String cpfCnpj = resposta.getString("cpf_cnpj");
				String razaoSocial = resposta.getString("razao_social");
				String inscMunicipal = resposta.getString("inscricao_municipal");
				String email = resposta.getString("email");
				
				Cliente c = new Cliente(cpfCnpj, razaoSocial, inscMunicipal, email);
				cliente.add(c);
			}
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao listar dados na tabela.");
		} finally {
			Connector.desconectar(con, stmt);
		}
		return cliente;
	}
	
	public ArrayList<Nfes> listarDadosNfe(){
		ArrayList<Nfes> nfe = new ArrayList<Nfes>();
		Connection con = Connector.conectar();
		PreparedStatement stmt = null;
		String sql = "SELECT * from nfe";
		
		try {
			stmt = con.prepareStatement(sql);
			ResultSet resposta = stmt.executeQuery(sql);
			while(resposta.next()) {
				String codVer = resposta.getString("cod_ver");
				String numero = resposta.getString("numero");
				String dataEmissao = resposta.getString("data_de_emissao");
				String competencia = resposta.getString("competencia");
				String vencimento = resposta.getString("vencimento");
				String pagamento = resposta.getString("pagamento");
				String baseCalc = resposta.getString("base_calc");
				String issRetido = resposta.getString("iss_retido");
				String valorLiq = resposta.getString("valor_liq_nfe");
				String valorServ = resposta.getString("valor_servicos");
				String juros  = resposta.getString("juros");
				String desconto = resposta.getString("desconto");
				String impostoRet = resposta.getString("imposto_retido");
				String valorPago = resposta.getString("valor_pago");
				
				Nfes n = new Nfes(codVer, numero, dataEmissao, competencia, vencimento, pagamento, baseCalc, issRetido, valorLiq, valorServ, juros, desconto, impostoRet, valorPago);
				nfe.add(n);
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao listar dados na tabela.");
		} finally {
			Connector.desconectar(con, stmt);
		}
		return nfe;
	}
	
	public void alterarRegistroCliente(Cliente c) {
    	Connection con = Connector.conectar();

        try {
            String sql = "UPDATE cliente SET cpf_cnpj = ?, cep = ?, telefone = ?, "
            		+ "inscricao_municipal = ?, email = ?, razao_social = ?,"
            		+ " razao_reduzida = ?, data_de_cadastro = ?,"
            		+ " num_endereco = ?, indicacao = ?, complemento = ?, bairro = ?,"
            		+ "end_uf = ?, WHERE cpf_cnpj = ?";
          
            PreparedStatement stmt = con.prepareStatement(sql);

        	stmt.setString(1, c.getCpfCnpj());
			stmt.setString(2, c.getCep());
			stmt.setString(3, c.getTelefone());
			stmt.setString(4, c.getInscricaoMunicipal());
			stmt.setString(5, c.getEmail());
			stmt.setString(6, c.getRazaoSocial());
			stmt.setString(7, c.getRazaoReduzida());
			stmt.setString(8, c.getDataCadastro());
			stmt.setString(9, c.getNumeroEndereco());
			stmt.setString(10, c.getIndicacao());
			stmt.setString(11, c.getComplemento());
			stmt.setString(12, c.getBairro());
			stmt.setString(13, c.getUfEndereco());

          //  String rowsAffected = stmt.executeUpdate();
			stmt.executeUpdate();
          //  System.out.println(rowsAffected + " registros atualizados com sucesso.");
			JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso !");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
        	Connector.desconectar(con,null);
        }
    }
	
	
	/*
	public ArrayList<Cliente> pesquisaClienteCpfCnpj(String teste){
		Connection con = Connector.conectar();
		PreparedStatement stmt = null;
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		String sql = "SELECT cpf_cnpj from cliente WHERE cpf_cnpj = ?";
		try {
			stmt = con.prepareStatement(sql);
			ResultSet resposta = stmt.executeQuery(sql);
			
			while (resposta.next()) {
				String cpfCnpj = resposta.getString("cpf_cnpj");
				Cliente c = new Cliente(cpfCnpj);
				cliente.add(c);
			}
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao pesquisar o cliente.");
		} finally {
			Connector.desconectar(con, stmt);
		}
		return cliente;
	}
	*/
}

