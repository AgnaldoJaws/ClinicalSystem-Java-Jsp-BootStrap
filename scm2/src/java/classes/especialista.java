/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author agn
 */
public class especialista extends pessoa{
    private int id_especialista;
    int cod_especialidade;
    String crm ,  consenho_profissional ,   outras_informacoes;          
    private String nome_especialista;

    /**
     * @return the cod_especialidade
     */
    
    /**
     * @return the crm
     */
    public String getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(String crm) {
        this.crm = crm;
    }

    /**
     * @return the consenho_profissional
     */
    public String getConsenho_profissional() {
        return consenho_profissional;
    }

    /**
     * @param consenho_profissional the consenho_profissional to set
     */
    public void setConsenho_profissional(String consenho_profissional) {
        this.consenho_profissional = consenho_profissional;
    }

    /**
     * @return the outras_informacoes
     */
    public String getOutras_informacoes() {
        return outras_informacoes;
    }

    /**
     * @param outras_informacoes the outras_informacoes to set
     */
    public void setOutras_informacoes(String outras_informacoes) {
        this.outras_informacoes = outras_informacoes;
    }

    /**
     * @return the id_especialista
     */
    public int getId_especialista() {
        return id_especialista;
    }

    /**
     * @param id_especialista the id_especialista to set
     */
    public void setId_especialista(int id_especialista) {
        this.id_especialista = id_especialista;
    }

    /**
     * @return the cod_especialidade
     */
    public int getCod_especialidade() {
        return cod_especialidade;
    }

    /**
     * @param cod_especialidade the cod_especialidade to set
     */
    public void setCod_especialidade(int cod_especialidade) {
        this.cod_especialidade = cod_especialidade;
    }

    /**
     * @return the nome_especialista
     */
    public String getNome_especialista() {
        return nome_especialista;
    }

    /**
     * @param nome_especialista the nome_especialista to set
     */
    public void setNome_especialista(String nome_especialista) {
        this.nome_especialista = nome_especialista;
    }

    
                        
                       

    

    
    
    
}
