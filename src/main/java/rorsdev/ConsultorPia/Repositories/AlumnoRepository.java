package rorsdev.ConsultorPia.Repositories;

import org.springframework.stereotype.Repository;
import rorsdev.ConsultorPia.Controllers.dtos.AlumnoDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
// Amb aquesta classe estem simulant una query a BD, realment no és així.
public class AlumnoRepository {

    private final List<AlumnoDto> alumnos = new ArrayList<>() {{
        add(new AlumnoDto(1L, "Juan", "García", "Merino", 4.6));
        add(new AlumnoDto(2L, "Marina", "Girona", "Roig", 9.3));
        add(new AlumnoDto(3L, "Albert", "Llenas", "García", 7.8));
        add(new AlumnoDto(4L, "Anna", "Llanos", "Sanchez", 1.45));
    }};
    public List<AlumnoDto> obtenerAlumnadosEnBD() {
        return this.alumnos;
    }

    public AlumnoDto obtenerAlumno(Long id) {

        Optional<AlumnoDto> alumnoOptional = this.alumnos.stream().filter(alumno -> alumno.getId().equals(id)).findFirst();

        if (alumnoOptional.isPresent()) {
            return alumnoOptional.get();
        }
        return new AlumnoDto(0L, "NO", "EXISTE", "BUSCA OTRA VEZ", 0D);
    }
}
