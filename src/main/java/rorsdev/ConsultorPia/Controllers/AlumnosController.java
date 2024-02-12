package rorsdev.ConsultorPia.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rorsdev.ConsultorPia.Controllers.dtos.AlumnoDto;
import rorsdev.ConsultorPia.Services.AlumnosService;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/alumnos")
public class AlumnosController {

    @Autowired
    private AlumnosService alumnosService;

    @GetMapping("/listado")
    public ResponseEntity<List<AlumnoDto>> obtenerAlumnado () {
        return ResponseEntity.ok(alumnosService.getAlumnado());
    }

    @GetMapping("/{idAlumno}")
    public ResponseEntity<AlumnoDto> obtenerPorId (@PathVariable Long idAlumno) {
        return ResponseEntity.ok(alumnosService.getAlumno(idAlumno));
    }


}
