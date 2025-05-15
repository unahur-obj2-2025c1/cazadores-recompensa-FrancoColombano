package ar.edu.unahur.obj2;

public abstract class Cazador {
    private Integer experiencia;
    private Integer profugosCapturados;
    private AgenciaDeSeguridad agencia;

    public Boolean condicionGeneral(IProfugo profugo){
        return experiencia > profugo.getInocencia();
    }

    public abstract Boolean condicionEspecifica(IProfugo profugo);

    public Boolean puedeCapturarProfugo(IProfugo profugo){
        return this.condicionGeneral(profugo) && this.condicionEspecifica(profugo);
    }

    public void capturaEnZona(Zona zona, IProfugo profugo){
        zona.vaciarProfugosIntimidados();
        Integer cantInicial = zona.profugos().size();
        zona.profugos().stream().forEach(p -> this.capturarProfugo(p,zona));
        Integer cantFinal = zona.profugos().size();
        experiencia += 2*(cantInicial-cantFinal) + zona.profugosIntimidados().stream().mapToInt(p -> p.getHabilidad()).min().orElse(0);
    }

    public void capturarProfugo(IProfugo profugo, Zona zona) {
        if (puedeCapturarProfugo(profugo)) {
            zona.removerProfugo(profugo);
            profugosCapturados += 1;
            agencia.agregarProfugoCapturado(profugo);
        }
        else { 
            intimidarProfugo(profugo);
            zona.agregarProfugoIntimidado(profugo);
        }
    }
    
    public Integer cantidadDeCapturas(){
        return profugosCapturados;
    }

    public abstract void intimidarProfugo(IProfugo profugo);

    public void asignarAgencia(AgenciaDeSeguridad agenciaDeSeguridad) {
        agencia = agenciaDeSeguridad;
    }
}
