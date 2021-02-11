package com.app.ponto.repository;

import com.app.ponto.domain.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    @Transactional(readOnly = true) //metodo de leitura
    Empresa findByCnpj(String cnpj);
}