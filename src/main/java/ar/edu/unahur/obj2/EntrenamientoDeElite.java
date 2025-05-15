package ar.edu.unahur.obj2;

public class EntrenamientoDeElite extends ProfugoDecorador {
    public EntrenamientoDeElite(IProfugo profugo) {
        super(profugo);
    }
    
    @Override
    public Boolean esNervioso() {
        return false; 
    }

    @Override
    public void volverseNervioso() {}
}
