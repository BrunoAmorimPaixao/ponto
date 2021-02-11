package com.app.ponto.service.impl;

import com.app.ponto.domain.Empresa;
import com.app.ponto.repository.EmpresaRepository;
import com.app.ponto.service.EmpresaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class);

    @Autowired
    private EmpresaRepository repository;

    @Override
    public Optional<Empresa> buscarPorCnpj(String cnpj) {
        log.info("Buscando uma empresa para o CNPJ {}", cnpj);
        return Optional.ofNullable(this.repository.findByCnpj(cnpj));
    }

    @Override
    public Empresa salvar(Empresa empresa) {
        log.info("Salvando a empresa: {}", empresa);
        return repository.save(empresa);
    }
}
