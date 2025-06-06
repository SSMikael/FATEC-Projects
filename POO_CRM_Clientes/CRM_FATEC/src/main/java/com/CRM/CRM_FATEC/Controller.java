package com.CRM.CRM_FATEC;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping

public class Controller {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Primeira Mensagem do CRM FATEC!";
    }
}
