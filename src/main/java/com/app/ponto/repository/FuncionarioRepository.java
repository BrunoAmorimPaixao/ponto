package com.app.ponto.repository;

import com.app.ponto.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    Funcionario findByCpf(String cpf);

    Funcionario findByEmail(String email);

   // Funcionario findByCnpjOrEmail(String cnpj, String email);
}
