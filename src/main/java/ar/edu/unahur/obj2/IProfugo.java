package ar.edu.unahur.obj2;

public interface IProfugo {
    Integer getInocencia();

    Integer getHabilidad();

    Boolean esNervioso();

    void volverseNervioso();

    void dejarDeEstarNervioso();

    void disminuirHabilidad(Integer cantidad);

    void disminuirInocencia(Integer cantidad);
}
