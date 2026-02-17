package cl.kemolinaj.ms.productor.ubicaciones.vehiculos.controllers;

import cl.kemolinaj.ms.productor.ubicaciones.vehiculos.dtos.UbicacionRqDto;
import cl.kemolinaj.ms.productor.ubicaciones.vehiculos.services.MqService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cola/ubicaciones")
@RequiredArgsConstructor
public class UbicacionesControllers {
    private final MqService mqService;

    @PostMapping()
    public ResponseEntity<String> enviarMensaje(@Valid @RequestBody UbicacionRqDto rqDto) {
        mqService.send(rqDto);
        return ResponseEntity.ok().body("Mensaje enviado");
    }
}
