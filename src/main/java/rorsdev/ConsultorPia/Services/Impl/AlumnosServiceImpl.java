package rorsdev.ConsultorPia.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rorsdev.ConsultorPia.Controllers.dtos.AlumnoDto;
import rorsdev.ConsultorPia.Repositories.AlumnoRepository;
import rorsdev.ConsultorPia.Services.AlumnosService;

import java.util.List;

@Service
public class AlumnosServiceImpl implements AlumnosService {

    @Autowired
    private AlumnoRepository repository;

    @Override
    public List<AlumnoDto> getAlumnado() {
        return this.repository.obtenerAlumnadosEnBD();
    }

    @Override
    public AlumnoDto getAlumno(Long idAlumno) {
        return this.repository.obtenerAlumno(idAlumno);
    }
}
