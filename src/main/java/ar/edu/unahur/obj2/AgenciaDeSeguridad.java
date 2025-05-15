package ar.edu.unahur.obj2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AgenciaDeSeguridad {
    private List<Cazador> cazadores = new ArrayList<>();
    private List<IProfugo> profugosCapturados = new ArrayList<>();

    public List<IProfugo> profugosCapturados(){
        return profugosCapturados;
    }
    public void agregarCazador(Cazador cazador){
        cazadores.add(cazador);
        cazador.asignarAgencia(this);
    }

    public void agregarProfugoCapturado(IProfugo profugoCapturado){
        profugosCapturados.add(profugoCapturado);
    }

    public Cazador cazadorConMasCapturas() {
    return cazadores.stream()
        .max(Comparator.comparingInt(Cazador::cantidadDeCapturas))
        .orElseThrow(() -> new RuntimeException("No hay cazadores registrados"));
}

    public IProfugo profugoMasHabilCapturado() {
    return profugosCapturados.stream()
        .max(Comparator.comparingInt(IProfugo::getHabilidad))
        .orElseThrow(() -> new RuntimeException("No hay prófugos capturados"));
}
}
