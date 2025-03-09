package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "Naturo123@gmail.com", 40028922);
        System.out.println(cadastro);

        NinjaRecord cadastroRecord = new NinjaRecord("Sasuke", "Sasuke123@gmail.com", 9988335);
        System.out.println(cadastroRecord.emailCaixaAlta());

    }
}
