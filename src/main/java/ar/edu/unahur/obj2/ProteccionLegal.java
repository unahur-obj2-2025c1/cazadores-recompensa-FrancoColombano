package ar.edu.unahur.obj2;

public class ProteccionLegal extends ProfugoDecorador {
    public ProteccionLegal(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public void disminuirInocencia(Integer cantidad) {
        if (super.getInocencia()-cantidad > 40) {
            super.disminuirInocencia(cantidad);
        }
        else super.disminuirInocencia(super.getInocencia()-(super.getInocencia()-cantidad));
    }
}
