package com.senac.projeto2.controller;




import com.senac.projeto2.entity.Premio;
import com.senac.projeto2.service.PremioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/premio")
@Tag(name="Premio", description="API para gerenciamento dos categoria do sistema")
public class PremioController {

    private final PremioService premioService;


    public PremioController(PremioService premioService) {
        this.premioService = premioService;
    }

    @GetMapping("/listar")
    @Operation(summary = "Listar categoria do sistema")
    public ResponseEntity<List<Premio>> listar(){
        return ResponseEntity.ok(premioService.listarPremio());
    }

    @GetMapping("/listarPorIdPremio/{idPremio}")
    @Operation(summary = "Listar premio do sistema pelo id do premio")
    public ResponseEntity<Premio> listarPorIdPremio(@PathVariable("idPremio") Integer idPremio){
        Premio premio = premioService.listarPremioPorId(idPremio);
        if (premio == null) {
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.ok(premio);
        }

    }

    @PostMapping("/criar")
    public String criar(){
        return "Categoria Criado com sucesso!";
    }

    @PutMapping("/atualizar")
    public String atualizar(){
        return  "Categoria atualizado com sucesso!";
    }

    @DeleteMapping("/apagar")
    public String apagar(){
        return "Categoria apagado com sucesso!";
    }
}
