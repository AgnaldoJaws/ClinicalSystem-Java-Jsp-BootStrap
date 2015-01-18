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
public class consultaDados {
    
     String sql;
 
    public void consultaPaciente(paciente objPaciente){
        
        metodos consultaPaciente = new metodos();
      
        sql = "select *  from paciente where cod_paciente = '"+objPaciente.getId()+"'";
          
       
        try {
            consultaPaciente.abreConexaoSQLServer();
            PreparedStatement stm = 
            consultaPaciente.con.prepareStatement(sql);
            consultaPaciente.rs = stm.executeQuery();
           
            while (consultaPaciente.rs.next()) {
           
                objPaciente.setCod_convenio(Integer.parseInt(consultaPaciente.rs.getString(2)));
                objPaciente.setNome(consultaPaciente.rs.getString(3));
                objPaciente.setCpf(consultaPaciente.rs.getString(4));
                objPaciente.setRg(consultaPaciente.rs.getString(5));
                objPaciente.setDataNascimento(consultaPaciente.rs.getString(6));
                objPaciente.setEndereco(consultaPaciente.rs.getString(7));
                objPaciente.setCep(consultaPaciente.rs.getString(8));
                objPaciente.setBairro(consultaPaciente.rs.getString(9));
                objPaciente.setCidade(consultaPaciente.rs.getString(10));
                objPaciente.setEstado(consultaPaciente.rs.getString(11));
                objPaciente.setLogradouro(consultaPaciente.rs.getString(12));
                objPaciente.setComplemento(consultaPaciente.rs.getString(13));
                objPaciente.setCelular(consultaPaciente.rs.getString(14));
                objPaciente.setEmail(consultaPaciente.rs.getString(15));
                objPaciente.setProfissao(consultaPaciente.rs.getString(16));
               objPaciente.setPaciente_desde(consultaPaciente.rs.getString(17));
                 objPaciente.setUltima_consulta(consultaPaciente.rs.getString(18));
               
       
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
              
        }
        
    }
    
    public void consultaConvenio (convenio objConvenio){
        
        metodos conexaoMetodo = new metodos();
      
        sql = "select *  from convenio where cod_convenio = '"+objConvenio.getId()+"'";
          
       
        try {
           conexaoMetodo.abreConexaoSQLServer();
            PreparedStatement stm = 
            conexaoMetodo.con.prepareStatement(sql);
            conexaoMetodo.rs = stm.executeQuery();
           
            while (conexaoMetodo.rs.next()) {
           
                
               objConvenio.setNome_empre(conexaoMetodo.rs.getString(2));
               objConvenio.setCnpj(conexaoMetodo.rs.getString(3));
               objConvenio.setEndereco(conexaoMetodo.rs.getString(4));
               objConvenio.setCidade(conexaoMetodo.rs.getString(5));
               
       
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
              
        }
        
        
    }
    
    public void consultaEspecialidade (especialidade objEspecialidade){
        
        metodos conexaoMetodo = new metodos();
      
        sql = "select *  from especialidade where cod_especialidade = '"+objEspecialidade.getId_especialidade()+"'";
          
       
        try {
           conexaoMetodo.abreConexaoSQLServer();
            PreparedStatement stm = 
            conexaoMetodo.con.prepareStatement(sql);
            conexaoMetodo.rs = stm.executeQuery();
           
            while (conexaoMetodo.rs.next()) {
           
                
               objEspecialidade.setNome_especialidade(conexaoMetodo.rs.getString(2));
              
               
       
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
              
        }
    }
    
    public void consultaEspecialista (especialista objEspecialista){
        
        metodos conexaoMetodo = new metodos();
      
        sql = "select *  from especialista where cod_especialista = '"+objEspecialista.getId()+"'";
          
       
        try {
           conexaoMetodo.abreConexaoSQLServer();
            PreparedStatement stm = 
            conexaoMetodo.con.prepareStatement(sql);
            conexaoMetodo.rs = stm.executeQuery();
           
            while (conexaoMetodo.rs.next()) {
           
                
             objEspecialista.setId(Integer.parseInt(conexaoMetodo.rs.getString(2)));
             objEspecialista.setCrm(conexaoMetodo.rs.getString(3));
             objEspecialista.setNome(conexaoMetodo.rs.getString(4));
             objEspecialista.setEndereco(conexaoMetodo.rs.getString(5));
             objEspecialista.setBairro(conexaoMetodo.rs.getString(6));
             objEspecialista.setCidade(conexaoMetodo.rs.getString(7));
             objEspecialista.setLogradouro(conexaoMetodo.rs.getString(8));
             objEspecialista.setEstado(conexaoMetodo.rs.getString(9));
             objEspecialista.setComplemento(conexaoMetodo.rs.getString(10));
             objEspecialista.setTelefone(conexaoMetodo.rs.getString(11));
             objEspecialista.setCpf(conexaoMetodo.rs.getString(12));
             objEspecialista.setRg(conexaoMetodo.rs.getString(13));
             objEspecialista.setConsenho_profissional(conexaoMetodo.rs.getString(14));
             objEspecialista.setOutras_informacoes(conexaoMetodo.rs.getString(15));
             
              
              
               
       
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
              
        }
    }
    
    
    public void consultaPreAtendimento (pre_atendimento objpreAtendimento){
        
        metodos conexaoMetodo = new metodos();
      
        sql = "select *  from pre_atendimento where cod_pre_atendimento = '"+objpreAtendimento.getId_pre_Atendimento()+"'";
          
       
        try {
           conexaoMetodo.abreConexaoSQLServer();
            PreparedStatement stm = 
            conexaoMetodo.con.prepareStatement(sql);
            conexaoMetodo.rs = stm.executeQuery();
           
            while (conexaoMetodo.rs.next()) {
           
                
             objpreAtendimento.setCod_especialista(conexaoMetodo.rs.getString(2));
             objpreAtendimento.setCod_paciente(conexaoMetodo.rs.getString(3));
             objpreAtendimento.setData_abertura(conexaoMetodo.rs.getString(4));
             objpreAtendimento.setHora_consulta(conexaoMetodo.rs.getString(5));
             objpreAtendimento.setValor_pagamento(conexaoMetodo.rs.getString(6));
             objpreAtendimento.setData_pagamento(conexaoMetodo.rs.getString(7));
             objpreAtendimento.setStatus_pre_atendimento(conexaoMetodo.rs.getString(8));
             objpreAtendimento.setOutras_informacoes(conexaoMetodo.rs.getString(9));
             
             
             
              
              
               
       
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
              
        }
    }
    
    public void consultaTriagem (triagem objTriagem){
        
        metodos conexaoMetodo = new metodos();
      
        sql = "select *  from triagem where cod_triagem = '"+objTriagem.getId()+"'";
          
       
        try {
            conexaoMetodo.abreConexaoSQLServer();
            PreparedStatement stm = 
            conexaoMetodo.con.prepareStatement(sql);
            conexaoMetodo.rs = stm.executeQuery();
           
            while (conexaoMetodo.rs.next()) {
           
                objTriagem.setCod_pre_atendimento(Integer.parseInt(conexaoMetodo.rs.getString(2)));
                objTriagem.setAtividade_muscular (conexaoMetodo.rs.getString(3));
                  objTriagem.setRepiracao(conexaoMetodo.rs.getString(4));
                objTriagem.setCirculacao(conexaoMetodo.rs.getString(5));
                  objTriagem.setConsciencia(conexaoMetodo.rs.getString(6));
                objTriagem.setTemperatura(conexaoMetodo.rs.getString(7));
                  objTriagem.setPressao_arterial(conexaoMetodo.rs.getString(8));
                objTriagem.setPeso(conexaoMetodo.rs.getString(9));
                objTriagem.setTamanho(conexaoMetodo.rs.getString(10));
                objTriagem.setIdade(conexaoMetodo.rs.getString(11));
                
               
       
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
              
        }
    }
    
     public void consultaRegistroClinico (registroClinico objRegistroClinico){
        
        metodos conexaoMetodo = new metodos();
      
        sql = "select *  from registroClinico where cod_RegistroClinico = '"+objRegistroClinico.getCod_RestriClinico()+"'";
          
       
        try {
           conexaoMetodo.abreConexaoSQLServer();
            PreparedStatement stm = 
            conexaoMetodo.con.prepareStatement(sql);
            conexaoMetodo.rs = stm.executeQuery();
           
            while (conexaoMetodo.rs.next()) {
           
                
               objRegistroClinico.setCod_pre_atendimento(Integer.parseInt(conexaoMetodo.rs.getString(2)));
               objRegistroClinico.setConsulta(conexaoMetodo.rs.getString(3));
               objRegistroClinico.setDiagnostico(conexaoMetodo.rs.getString(4));
               objRegistroClinico.setReceita(conexaoMetodo.rs.getString(5));
               objRegistroClinico.setGuia_exame(conexaoMetodo.rs.getString(6));
               
       
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
              
        }
        
        
    }
}
