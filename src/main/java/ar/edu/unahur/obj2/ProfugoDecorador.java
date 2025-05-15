package ar.edu.unahur.obj2;

public abstract class ProfugoDecorador implements IProfugo {
    private IProfugo decorado;

    public ProfugoDecorador(IProfugo profugo) {
        this.decorado = profugo;
    }

    protected IProfugo getdecorado() {
        return decorado;
    }

    @Override
    public Integer getInocencia() {
        return decorado.getInocencia();
    }

    @Override
    public Integer getHabilidad() {
        return decorado.getHabilidad();
    }

    @Override
    public Boolean esNervioso() {
        return decorado.esNervioso();
    }

    @Override
    public void volverseNervioso() {
        decorado.volverseNervioso();
    }

    @Override
    public void dejarDeEstarNervioso() {
        decorado.dejarDeEstarNervioso();
    }

    @Override
    public void disminuirHabilidad(Integer cantidad) {
        decorado.disminuirHabilidad(cantidad);
    }

    @Override
    public void disminuirInocencia(Integer cantidad) {
        decorado.disminuirInocencia(cantidad);
    }
}

