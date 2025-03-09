package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaDeFerramentas<T>{

    private List<T> ferramenta;

    public BolsaDeFerramentas(){
        this.ferramenta = new ArrayList<>();
    }

    public void addFerramenta(T adFerramenta){
        ferramenta.add(adFerramenta);
    }

    public void mostrarFerramentas(){
        for(T adFerramenta : ferramenta){
            System.out.println("Ferramentas: " +ferramenta);
        }
    }

    public List<T> getEquipamentos() {
        return ferramenta;
    }

    public void setEquipamentos(List<T> ferramenta) {
        this.ferramenta = ferramenta;
    }

    @Override
    public String toString() {
        return "BolsaDeFerramentas{" + ferramenta + '}';
    }
}
