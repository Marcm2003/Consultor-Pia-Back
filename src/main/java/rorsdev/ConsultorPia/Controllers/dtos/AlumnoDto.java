package rorsdev.ConsultorPia.Controllers.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class AlumnoDto {

    private Long id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Double nota;

    public AlumnoDto(Long id, String nombre, String primerApellido, String segundoApellido, Double nota) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nota = nota;
    }

    private String nombreCompleto() {
        return this.nombre + " " + this.primerApellido + " " +  this.segundoApellido;
    }
}
