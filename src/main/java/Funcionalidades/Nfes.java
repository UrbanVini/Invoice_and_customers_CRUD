package Funcionalidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//import java.util.Date;
/**
 *
 * @author Gabi
 */
public class Nfes {
    
private String numero;
private String codVerificacao;
private String dataEmissao;
private String competencia;

private String baseCalculo;
private String issRetido;
private String valorLiquido;
private String valorServico;

private String codigoTributacao;
private String servico;

//Pegar do cliente 
private String cpfCnpjCliente;
private String razaoReduzidaCliente;
private String bairroCliente;
private String ufCliente;

private String dataVencimento;
private String dataPagamento;

private String jurosPagamento;
private String descontoPagamento;
private String impostoRetido;
private String valorPago;

//Tentei por cancelamento como opcional pois nem sempre irá tê-lo
private CancelamentoNfes cancelamentoNfe;


private String importadaEm;
private String jurosMultaAbonada;
private String anoMes;

private String diasAtraso;
private String nfeAtraso;
private String acumuloAtraso;

public Nfes(){
    
}

public Nfes(String codVerificacao, String numero, String dataEmissao, String competencia, String dataVencimento ,String dataPagamento, String baseCalculo, String issRetido,
			String valorLiquido, String valorServico, String jurosPagamento, String descontoPagamento, String impostoRetido, String valorPago) {
	this.codVerificacao = codVerificacao;
	this.numero = numero;
	this.dataEmissao = dataEmissao;
	this.competencia = competencia;
	this.dataVencimento = dataVencimento;
	this.dataPagamento = dataPagamento;
	this.baseCalculo = baseCalculo;
	this.issRetido = issRetido;
	this.valorLiquido = valorLiquido;
	this.valorServico = valorServico;
	this.jurosPagamento = jurosPagamento;
	this.descontoPagamento = descontoPagamento;
	this.impostoRetido = impostoRetido;
	this.valorPago = valorPago;
}

public Nfes(String numero, String codVerificacao, String dataEmissao, String competencia, String baseCalculo,
            String issRetido, String valorLiquido, String valorServico, String codigoTributacao, String servico,
            String cpfCnpjCliente, String razaoReduzidaCliente, String bairroCliente, String ufCliente,
            String dataVencimento, String dataPagamento, String jurosPagamento, String descontoPagamento,
            String impostoRetido, String valorPago, String importadaEm, String jurosMultaAbonada, String anoMes,
            String diasAtraso, String nfeAtraso, String acumuloAtraso) 





{
    this.numero = numero;
    this.codVerificacao = codVerificacao;
    this.dataEmissao = dataEmissao;
    this.competencia = competencia;
    this.baseCalculo = baseCalculo;
    this.issRetido = issRetido;
    this.valorLiquido = valorLiquido;
    this.valorServico = valorServico;
    this.codigoTributacao = codigoTributacao;
    this.servico = servico;
    this.cpfCnpjCliente = cpfCnpjCliente;
    this.razaoReduzidaCliente = razaoReduzidaCliente;
    this.bairroCliente = bairroCliente;
    this.ufCliente = ufCliente;
    this.dataVencimento = dataVencimento;
    this.dataPagamento = dataPagamento;
    this.jurosPagamento = jurosPagamento;
    this.descontoPagamento = descontoPagamento;
    this.impostoRetido = impostoRetido;
    this.valorPago = valorPago;
    this.importadaEm = importadaEm;
    this.jurosMultaAbonada = jurosMultaAbonada;
    this.anoMes = anoMes;
    this.diasAtraso = diasAtraso;
    this.nfeAtraso = nfeAtraso;
    this.acumuloAtraso = acumuloAtraso;

   

}

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodVerificacao() {
        return codVerificacao;
    }

    public void setCodVerificacao(String codVerificacao) {
        this.codVerificacao = codVerificacao;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public String getBaseCalculo() {
        return baseCalculo;
    }

    public void setBaseCalculo(String baseCalculo) {
        this.baseCalculo = baseCalculo;
    }

    public String getIssRetido() {
        return issRetido;
    }

    public void setIssRetido(String issRetido) {
        this.issRetido = issRetido;
    }

    public String getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(String valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public String getValorServico() {
        return valorServico;
    }

    public void setValorServico(String valorServico) {
        this.valorServico = valorServico;
    }

    public String getCodigoTributacao() {
        return codigoTributacao;
    }

    public void setCodigoTributacao(String codigoTributacao) {
        this.codigoTributacao = codigoTributacao;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getCpfCnpjCliente() {
        return cpfCnpjCliente;
    }

    public void setCpfCnpjCliente(String cpfCnpjCliente) {
        this.cpfCnpjCliente = cpfCnpjCliente;
    }

    public String getRazaoReduzidaCliente() {
        return razaoReduzidaCliente;
    }

    public void setRazaoReduzidaCliente(String razaoReduzidaCliente) {
        this.razaoReduzidaCliente = razaoReduzidaCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getUfCliente() {
        return ufCliente;
    }

    public void setUfCliente(String ufCliente) {
        this.ufCliente = ufCliente;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getJurosPagamento() {
        return jurosPagamento;
    }

    public void setJurosPagamento(String jurosPagamento) {
        this.jurosPagamento = jurosPagamento;
    }

    public String getDescontoPagamento() {
        return descontoPagamento;
    }

    public void setDescontoPagamento(String descontoPagamento) {
        this.descontoPagamento = descontoPagamento;
    }

    public String getImpostoRetido() {
        return impostoRetido;
    }

    public void setImpostoRetido(String impostoRetido) {
        this.impostoRetido = impostoRetido;
    }

    public String getValorPago() {
        return valorPago;
    }

    public void setValorPago(String valorPago) {
        this.valorPago = valorPago;
    }

    public String getImportadaEm() {
        return importadaEm;
    }

    public void setImportadaEm(String importadaEm) {
        this.importadaEm = importadaEm;
    }

    public String getJurosMultaAbonada() {
        return jurosMultaAbonada;
    }

    public void setJurosMultaAbonada(String jurosMultaAbonada) {
        this.jurosMultaAbonada = jurosMultaAbonada;
    }

    public String getAnoMes() {
        return anoMes;
    }

    public void setAnoMes(String anoMes) {
        this.anoMes = anoMes;
    }

    public String getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(String diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public String getNfeAtraso() {
        return nfeAtraso;
    }

    public void setNfeAtraso(String nfeAtraso) {
        this.nfeAtraso = nfeAtraso;
    }

    public String getAcumuloAtraso() {
        return acumuloAtraso;
    }

    public void setAcumuloAtraso(String acumuloAtraso) {
        this.acumuloAtraso = acumuloAtraso;
    }

    public CancelamentoNfes getCancelamentoNfe() {
        return cancelamentoNfe;
    }

    public void setCancelamentoNfe(CancelamentoNfes cancelamentoNfe) {
        this.cancelamentoNfe = cancelamentoNfe;
    }
    
    public void cancelarNfe(String codigo, int data, String confirmacao) {
       CancelamentoNfes cancelamento = new CancelamentoNfes();
      cancelamento.setCodCancelamento(codigo);
      cancelamento.setDataCancelamento(data);
      cancelamento.setConfirmacaoCancelamento(confirmacao);
     this.setCancelamentoNfe(cancelamento);
}
}
