package com.cvgenerator.templateengine.templates;
import org.springframework.stereotype.Service;

@Service
public class TemplatesService {

    private Template testTemplate = new Template();

    public Template getTestTemplate() {
        return testTemplate;
    }
}
