package hilos.clase;

import lombok.Getter;
import lombok.Setter;

public class Persona {
    @Getter @Setter private String nombre;
    @Getter @Setter private String fechaNaciemiento;
    @Getter @Setter private  String direccion;

    public Persona() {
    }


}
