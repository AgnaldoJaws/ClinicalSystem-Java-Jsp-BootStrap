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
public class registroClinico {
    private int cod_RestriClinico;
    private int cod_pre_atendimento;
    private String diagnostico;
    private String receita;
    private String guia_exame;
    private String consulta ;
    

    
   
    /**
     * @return the cod_pre_atendimento
     */
    public int getCod_pre_atendimento() {
        return cod_pre_atendimento;
    }

    /**
     * @param cod_pre_atendimento the cod_pre_atendimento to set
     */
    public void setCod_pre_atendimento(int cod_pre_atendimento) {
        this.cod_pre_atendimento = cod_pre_atendimento;
    }

    /**
     * @return the diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * @param diagnostico the diagnostico to set
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * @return the receita
     */
    public String getReceita() {
        return receita;
    }

    /**
     * @param receita the receita to set
     */
    public void setReceita(String receita) {
        this.receita = receita;
    }

    /**
     * @return the guia_exame
     */
    public String getGuia_exame() {
        return guia_exame;
    }

    /**
     * @param guia_exame the guia_exame to set
     */
    public void setGuia_exame(String guia_exame) {
        this.guia_exame = guia_exame;
    }

    /**
     * @return the consulta
     */
    public String getConsulta() {
        return consulta;
    }

    /**
     * @param consulta the consulta to set
     */
    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    /**
     * @return the cod_RestriClinico
     */
    public int getCod_RestriClinico() {
        return cod_RestriClinico;
    }

    /**
     * @param cod_RestriClinico the cod_RestriClinico to set
     */
    public void setCod_RestriClinico(int cod_RestriClinico) {
        this.cod_RestriClinico = cod_RestriClinico;
    }
    
    
}
