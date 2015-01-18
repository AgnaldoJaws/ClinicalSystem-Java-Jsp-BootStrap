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
public class pre_atendimento {
    
    private int id_pre_Atendimento;
    private String cod_especialista;
    private String cod_paciente;
    private String outras_informacoes;
    private String data_abertura;
    private String data_consulta;
    private String hora_consulta;
    private String valor_pagamento;
    private String data_pagamento;
    private String status_pre_atendimento;
    private String consulta;
    /**
     * @return the cod_especialista
     */
    public String getCod_especialista() {
        return cod_especialista;
    }

    /**
     * @param cod_especialista the cod_especialista to set
     */
    public void setCod_especialista(String cod_especialista) {
        this.cod_especialista = cod_especialista;
    }

    /**
     * @return the cod_paciente
     */
    public String getCod_paciente() {
        return cod_paciente;
    }

    /**
     * @param cod_paciente the cod_paciente to set
     */
    public void setCod_paciente(String cod_paciente) {
        this.cod_paciente = cod_paciente;
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
     * @return the id_pre_Atendimento
     */
    public int getId_pre_Atendimento() {
        return id_pre_Atendimento;
    }

    /**
     * @param id_pre_Atendimento the id_pre_Atendimento to set
     */
    public void setId_pre_Atendimento(int id_pre_Atendimento) {
        this.id_pre_Atendimento = id_pre_Atendimento;
    }

    /**
     * @return the data_abertura
     */
    public String getData_abertura() {
        return data_abertura;
    }

    /**
     * @param data_abertura the data_abertura to set
     */
    public void setData_abertura(String data_abertura) {
        this.data_abertura = data_abertura;
    }

    /**
     * @return the data_consulta
     */
    public String getData_consulta() {
        return data_consulta;
    }

    /**
     * @param data_consulta the data_consulta to set
     */
    public void setData_consulta(String data_consulta) {
        this.data_consulta = data_consulta;
    }

    /**
     * @return the hora_consulta
     */
    public String getHora_consulta() {
        return hora_consulta;
    }

    /**
     * @param hora_consulta the hora_consulta to set
     */
    public void setHora_consulta(String hora_consulta) {
        this.hora_consulta = hora_consulta;
    }

    /**
     * @return the valor_pagamento
     */
    public String getValor_pagamento() {
        return valor_pagamento;
    }

    /**
     * @param valor_pagamento the valor_pagamento to set
     */
    public void setValor_pagamento(String valor_pagamento) {
        this.valor_pagamento = valor_pagamento;
    }

    /**
     * @return the data_pagamento
     */
    public String getData_pagamento() {
        return data_pagamento;
    }

    /**
     * @param data_pagamento the data_pagamento to set
     */
    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    /**
     * @return the status_pre_atendimento
     */
    public String getStatus_pre_atendimento() {
        return status_pre_atendimento;
    }

    /**
     * @param status_pre_atendimento the status_pre_atendimento to set
     */
    public void setStatus_pre_atendimento(String status_pre_atendimento) {
        this.status_pre_atendimento = status_pre_atendimento;
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
    
}
