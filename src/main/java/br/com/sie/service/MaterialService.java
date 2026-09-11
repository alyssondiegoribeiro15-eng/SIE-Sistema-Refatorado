
package br.com.sie.service;

import br.com.sie.model.Material;
import br.com.sie.dao.MaterialRepository;


public class MaterialService {
    
private final MaterialRepository materialRepository;

public MaterialService(MaterialRepository materialRepository) {
    this.materialRepository = materialRepository;
}
    
    public boolean validarMaterial(Material material) {

        if (material == null) {
            return false;
        }

        if (material.getDescricao() == null
                || material.getDescricao().isBlank()) {
            return false;
        }

        if (material.getQuantidade() < 0) {
            return false;
        }

        if (material.getEstoqueMinimo() < 0) {
            return false;
        }

        return true;
    }
    
    public boolean cadastrarMaterial(Material material) {

    if (!validarMaterial(material)) {
        return false;
    }

    materialRepository.salvar(material);

    return true;
}

public Material buscarMaterialPorId(int id) {
    return materialRepository.buscarPorId(id);
}
    
}
