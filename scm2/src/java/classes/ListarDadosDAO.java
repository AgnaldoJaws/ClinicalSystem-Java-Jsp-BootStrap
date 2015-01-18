package classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agn
 */
public class ListarDadosDAO {

    String sql;

    public List<convenio> listaConvenio = new ArrayList<>();

    public void listar() {

        ResultSet rs = null;

        metodos objconecta = new metodos();
        try {

            sql = "select * from convenio";
            objconecta.abreConexaoSQLServer();
            PreparedStatement stm = objconecta.con.prepareStatement(sql);
            objconecta.rs = stm.executeQuery();

            while (objconecta.rs.next()) {

                convenio objConvenio = new convenio();

                objConvenio.setId(Integer.parseInt(objconecta.rs.getString("cod_convenio")));
                objConvenio.setNome_empre(objconecta.rs.getString("nome_empresa"));
                objConvenio.setCnpj(objconecta.rs.getString("cnpj"));
                objConvenio.setEndereco(objconecta.rs.getString("endereco"));
                objConvenio.setCidade(objconecta.rs.getString("cidade"));

                listaConvenio.add(objConvenio);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public List<especialidade> listaEspecialidade = new ArrayList<>();

    public void listarEspecialidade() {

        ResultSet rs = null;

        metodos objconecta = new metodos();
        try {

            sql = "select * from especialidade";
            objconecta.abreConexaoSQLServer();
            PreparedStatement stm = objconecta.con.prepareStatement(sql);
            objconecta.rs = stm.executeQuery();

            while (objconecta.rs.next()) {

                especialidade ee = new especialidade();

                ee.setId(Integer.parseInt(objconecta.rs.getString("cod_especialidade")));
                ee.setNome_especialidade(objconecta.rs.getString("nome_especialidade"));

                listaEspecialidade.add(ee);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public List<especialista> listaEspecialista = new ArrayList<>();

    public void listarEspecialista() {

        ResultSet rs = null;

        metodos objconecta = new metodos();
        try {

            sql = "select * from especialista";
            objconecta.abreConexaoSQLServer();
            PreparedStatement stm = objconecta.con.prepareStatement(sql);
            objconecta.rs = stm.executeQuery();

            while (objconecta.rs.next()) {

                especialista objEspecialista = new especialista();

                objEspecialista.setId_especialista(Integer.parseInt(objconecta.rs.getString("cod_especialista")));
                objEspecialista.setNome(objconecta.rs.getString("nome_especialista"));

                listaEspecialista.add(objEspecialista);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public List<paciente> listaPaciente = new ArrayList<>();

    public void listarPaciente() {

        ResultSet rs = null;

        metodos objconecta = new metodos();
        try {

            sql = "select * from paciente";
            objconecta.abreConexaoSQLServer();
            PreparedStatement stm = objconecta.con.prepareStatement(sql);
            objconecta.rs = stm.executeQuery();

            while (objconecta.rs.next()) {

                paciente objPaciente = new paciente();

                objPaciente.setId(Integer.parseInt(objconecta.rs.getString("cod_paciente")));
                objPaciente.setNome(objconecta.rs.getString("nome_paciente"));
                objPaciente.setCpf(objconecta.rs.getString("cpf"));
                objPaciente.setRg(objconecta.rs.getString("rg"));
                objPaciente.setDataNascimento(objconecta.rs.getString("dataNascimento"));
                objPaciente.setEndereco(objconecta.rs.getString("endereco"));
                objPaciente.setCep(objconecta.rs.getString("cep"));
                objPaciente.setBairro(objconecta.rs.getString("bairro"));
                objPaciente.setCidade(objconecta.rs.getString("cidade"));
                objPaciente.setEstado(objconecta.rs.getString("estado"));
                objPaciente.setComplemento(objconecta.rs.getString("complemento"));
                objPaciente.setCelular(objconecta.rs.getString("celular"));
                objPaciente.setEmail(objconecta.rs.getString("email"));
                objPaciente.setProfissao(objconecta.rs.getString("profissao"));
                objPaciente.setUltima_consulta(objconecta.rs.getString("ultima_consulta"));

                listaPaciente.add(objPaciente);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public List<pre_atendimento> listaPA = new ArrayList<>();

    public void listarPA() {

        ResultSet rs = null;

        metodos objconecta = new metodos();
        try {

            sql = "select pre_atendimento.cod_pre_atendimento, nome_paciente, data_consulta, hora_consulta,nome_especialista from pre_atendimento\n"
                    + "inner join paciente on pre_atendimento.cod_paciente = paciente.cod_paciente\n"
                    + "inner join especialista on pre_atendimento.cod_especialista = especialista.cod_especialista";
            objconecta.abreConexaoSQLServer();
            PreparedStatement stm = objconecta.con.prepareStatement(sql);
            objconecta.rs = stm.executeQuery();

            while (objconecta.rs.next()) {

                pre_atendimento objPre_atendimento = new pre_atendimento();

                objPre_atendimento.setId_pre_Atendimento(objconecta.rs.getInt(1));
                objPre_atendimento.setCod_paciente((String.valueOf(objconecta.rs.getString(2))));
                objPre_atendimento.setCod_especialista((String.valueOf(objconecta.rs.getString(5))));
                objPre_atendimento.setData_abertura(objconecta.rs.getString(3));
                objPre_atendimento.setData_consulta(objconecta.rs.getString(4));

                listaPA.add(objPre_atendimento);

            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

}
