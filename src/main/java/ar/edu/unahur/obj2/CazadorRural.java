package ar.edu.unahur.obj2;

public class CazadorRural extends Cazador{

    @Override
    public Boolean condicionEspecifica(IProfugo profugo) {
        return profugo.esNervioso();
    }

    @Override
    public void intimidarProfugo(IProfugo profugo) {
        profugo.disminuirInocencia(2);
        profugo.volverseNervioso();
    }

}
