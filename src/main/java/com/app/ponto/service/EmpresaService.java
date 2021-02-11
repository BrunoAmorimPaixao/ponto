package com.app.ponto.service;

import com.app.ponto.domain.Empresa;
import java.util.Optional;

public interface EmpresaService {

    /**
     * retorno uma empresa peli cnpj
     * @param cnpj
     * @return
     */
    Optional<Empresa> buscarPorCnpj(String cnpj);

    /**
     * cadastra uma empresa
     * @param empresa
     * @return
     */
    Empresa salvar(Empresa empresa);

}
