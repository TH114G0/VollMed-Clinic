package br.com.VollMed.controller;

import br.com.VollMed.dto.DoctorCreateDTO;
import br.com.VollMed.dto.DoctorListDTO;
import br.com.VollMed.dto.DoctorUpdateDTO;
import br.com.VollMed.infrastructure.service.DoctorService;
import br.com.VollMed.infrastructure.service.ResponseDoctor;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping
    public ResponseEntity<ResponseDoctor> create(@RequestBody @Valid DoctorCreateDTO doctorCreateDTO) {
        var doctor = doctorService.create(doctorCreateDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(doctor);
    }

    @GetMapping
    public ResponseEntity<Page<DoctorListDTO>> list(@PageableDefault(size = 10, sort = {"name"}) Pageable pageable) {
        var doctor = doctorService.list(pageable);
        return ResponseEntity.ok(doctor);
    }

    @PutMapping
    public ResponseEntity<DoctorUpdateDTO> update(@RequestBody DoctorUpdateDTO doctorUpdateDTO) {
        var doctor = doctorService.update(doctorUpdateDTO);
        return ResponseEntity.ok(doctor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        doctorService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
