/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author agn
 */
public class alteraDados {
    
    String sql;
    
    public void alteraPaciente(paciente objPaciente){
        
        metodos objAlteraAutor = new metodos();
                                 
        sql = "update paciente set nome = '"+objPaciente.getNome()+"', cpf =  '"+objPaciente.getCpf()+"'  where cod_paciente = '"+objPaciente.getId()+"'";
          
        try {
            objAlteraAutor.abreConexaoSQLServer();
            PreparedStatement stm = 
            objAlteraAutor.con.prepareStatement(sql);
            stm.executeUpdate();
            }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
              
        }
          
    }
    
    public void alteraConvenio(convenio objConvenio){
        
        metodos conexaoMetodo = new metodos();
                                 
        sql = "update convenio set nome_empresa = '"+objConvenio.getNome_empre()+"', cnpj = '"+objConvenio.getCnpj()+"',endereco = '"+objConvenio.getEndereco()+"', cidade = '"+objConvenio.getCidade()+"' where cod_convenio = '"+objConvenio.getId()+"'";
          
        try {
            conexaoMetodo.abreConexaoSQLServer();
            PreparedStatement stm = 
            conexaoMetodo.con.prepareStatement(sql);
            stm.executeUpdate();
            }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
              
        }
          
    }
    
     public void alteraEspecialidade(especialidade objEspecialiade){
        
        metodos conexaoMetodo = new metodos();
                                 
        sql = "update especialidade set nome_especialidade = '"+objEspecialiade.getNome_especialidade()+"' where cod_especialidade = '"+objEspecialiade.getId_especialidade()+"'";
          
        try {
            conexaoMetodo.abreConexaoSQLServer();
            PreparedStatement stm = 
            conexaoMetodo.con.prepareStatement(sql);
            stm.executeUpdate();
            }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
              
        }
          
    }
     
     public void alteraEspecialista(especialista objEspecialista){
        
        metodos objAlteraAutor = new metodos();
                                 
        sql = "update especialista set cod_especialidade = '"+objEspecialista.getId()+"', crm = '"+objEspecialista.getCrm()+"', nome = '"+objEspecialista.getNome()+"', endereco = '"+objEspecialista.getEndereco() +"', bairro = '"+objEspecialista.getBairro() +"', cidade = '"+objEspecialista.getCidade() +"', logradouro = '"+objEspecialista.getLogradouro() +"', estado = '"+objEspecialista.getEstado() +"', complemento = '"+objEspecialista.getComplemento() +"',telefone = '"+objEspecialista.getTelefone() +"', cpf  = '"+objEspecialista.getCpf() +"', rg = '"+objEspecialista.getRg() +"', consenho_profissional = '"+objEspecialista.getConsenho_profissional() +"', outras_informacoes = '"+objEspecialista.getOutras_informacoes() +"'  where cod_especialista = '"+objEspecialista.getId()+"'";
          
        try {
            objAlteraAutor.abreConexaoSQLServer();
            PreparedStatement stm = 
            objAlteraAutor.con.prepareStatement(sql);
            stm.executeUpdate();
            }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
              
        }
          
    }
    
    public void alteraPreAtendimento(pre_atendimento objPreAtendimento){
        
        metodos objAlteraAutor = new metodos();
                                 
        sql = "update pre_atendimento set cod_especialista = '"+objPreAtendimento.getCod_especialista()+"', cod_paciente = '"+objPreAtendimento.getCod_paciente()+"', data_abertura = '"+objPreAtendimento.getData_abertura()+"', data_consulta = '"+objPreAtendimento.getData_consulta()+"', hora_consulta = '"+objPreAtendimento.getHora_consulta()+"', valor_pagamento = '"+objPreAtendimento.getValor_pagamento()+"' ,data_pagamento ='"+objPreAtendimento.getData_pagamento()+"', status_pre_atendimento = '"+objPreAtendimento.getStatus_pre_atendimento()+"' ,outras_informacoes  = '"+objPreAtendimento.getOutras_informacoes()+"'  where cod_pre_atendimento = '"+objPreAtendimento.getId_pre_Atendimento()+"'";
          
        try {
            objAlteraAutor.abreConexaoSQLServer();
            PreparedStatement stm = 
            objAlteraAutor.con.prepareStatement(sql);
            stm.executeUpdate();
            }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
              
        }
          
    }
    
     public void alteraTriagem(triagem objTriagem){
        
        metodos conexaoMetodo = new metodos();
                                 
        sql = "update triagem set cod_pre_atendimento  = '"+objTriagem.getCod_pre_atendimento()+"',atividade_muscular = '"+objTriagem.getAtividade_muscular()+"',repiracao = '"+objTriagem.getRepiracao()+"',circulacao ='"+objTriagem.getCirculacao()+"',consciencia = '"+objTriagem.getConsciencia()+"',temperatura = '"+objTriagem.getTemperatura()+"',pressao_arterial='"+objTriagem.getPressao_arterial()+"',peso ='"+objTriagem.getPeso()+"',tamanho='"+objTriagem.getTamanho()+"', idade= '"+objTriagem.getIdade()+"'  where cod_triagem = '"+objTriagem.getId()+"'";
          
        try {
            conexaoMetodo.abreConexaoSQLServer();
            PreparedStatement stm = 
            conexaoMetodo.con.prepareStatement(sql);
            stm.executeUpdate();
            }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
              
        }
          
    }
     
      public void alteraRegistroClinico (registroClinico objRegistroClinico){
        
        metodos conexaoMetodo = new metodos();
                                 
        sql = "update registroClinico set cod_pre_atendimento = '"+objRegistroClinico.getCod_pre_atendimento()+"', consulta = '"+objRegistroClinico.getConsulta()+"', diagnostico = '"+objRegistroClinico.getDiagnostico()+"', receita = '"+objRegistroClinico.getReceita()+"', guia_exame = '"+objRegistroClinico.getGuia_exame()+"' where cod_RegistroClinico  = '"+objRegistroClinico.getCod_RestriClinico()+"'";
          
        try {
            conexaoMetodo.abreConexaoSQLServer();
            PreparedStatement stm = 
            conexaoMetodo.con.prepareStatement(sql);
            stm.executeUpdate();
            }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
              
        }
          
    }
    
}
