/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.control;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import sistemagerenciadorrachataruma.model.Corrida;
import sistemagerenciadorrachataruma.model.Veiculo;
import sistemagerenciadorrachataruma.model.dao.CorridaDAO;

/**
 *
 * @author DELL
 */
public class CorridaControlller {

    CorridaDAO dao = CorridaDAO.getInstance();

    public void cadastrarCorrida(int idVeiculo1, int idVeiculo2, double tempoV1, double tempoV2, double velV1, double velV2) {
        int idVencedor;
        idVencedor = tempoV1 > tempoV2 ? idVeiculo2
                : tempoV2 > tempoV1 ? idVeiculo1
                        : velV1 > velV2 ? idVeiculo1 : idVeiculo2;

        Corrida c = new Corrida(
                dao.atribuirId(),
                LocalDateTime.now(),
                new VeiculoController().buscaVeiculoPorID(idVeiculo1),
                new VeiculoController().buscaVeiculoPorID(idVeiculo2),
                new VeiculoController().buscaVeiculoPorID(idVencedor),
                tempoV1, tempoV2, velV1, velV2);
        dao.cadastrar(c);
        System.out.println(geraRelatorio(c));
    }

    public Corrida buscaCorridaPorId(int id) {
        Corrida c = dao.buscaPorId(id);
        if (c == null) {
            throw new IndexOutOfBoundsException("Corrida == null, possivel ID inexistente.");
        }
        return c;
    }

    public String geraRelatorio(Corrida c) {
        Veiculo v1 = c.getVeiculo1();
        Veiculo v2 = c.getVeiculo2();
        Veiculo vencedor = c.getVencedor();

        return """
               ------- RACHA TARUMA -------
               Data/Hora: """ + c.getDataHora().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n"
                + "\n"
                + v1.getModelo() + " (" + v1.getId() + ")  VS  " + v2.getModelo() + " (" + v2.getId() + ")\n"
                + "Vencedor: " + vencedor.getModelo() + "\n"
                + "----------------------------\n\n"
                + v1.getModelo() + "\n"
                + "Piloto: " + v1.getPiloto().getNome() + "\n"
                + "Potencia: " + v1.getPotencia() + "cv\n"
                + "Tempo: " + c.getTempoVeiculo1() + "s  Velocidade: " + c.getVelocidadeVeiculo1() + " km/h\n\n"
                + v2.getModelo() + "\n"
                + "Piloto: " + v2.getPiloto().getNome() + "\n"
                + "Potencia: " + v2.getPotencia() + "cv\n"
                + "Tempo: " + c.getTempoVeiculo2() + "s  Velocidade: " + c.getVelocidadeVeiculo2() + " km/h\n\n";
    }

    public void salvarRelatorio(Corrida c) {
        String nomeArquivo = c.getDataHora().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss"));
        String extensaoArquivo = ".log";

        Path caminho = Path.of(nomeArquivo + extensaoArquivo);

        try {
            Files.writeString(caminho, geraRelatorio(c));
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    public List<Corrida> listarCorridas() {
        return dao.listar();
    }
}
