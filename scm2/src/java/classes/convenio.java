/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.List;

/**
 *
 * @author agn
 */
public class convenio extends pessoa {
    
    private String nome_empre;
     private String cnpj;
    public List<convenio> listaConvenio;
    /**
     * @return the nome_empre
     */
    public String getNome_empre() {
        return nome_empre;
    }

    /**
     * @param nome_empre the nome_empre to set
     */
    public void setNome_empre(String nome_empre) {
        this.nome_empre = nome_empre;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

   
}
