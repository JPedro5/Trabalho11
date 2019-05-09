package DAO;

import Modelo.Equipaments;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class EquipametsDAO {
        Connection con = null;
    public EquipametsDAO(){
        con = Conexao.abrirConexao();
    }
    public void salvar(Equipaments equipaments){
        try {
            String sql = "INSERT INTO Equipamentos(numero, nome) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, equipaments.getNumero());
            ps.setString(2, equipaments.getNome());
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
            }
           
        } catch (Exception e) {
        }
    }
}