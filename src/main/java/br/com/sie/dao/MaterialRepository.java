
package br.com.sie.dao;

import br.com.sie.model.Material;
import java.util.List;

public interface MaterialRepository {
    
  void salvar(Material material);

    List<Material> listar();

    Material buscarPorId(int id);  
    
}
