package ar.edu.unahur.obj2;

public class ArtesMarciales extends ProfugoDecorador{

    public ArtesMarciales(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public Integer getHabilidad() {
        return Math.min(super.getHabilidad() * 2, 100);
    }
}
