package classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agn
 */
public class insereDados {
    
    String sql;
    
     public void inserePaciente(paciente objPaciente){

     metodos conexaoMetodo = new metodos();
       
        sql = "insert into paciente (    cod_convenio,nome_paciente, cpf ,rg, dataNascimento, endereco, cep, bairro ,cidade, estado ,logradouro, complemento, celular, email, profissao, paciente_desde, ultima_consulta )"
                + " values ( '"+objPaciente.getCod_convenio()+"',"
                + "'"+objPaciente.getNome()+"',"
                + "'"+objPaciente.getCpf()+"',"
                + "'"+objPaciente.getRg()+"',"
                + "'"+objPaciente.getDataNascimento()+"',"
                + "'"+objPaciente.getEndereco()+"',"
                + "'"+objPaciente.getCep()+"',"
                + "'"+objPaciente.getBairro()+"',"
                + "'"+objPaciente.getCidade()+"',"
                + "'"+objPaciente.getEstado()+"',"
                + "'"+objPaciente.getLogradouro()+"',"
                + "'"+objPaciente.getComplemento()+"',"
                + "'"+objPaciente.getCelular()+"',"
                + "'"+objPaciente.getEmail()+"',"
                + "'"+objPaciente.getProfissao()+"',"
                + "'"+objPaciente.getPaciente_desde()+"',"
                + "'"+objPaciente.getUltima_consulta()+"')";
                
                
        
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
     
     public void insereConvenio (convenio objConvenio){
          metodos conexaoMetodo= new metodos();
       
        sql = "insert into convenio ( nome_empresa,cnpj,endereco,cidade) values ('"+objConvenio.getNome_empre()+"','"+objConvenio.getCnpj()+"','"+objConvenio.getEndereco()+"','"+objConvenio.getCidade()+"')";  
        
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
     
     public  void insereEspecialidade (especialidade objEspecialidade){
         
         metodos conexaoMetodo= new metodos();
       
        sql = "insert into especialidade ( nome_especialidade) values ('"+objEspecialidade.getNome_especialidade()+"')";  
        
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
     
     
     public void insereEspecialista (especialista objEspecialista){
          metodos conexaoMetodo= new metodos();
       
        sql = "insert into especialista (cod_especialidade,crm ,nome_especialista ,endereco,bairro ,cidade,logradouro ,estado,complemento ,telefone ,cpf ,rg ,consenho_profissional,outras_informacoes)  values ('"+objEspecialista.getCod_especialidade() +"','"+objEspecialista.getCrm()+"',"
                + "'"+objEspecialista.getNome()+"',"
                + "'"+objEspecialista.getEndereco()+"',"
                + "'"+objEspecialista.getBairro()+"',"
                + "'"+objEspecialista.getCidade()+"',"
                + "'"+objEspecialista.getLogradouro()+"',"
                + "'"+objEspecialista.getEstado()+"',"
                + "'"+objEspecialista.getComplemento()+"',"
                + "'"+objEspecialista.getTelefone()+"',"
                + "'"+objEspecialista.getCpf()+"',"
                + "'"+objEspecialista.getRg()+"',"
                + "'"+objEspecialista.getConsenho_profissional()+"',"
                
                + "'"+objEspecialista.getOutras_informacoes()+"')";  
        
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

      public void inserePre_atendimento(pre_atendimento objPreAtendimento){

     metodos conexaoMetodo = new metodos();
       
              sql = "insert into pre_atendimento (cod_especialista,cod_paciente,data_abertura,data_consulta,hora_consulta,valor_pagamento,data_pagamento,status_pre_atendimento,outras_informacoes ) values ('"+objPreAtendimento.getCod_especialista()+"','"+objPreAtendimento.getCod_paciente()+"','"+objPreAtendimento.getData_abertura()+"','"+objPreAtendimento.getData_consulta()+"','"+objPreAtendimento.getHora_consulta()+"','"+objPreAtendimento.getValor_pagamento()+"','"+objPreAtendimento.getData_pagamento()+"','"+objPreAtendimento.getStatus_pre_atendimento()+"','"+objPreAtendimento.getOutras_informacoes()+"')";
                
                
                
        
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
      
      public void insereTriagem(triagem objTriagem){

     metodos conexaoMetodo = new metodos();
       
        sql = "insert into triagem (cod_pre_atendimento,atividade_muscular,repiracao,circulacao,consciencia,temperatura,pressao_arterial,peso,tamanho,idade) values ('"+objTriagem.getCod_pre_atendimento()+"','"+objTriagem.getAtividade_muscular()+"','"+objTriagem.getRepiracao()+"','"+objTriagem.getCirculacao()+"','"+objTriagem.getConsciencia()+"','"+objTriagem.getTemperatura()+"','"+objTriagem.getPressao_arterial()+"','"+objTriagem.getPeso()+"','"+objTriagem.getTamanho()+"','"+objTriagem.getIdade()+"')";
                
                
        
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
      
      public void insereRegistroClinico(registroClinico objRegistroClinico){

     metodos conexaoMetodo = new metodos();
       
        sql = "insert into registroClinico (cod_pre_atendimento,consulta ,diagnostico,receita,guia_exame ) values ('"+objRegistroClinico.getCod_pre_atendimento()+"','"+objRegistroClinico.getConsulta()+"','"+objRegistroClinico.getDiagnostico()+"','"+objRegistroClinico.getReceita()+"','"+objRegistroClinico.getGuia_exame()+"')";
                
                
        
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