package NivelIntermediario.Records;

public record NinjaRecord(String nome, String email, int telefone) {

    // Todos os atributos sao final por padrao
    // Records nao tem SETTER só tem GETTER


    public String emailCaixaAlta(){
        return email.toUpperCase();
    }
}
