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
public class especialidade extends pessoa {
    private int id_especialidade;
    private String nome_especialidade;
    
    public List <especialidade> listarEspecialidade;

    

    /**
     * @return the id_especialidade
     */
    public int getId_especialidade() {
        return id_especialidade;
    }

    /**
     * @param id_especialidade the id_especialidade to set
     */
    public void setId_especialidade(int id_especialidade) {
        this.id_especialidade = id_especialidade;
    }

    /**
     * @return the nome_especialidade
     */
    public String getNome_especialidade() {
        return nome_especialidade;
    }

    /**
     * @param nome_especialidade the nome_especialidade to set
     */
    public void setNome_especialidade(String nome_especialidade) {
        this.nome_especialidade = nome_especialidade;
    }
    
}
