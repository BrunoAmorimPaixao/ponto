package com.app.ponto.service;

import com.app.ponto.domain.Funcionario;
import java.util.Optional;

public interface FuncionarioService {

    /**
     * salvar funcionario
     * @param funcionario
     * @return
     */
    Funcionario salvar(Funcionario funcionario);

    /**
     * buscas um funcionario pelo cpf
     * @param cpf
     * @return Optional<Funcionario>
     */
    Optional<Funcionario> buscarPorCpf(String cpf);

    /**
     * bucas funcionario por email
     * @param email
     * @return Optional<Funcionario>
     */
    Optional<Funcionario> buscarPorEmail(String email);

    /**
     * bucas funcionario por id
     * @param id
     * @return Optional<Funcionario>
     */
    Optional<Funcionario> buscarPorId(Long id);
}
