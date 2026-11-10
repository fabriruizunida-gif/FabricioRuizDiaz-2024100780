
package com.unida.main;
import org.springframework.stereotype.Controller;
@Controller//Anotacion para declarar el controlador web
public class SaludoController {
    public String mostrar (){ return "saludo"; }
}
