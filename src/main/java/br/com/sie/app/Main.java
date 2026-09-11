
package br.com.sie.app;

import br.com.sie.model.Material;
import br.com.sie.service.MaterialService;
import br.com.sie.model.Fornecedor;
import br.com.sie.service.FornecedorService;
import br.com.sie.model.Movimentacao;
import br.com.sie.service.MovimentacaoService;
import br.com.sie.dao.MaterialDAO;
import br.com.sie.model.Perfil;
import br.com.sie.model.Usuario;
import br.com.sie.service.UsuarioService;

public class Main {
    
    public static void main(String[] args) {

        Material material = new Material(
                1,
                "Parafuso Sextavado",
                100,
                20
        );

       MaterialDAO materialDAO = new MaterialDAO();

       MaterialService service = new MaterialService(materialDAO);

        boolean valido = service.validarMaterial(material);

        System.out.println("Material criado:");
        System.out.println(material);

        System.out.println();

        if (valido) {
            System.out.println("Teste concluído: material válido.");
        } else {
            System.out.println("Teste concluído: material inválido.");
        }
        
        Material materialInvalido = new Material(
        2,
        "",
        -10,
        5
);

boolean valido2 = service.validarMaterial(materialInvalido);

System.out.println();
System.out.println("Material inválido criado:");
System.out.println(materialInvalido);

if (valido2) {
    System.out.println("Teste concluído: material válido.");
} else {
    System.out.println("Teste concluído: material inválido.");
}

// TESTE 3 - Fornecedor válido
Fornecedor fornecedor = new Fornecedor(
        1,
        "Metalúrgica Paraná",
        "12.345.678/0001-90",
        "(42) 99999-9999"
);

FornecedorService fornecedorService = new FornecedorService();

boolean fornecedorValido =
        fornecedorService.validarFornecedor(fornecedor);

System.out.println();
System.out.println("Fornecedor criado:");
System.out.println(fornecedor);

if (fornecedorValido) {
    System.out.println("Teste concluído: fornecedor válido.");
} else {
    System.out.println("Teste concluído: fornecedor inválido.");
}

// TESTE 4 - Entrada de estoque

MovimentacaoService movimentacaoService = new MovimentacaoService();

Material materialEstoque = new Material(
        3,
        "Porca Sextavada",
        50,
        10
);

System.out.println();
System.out.println("Estoque inicial:");
System.out.println(materialEstoque.getQuantidade());

boolean entradaRealizada =
        movimentacaoService.realizarEntrada(materialEstoque, 30);

System.out.println("Após entrada de 30 unidades:");
System.out.println(materialEstoque.getQuantidade());

if (entradaRealizada) {
    System.out.println("Teste concluído: entrada realizada com sucesso.");
} else {
    System.out.println("Teste concluído: erro ao realizar entrada.");
}


// TESTE 5 - Saída válida

boolean saidaRealizada =
        movimentacaoService.realizarSaida(materialEstoque, 20);

System.out.println();
System.out.println("Após saída de 20 unidades:");
System.out.println(materialEstoque.getQuantidade());

if (saidaRealizada) {
    System.out.println("Teste concluído: saída realizada com sucesso.");
} else {
    System.out.println("Teste concluído: saída não realizada.");
}


// TESTE 6 - Saída maior que o estoque

boolean saidaInvalida =
        movimentacaoService.realizarSaida(materialEstoque, 100);

System.out.println();
System.out.println("Tentativa de saída de 100 unidades:");

if (saidaInvalida) {
    System.out.println("Teste concluído: saída realizada.");
} else {
    System.out.println("Teste concluído: saída bloqueada por estoque insuficiente.");
}

System.out.println("Estoque final:");
System.out.println(materialEstoque.getQuantidade());

// TESTE 7 - Registrar movimentação de entrada

Material materialRegistro = new Material(
        4,
        "Arruela Lisa",
        40,
        10
);

Movimentacao movimentacaoEntrada =
        movimentacaoService.registrarEntrada(
                1,
                materialRegistro,
                15
        );

System.out.println();
System.out.println("Movimentação registrada:");

if (movimentacaoEntrada != null) {
    System.out.println(movimentacaoEntrada);
    System.out.println("Novo estoque:");
    System.out.println(materialRegistro.getQuantidade());
} else {
    System.out.println("Não foi possível registrar a movimentação.");
}
  
// TESTE 8 - MaterialDAO

Material materialDao1 = new Material(
        5,
        "Chapa de Aço",
        25,
        5
);

Material materialDao2 = new Material(
        6,
        "Barra de Ferro",
        40,
        10
);

materialDAO.salvar(materialDao1);
materialDAO.salvar(materialDao2);

System.out.println();
System.out.println("Materiais cadastrados no DAO:");

for (Material m : materialDAO.listar()) {
    System.out.println(m);
}

System.out.println();
System.out.println("Buscando material com ID 6:");

Material encontrado = materialDAO.buscarPorId(6);

if (encontrado != null) {
    System.out.println("Material encontrado:");
    System.out.println(encontrado);
} else {
    System.out.println("Material não encontrado.");
}

// TESTE 9 - Cadastro através do Service

Material materialService = new Material(
        7,
        "Tubo de Aço",
        30,
        8
);

boolean cadastroRealizado =
        service.cadastrarMaterial(materialService);

System.out.println();
System.out.println("Cadastro através do MaterialService:");

if (cadastroRealizado) {
    System.out.println("Material cadastrado com sucesso.");
} else {
    System.out.println("Material inválido. Cadastro não realizado.");
}


// Busca também através do Service

Material materialEncontrado =
        service.buscarMaterialPorId(7);

System.out.println();
System.out.println("Busca através do MaterialService:");

if (materialEncontrado != null) {
    System.out.println("Material encontrado:");
    System.out.println(materialEncontrado);
} else {
    System.out.println("Material não encontrado.");
}

// TESTE 10 - Usuário válido

Perfil perfil = new Perfil(
        1,
        "Almoxarife"
);

Usuario usuario = new Usuario(
        1,
        "Carlos da Silva",
        "carlos",
        "123456",
        perfil
);

UsuarioService usuarioService = new UsuarioService();

boolean usuarioValido =
        usuarioService.validarUsuario(usuario);

System.out.println();
System.out.println("Usuário criado:");
System.out.println(usuario);

if (usuarioValido) {
    System.out.println("Teste concluído: usuário válido.");
} else {
    System.out.println("Teste concluído: usuário inválido.");
}
    } 
    
}
