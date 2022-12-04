package digital.quintino.gersegurancaapi.controller;

import digital.quintino.gersegurancaapi.domain.PapelDomain;
import digital.quintino.gersegurancaapi.service.PapelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/papel")
public class PapelController {

    @Autowired
    private PapelService papelService;

    @GetMapping
    public List<PapelDomain> findAll() {
        return this.papelService.findAll();
    }

}
