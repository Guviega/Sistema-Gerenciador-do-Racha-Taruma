/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package sistemagerenciadorrachataruma.model;

/**
 *
 * @author DELL
 */
public enum TipoVeiculo {

    /**
     * Um veiculo pode ter um tipo, especificado neste enum.
     * ASPIRADO: Veiculos sem supercompressor em seu motor.
     * TURBO: Veiculos com turbocompressor em seu motor.
     * MOTO: Motocicletas em geral.
     * DIESEL: Veiculos de linha Diesel.
     */
    ASPIRADO,
    TURBO,
    MOTO,
    DIESEL;

    @Override
    public String toString() {
        return "TipoVeiculo=" + name() + ' ';
    }
}
