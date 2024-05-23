package com.cvgenerator.templateengine.templates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TemplatesController {

    private final TemplatesService templateService;

    @Autowired
    public TemplatesController(TemplatesService templateService) {
        this.templateService = templateService;
    }

    @GetMapping("templates/{templateId}")
    public String getTemplate(@PathVariable("templateId") String templateId, Model model) {
        Template template = templateService.getTestTemplate();

        model.addAttribute("person", template.getPerson());
        model.addAttribute("profile", template.getProfile());
        model.addAttribute("technologies", template.getTechnologies());
        model.addAttribute("hobbies", template.getHobbies());
        model.addAttribute("workExperiences", template.getWorkExperiences());
        model.addAttribute("educations", template.getEducations());
        model.addAttribute("fileName", templateId);
        return templateId + "/index.html";
    }
}
