package desafioveiculos;

public class veiculos {
    public String placa;
    public String marca;
    public String modelo;
    public String motorista;
    public int status; // 0 = Pátio, 1 = Linha (rua)

    @Override
    public String toString() {
        String textoStatus = (status == 0) ? "Pátio" : "Linha";
        String textoMotorista = (motorista == null || motorista.isBlank()) ? "-" : motorista;

        return String.format("%-8s | %-12s | %-12s | %-15s | %-8s", 
                placa, modelo, marca, textoMotorista, textoStatus);
    }
}