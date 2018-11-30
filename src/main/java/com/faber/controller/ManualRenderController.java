package com.faber.controller;

//<editor-fold defaultstate="collapsed" desc="IMPORT">
import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//</editor-fold>

/**
 *
 * @author THIEN
 */
@RestController
public class ManualRenderController {

    @GetMapping("/")
    public String index() throws MalformedTemplateNameException, ParseException, IOException, TemplateException {

        Configuration cfg = new Configuration();

        // Where do we load the templates from:
        cfg.setClassForTemplateLoading(ManualRenderController.class, "/");

        // Some other recommended settings:
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        Template template = cfg.getTemplate("index.ftl");
        
        //prepare model data
        Map<String, Object> templateData = new HashMap<>();
        templateData.put("name", "Thien");
        try (StringWriter out = new StringWriter()) {
            template.process(templateData, out);
            out.flush();
            return out.getBuffer().toString();

        }
    }
}
