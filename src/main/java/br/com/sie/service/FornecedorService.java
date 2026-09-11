
package br.com.sie.service;

import br.com.sie.model.Fornecedor;


public class FornecedorService {
    
     public boolean validarFornecedor(Fornecedor fornecedor) {

        if (fornecedor == null) {
            return false;
        }

        if (fornecedor.getNome() == null
                || fornecedor.getNome().isBlank()) {
            return false;
        }

        if (fornecedor.getCnpj() == null
                || fornecedor.getCnpj().isBlank()) {
            return false;
        }

        return true;
    }
    
}
