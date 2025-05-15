package ar.edu.unahur.obj2;

import java.util.List;

public class Zona {
    private String nombre;
    private List<IProfugo> profugos;
    private List<IProfugo> profugosIntimidados;

    public Zona(String nombre, List<IProfugo> profugos) {
        this.nombre = nombre;
        this.profugos = profugos;
    }

    public String nombre() {
        return nombre;
    }

    public List<IProfugo> profugos() {
        return profugos;
    }

    public void removerProfugo(IProfugo profugo) {
        profugos.remove(profugo);
    }

    public void agregarProfugoIntimidado(IProfugo profugo) {
        profugosIntimidados.add(profugo);
    }

    public void vaciarProfugosIntimidados(){
        profugosIntimidados.clear();
    }

        public List<IProfugo> profugosIntimidados() {
        return profugosIntimidados;
    }
}
