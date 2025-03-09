package NivelIntermediario.ENUMS;

public class Missoes {

    private RankDeMissoes nivel;

    public Missoes(RankDeMissoes nivel) {
        this.nivel = nivel;
    }

    public void exibirNivel(){

        switch (nivel){
            case GENIN:
                System.out.println("Você é um Genin. O caminho ninja está apenas começando.");
                break;
            case CHUNIN:
                System.out.println("Você é um Chunin. Continue a melhorar suas habilidades.");
                break;
            case JONIN:
                System.out.println("Você é um Jonin. Um líder experiente e respeitado.");
                break;
            case GENIO:
                System.out.println("Você é um Gênio. Suas habilidades são notáveis desde jovem.");
                break;
            case HOKAGE:
                System.out.println("Você é o Hokage. O ninja mais forte e líder da vila.");
                break;
        }

    }

    /* private String nome;
    private RankDeMissoes rank;

    // Metoo para mostrar mais Informações
    public void exibiDetalhes(){
        System.out.println("Missao: " + nome + ", Rank: " + rank + " (Descrição: " + rank.getDescricao() + ", Dificuldae: " + rank.getDificuldade() + ")");
    }

    public Missoes() {
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }*/
}
