package com.faber.controller;

//<editor-fold defaultstate="collapsed" desc="IMPORT">
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//</editor-fold>

/**
 *
 * @author THIEN
 */
@Controller
public class AutoRenderController {

    @GetMapping("/auto-render")
    public String index(Model model, @RequestParam(value = "name", required = false,
                                                   defaultValue = "World") String name) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/home")
    public String home(Model model, @RequestParam int x) {
        model.addAttribute("x", x);
        return "home";
    }
}
