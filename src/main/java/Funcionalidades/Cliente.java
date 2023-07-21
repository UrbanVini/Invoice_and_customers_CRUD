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
public class Cliente {

    private String cpfCnpj;
    private String inscricaoMunicipal;
    private String razaoSocial;
    private String endereco;
    private String numeroEndereco;
    private String complemento;
    private String bairro;
    private String ufEndereco;
    private String cep;
    private String telefone;
    private String email;
    private String razaoReduzida;
    private String dataCadastro;
    private String indicacao;
    private String comissao;


    public Cliente(){
        
    }
    
    public Cliente(String cpfCnpj ) {
    	this.cpfCnpj = cpfCnpj;
    }
    
    public Cliente(String cpfCnpj, String inscricaoMunicipal, String razaoSocial, String email) {
    	this.cpfCnpj = cpfCnpj;
    	this.inscricaoMunicipal = inscricaoMunicipal;
    	this.razaoSocial = razaoSocial;
    	this.email = email;
    }
    
    public Cliente(String cpfCnpj, String inscricaoMunicipal, String razaoSocial,
            String endereco, String numeroEndereco, String complemento,
            String bairro, String ufEndereco, String cep, String telefone, String email,
            String razaoReduzida, String dataCadastro, String indicacao, String comissao)
                
    {
        this.cpfCnpj = cpfCnpj;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.numeroEndereco = numeroEndereco;
        this.complemento = complemento;
        this.bairro = bairro;
        this.ufEndereco = ufEndereco;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.razaoReduzida = razaoReduzida;
        this.dataCadastro = dataCadastro;
        this.indicacao = indicacao;
        this.comissao = comissao;
    }


	public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUfEndereco() {
        return ufEndereco;
    }

    public void setUfEndereco(String ufEndereco) {
        this.ufEndereco = ufEndereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRazaoReduzida() {
        return razaoReduzida;
    }

    public void setRazaoReduzida(String razaoReduzida) {
        this.razaoReduzida = razaoReduzida;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public String getComissao() {
        return comissao;
    }

    public void setComissao(String comissao) {
        this.comissao = comissao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String toString(){
        return cpfCnpj + "Inscrição Municipal:" + inscricaoMunicipal + "Razão social" + razaoSocial + "Endereço:" + endereco + "Numero" + numeroEndereco + "Complemento:"
                + complemento + "Bairro:" + bairro + "UF:" + ufEndereco + "CEP:" + cep + "Telefone:" + telefone + "Email" + email +
                "RazãoReduzida:" + razaoReduzida + "Data:" + dataCadastro + "Indicação:" + indicacao + "Comissão:" + comissao;
    }
    
}
