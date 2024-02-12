package rorsdev.ConsultorPia.Services;

import org.springframework.stereotype.Service;
import rorsdev.ConsultorPia.Controllers.dtos.AlumnoDto;

import java.util.List;

@Service
public interface AlumnosService {

    List<AlumnoDto> getAlumnado();

    AlumnoDto getAlumno(Long idAlumno);
}
