package ar.edu.unahur.obj2;

public class ProfugoComun implements IProfugo{
    private Integer inocencia;
    private Boolean esNervioso;
    private Integer nivelHabilidad;

    public ProfugoComun(Integer inocencia, Boolean esNervioso, Integer nivelHabilidad) {
        this.inocencia = this.validarInocencia(inocencia);
        this.esNervioso = esNervioso;
        this.nivelHabilidad = this.validarHabilidad(nivelHabilidad);
    }

    
    private Integer validarInocencia(Integer inocencia) {
        if (inocencia<0) {
            return 0;
        }
        return inocencia;
    }
    
    private Integer validarHabilidad(Integer nivelHabilidad) {
        if (nivelHabilidad > 100) {
            return 100;
        }
        if (nivelHabilidad < 1) {
            return 1;
        }
        return nivelHabilidad;
    }

    @Override
    public Integer getInocencia() {
        return inocencia;
    }

    @Override
    public Integer getHabilidad() {
        return nivelHabilidad;
    }

    @Override
    public Boolean esNervioso() {
        return esNervioso;
    }

    @Override
    public void volverseNervioso() {
        this.esNervioso = true;
    }

    @Override
    public void dejarDeEstarNervioso() {
        this.esNervioso = false;
    }

    @Override
    public void disminuirHabilidad(Integer cantidad) {
        nivelHabilidad -= cantidad;
    }

    @Override
    public void disminuirInocencia(Integer cantidad) {
        inocencia = Math.max(inocencia - cantidad, 0);
    }
}
