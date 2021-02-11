package com.app.ponto.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ponto/empresas")
public class EmpresaBean {

    private static final Logger log = LoggerFactory.getLogger(EmpresaBean.class);
}
