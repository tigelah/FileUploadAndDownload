package br.com.rodrigo.filedownload.controller;

import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class FileUploadWithFrontEndCode {
    @GetMapping("/files")
    ModelAndView fileUpload(){
        Model m = new ExtendedModelMap();
        return new ModelAndView("index.html");
    }
}
