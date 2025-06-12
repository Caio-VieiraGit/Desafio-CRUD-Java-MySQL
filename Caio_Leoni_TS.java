import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Caio_Leoni_TS {
    private static final String URL = "jdbc:mysql://mysql-1a0cba3e-ba-8235.c.aivencloud.com:22924/cdz_eliseos_dupla4";
    private static final String USUARIO = "avnadmin";
    private static final String SENHA = "AVNS_zBdwmfndlvo_s6fhKzi";

    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }

    public void inserirOrdem(String nome, String lider){
        String sql = "INSERT INTO ordens (nome, lider) VALUES (?, ?)";

        try(Connection conn = Caio_Leoni_TS.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, nome);
            stmt.setString(2, lider);
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void inserirTemplo(String nome, String localizacao, int ordem_id){
        String sql = "INSERT INTO templos (nome, localizacao, ordem_id) VALUES (?, ?, ?)";

        try(Connection conn = Caio_Leoni_TS.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, nome);
            stmt.setString(2, localizacao);
            stmt.setInt(3, ordem_id);
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void inserirGuardiao(String nome, String poder, int templo_id){
        String sql = "INSERT INTO guardioes (nome, poder, templo_id) VALUES (?, ?, ?)";

        try(Connection conn = Caio_Leoni_TS.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, nome);
            stmt.setString(2, poder);
            stmt.setInt(3, templo_id);
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void inserirArtefato(String nome, String descricao, int templo_id){
        String sql = "INSERT INTO artefatos (nome, descricao, templo_id) VALUES (?, ?, ?)";

        try(Connection conn = Caio_Leoni_TS.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, nome);
            stmt.setString(2, descricao);
            stmt.setInt(3, templo_id);
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void inserirHistorico(int templo_id, String evento, int data_evento){
        String sql = "INSERT INTO historicos_templo (templo_id, evento, data_evento) VALUES (?, ?, ?)";

        try(Connection conn = Caio_Leoni_TS.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, templo_id);
            stmt.setString(2, evento);
            stmt.setInt(3, data_evento);
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void listarOrdens(){
        String sql = "SELECT * FROM ordens";

        try(Connection conn = Caio_Leoni_TS.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()){
                System.out.println("Nome: "+ rs.getString("nome"));
                System.out.println("Líder: "+ rs.getString("lider"));
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void listarTemplos(){
        String sql = "SELECT * FROM templos";

        try(Connection conn = Caio_Leoni_TS.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()){
                System.out.println("Nome: "+ rs.getString("nome"));
                System.out.println("Localização: "+ rs.getString("localizacao"));
                System.out.println("Ordem ID: "+ rs.getInt("ordem_id"));
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void listarGuardioes(){
        String sql = "SELECT * FROM guardioes";

        try(Connection conn = Caio_Leoni_TS.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()){
                System.out.println("Nome: "+ rs.getString("nome"));
                System.out.println("Poder: "+ rs.getString("poder"));
                System.out.println("Templo ID: "+ rs.getInt("templo_id"));
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void listarArtefatos(){
        String sql = "SELECT * FROM artefatos";

        try(Connection conn = Caio_Leoni_TS.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()){
                System.out.println("Nome: "+ rs.getString("nome"));
                System.out.println("Descrição: "+ rs.getString("descricao"));
                System.out.println("Templo ID: "+ rs.getInt("templo_id"));
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void listarHistoricos(){
        String sql = "SELECT * FROM historicos_templo";

        try(Connection conn = Caio_Leoni_TS.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()){
                System.out.println("Templo ID: "+ rs.getInt("templo_id"));
                System.out.println("Evento: "+ rs.getString("evento"));
                System.out.println("Data do Evento: "+ rs.getInt("data_vento"));
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizarOrdem(int id, String novoNome, String novoLider){
        String sql = "UPDATE ordens SET nome = ?, lider = ? WHERE id = ?";

        try(Connection conn = Caio_Leoni_TS.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, novoNome);
            stmt.setString(2, novoLider);
            stmt.setInt(3, id);
            stmt.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizarTemplo(int id, String novoNome, String novaLocalizacao){
        String sql = "UPDATE templos SET nome = ?, localizacao = ? WHERE id = ?";

        try(Connection conn = Caio_Leoni_TS.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, novoNome);
            stmt.setString(2, novaLocalizacao);
            stmt.setInt(3, id);
            stmt.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizarGuardiao(int id, String novoNome, String novoPoder){
        String sql = "UPDATE guardioes SET nome = ?, poder = ? WHERE id = ?";

        try(Connection conn = Caio_Leoni_TS.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, novoNome);
            stmt.setString(2, novoPoder);
            stmt.setInt(3, id);
            stmt.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizarArtefato(int id, String novoNome, String novaDescricao){
        String sql = "UPDATE artefatos SET nome = ?, descricao = ? WHERE id = ?";

        try(Connection conn = Caio_Leoni_TS.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, novoNome);
            stmt.setString(2, novaDescricao);
            stmt.setInt(3, id);
            stmt.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizarHistorico(int id, String novoEvento, int novaData_evento){
        String sql = "UPDATE historicos_templo SET evento = ?, data_evento = ? WHERE id = ?";

        try(Connection conn = Caio_Leoni_TS.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, novoEvento);
            stmt.setInt(2, novaData_evento);
            stmt.setInt(3, id);
            stmt.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void deletarOrdem(int id){
        String sql = "DELETE FROM ordens WHERE id = ?";

        try(Connection conn = Caio_Leoni_TS.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void deletarTemplo(int id){
        String sql = "DELETE FROM templos WHERE id = ?";

        try(Connection conn = Caio_Leoni_TS.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void deletarGuardiao(int id){
        String sql = "DELETE FROM guardioes WHERE id = ?";

        try(Connection conn = Caio_Leoni_TS.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void deletarArtefato(int id){
        String sql = "DELETE FROM artefatos WHERE id = ?";

        try(Connection conn = Caio_Leoni_TS.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void deletarHistorico(int id){
        String sql = "DELETE FROM historicos_templo WHERE id = ?";

        try(Connection conn = Caio_Leoni_TS.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}