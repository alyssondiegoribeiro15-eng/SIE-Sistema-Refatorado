
package br.com.sie.dao;

import br.com.sie.model.Material;
import java.util.ArrayList;
import java.util.List;


public class MaterialDAO implements MaterialRepository {
    
    private final List<Material> materiais = new ArrayList<>();

    @Override
    public void salvar(Material material) {
        materiais.add(material);
    }

    @Override
    public List<Material> listar() {
        return new ArrayList<>(materiais);
    }

    @Override
    public Material buscarPorId(int id) {

        for (Material material : materiais) {

            if (material.getId() == id) {
                return material;
            }
        }

        return null;
    }
    
}
