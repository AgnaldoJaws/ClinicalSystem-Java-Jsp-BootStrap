/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.PreparedStatement;

/**
 *
 * @author agn
 */
public class deletaDados {
    
     String sql;
    public void deletaPaciente (paciente objPaciente){
        
        metodos objConexão = new metodos();
        
        sql = "delete  from paciente where cod_paciente = '"+objPaciente.getId()+"'";
        
        try {
            objConexão.abreConexaoSQLServer();
            PreparedStatement stm = objConexão.con.prepareStatement(sql);
            stm.execute();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    
    public void deletaConvenio (convenio objConvenio){
        
        metodos objConexão = new metodos();
        
        sql = "delete from convenio  where cod_convenio = '"+objConvenio.getId()+"'";
        
        try {
            objConexão.abreConexaoSQLServer();
            PreparedStatement stm = objConexão.con.prepareStatement(sql);
            stm.execute();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    
    public void deletaEspecialidade (especialidade objespecialidade){
        
        metodos objConexão = new metodos();
        
        sql = "delete from especialidade where cod_especialidade = '"+objespecialidade.getId_especialidade()+"'";
        
        try {
            objConexão.abreConexaoSQLServer();
            PreparedStatement stm = objConexão.con.prepareStatement(sql);
            stm.execute();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    
    public void deletaEspecialista (especialista objEspecialista){
        
        metodos objConexão = new metodos();
        
        sql = "delete from especialista where cod_especialista = '"+objEspecialista.getId()+"'";
        
        try {
            objConexão.abreConexaoSQLServer();
            PreparedStatement stm = objConexão.con.prepareStatement(sql);
            stm.execute();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    
    public void deletaPreAtendimento (pre_atendimento objpreAtendimento){
        
        metodos objConexão = new metodos();
        
        sql = "delete from pre_atendimento where cod_pre_atendimento = '"+objpreAtendimento.getId_pre_Atendimento()+"'";
        
        try {
            objConexão.abreConexaoSQLServer();
            PreparedStatement stm = objConexão.con.prepareStatement(sql);
            stm.execute();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    
    public void deletaTriagem (triagem objTriagem){
        
        metodos objConexão = new metodos();
        
        sql = "delete from triagem where cod_triagem  = '"+objTriagem.getId()+"'";
        
        try {
            objConexão.abreConexaoSQLServer();
            PreparedStatement stm = objConexão.con.prepareStatement(sql);
            stm.execute();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    
    
    public void deletaRegistroClinico (registroClinico objRegidtroClinico){
        
        metodos objConexão = new metodos();
        
        sql = "delete from registroClinico where cod_RegistroClinico  = '"+objRegidtroClinico.getCod_RestriClinico()+"'";
        
        try {
            objConexão.abreConexaoSQLServer();
            PreparedStatement stm = objConexão.con.prepareStatement(sql);
            stm.execute();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}
