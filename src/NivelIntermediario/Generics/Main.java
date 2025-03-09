package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {

        Ferramentas alicate = new Ferramentas("Alicate");
        Ferramentas chaveDeFenda = new Ferramentas("Chave de Fenda");
        Ferramentas martelo = new Ferramentas("Martelo");

        // Usando bolsa para armazenar as ferramentas
        BolsaDeFerramentas<Object> bolsaDeFerramentas = new BolsaDeFerramentas<>();
        bolsaDeFerramentas.addFerramenta(new Ferramentas("p"));

        bolsaDeFerramentas.addFerramenta(chaveDeFenda);
        bolsaDeFerramentas.addFerramenta(martelo);

        bolsaDeFerramentas.mostrarFerramentas();

    /*    EquipamentoNinja kunai = new EquipamentoNinja("Kunai de ferro");
        EquipamentoNinja shuriken = new EquipamentoNinja("Shuriken");
        EquipamentoNinja pergaminho = new EquipamentoNinja("Pergaminho");

        BolsaGenerica<EquipamentoNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adcionarEquipamentos(kunai);
        bolsaGenerica.adcionarEquipamentos(pergaminho);
        bolsaGenerica.adcionarEquipamentos(shuriken);

        System.out.println(bolsaGenerica);
*/

    }
}
