package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agn
 */
public class paciente extends pessoa  {
    private int cod_convenio;
    private String profissao;
    private String paciente_desde;
    private String ultima_consulta;

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * @return the paciente_desde
     */
    public String getPaciente_desde() {
        return paciente_desde;
    }

    /**
     * @param paciente_desde the paciente_desde to set
     */
    public void setPaciente_desde(String paciente_desde) {
        this.paciente_desde = paciente_desde;
    }

    /**
     * @return the ultima_consulta
     */
    public String getUltima_consulta() {
        return ultima_consulta;
    }

    /**
     * @param ultima_consulta the ultima_consulta to set
     */
    public void setUltima_consulta(String ultima_consulta) {
        this.ultima_consulta = ultima_consulta;
    }

    /**
     * @return the cod_convenio
     */
    public int getCod_convenio() {
        return cod_convenio;
    }

    /**
     * @param cod_convenio the cod_convenio to set
     */
    public void setCod_convenio(int cod_convenio) {
        this.cod_convenio = cod_convenio;
    }


    
}
