package ar.edu.unahur.obj2;

public class CazadorSigiloso extends Cazador{

    @Override
    public Boolean condicionEspecifica(IProfugo profugo) {
        return profugo.getHabilidad()<50;
    }

    @Override
    public void intimidarProfugo(IProfugo profugo) {
        profugo.disminuirInocencia(2);
        profugo.disminuirHabilidad(5);
    }

}
