<!-- 

Perfeito, Felipe! Bora continuar nesse ritmo forte — agora **sem código**, só com **instruções passo a passo** pra você montar **o Mini CRM 2.0 com PHP puro e lógica**.
---

## ⚙️ **Mini CRM 2.0 – Funcionalidades e Instruções**

### 1. **Menu interativo com `readline()` + `switch`**

**Objetivo:** Criar um menu de opções:

* 1: Listar clientes
* 2: Adicionar cliente
* 3: Atualizar cliente
* 4: Remover cliente
* 5: Buscar cliente por nome
* 6: Gerar relatório
* 0: Sair

**Instrução:**
Use `while (true)` para manter o programa rodando, e `switch` para tratar a escolha do usuário com `readline()`.

---

### 2. **Listar clientes**

**Objetivo:** Mostrar nome, email e status de todos os clientes.

**Instrução:**
Use `foreach` ou `array_map` e exiba todos os dados.

---

### 3. **Adicionar cliente**

**Objetivo:** Permitir inserir um novo cliente com `nome`, `email` e `status`.

**Instrução:**

* Use `readline()` para pegar os dados.
* Crie um novo array associativo.
* Use `array_push()` para adicionar ao array de clientes.

---

### 4. **Atualizar cliente existente**

**Objetivo:** Atualizar os dados de um cliente existente.

**Instrução:**

* Peça o **nome** do cliente.
* Use `foreach` para encontrar o índice correspondente.
* Permita editar nome, email ou status (com nova entrada `readline()`).
* Atualize os valores diretamente no array.

---

### 5. **Remover cliente**

**Objetivo:** Excluir um cliente da lista.

**Instrução:**

* Peça o nome do cliente.
* Use `foreach` ou `array_search` para localizar.
* Use `unset()` para remover do array.

---

### 6. **Buscar cliente por nome**

**Objetivo:** Mostrar os dados de um cliente específico.

**Instrução:**

* Peça o nome do cliente.
* Use `array_filter()` ou `foreach` para buscar.
* Exiba os dados se encontrar.

---

### 7. **Relatório geral**

**Objetivo:** Mostrar:

* Total de clientes
* Quantos estão ativos
* Quantos estão inativos

**Instrução:**

* Use `count()` no array total.
* Use `array_filter()` para separar ativos/inativos.
* Exiba os números no final.

---

### 8. **Sair do sistema**

**Objetivo:** Encerra o loop `while`.

**Instrução:**

* Caso o usuário digite `0`, use `break`.

---

Quer que eu te mande esses desafios um por um agora, com estrutura inicial de código e você vai resolvendo? -->

<?php

$clientes = [
    [
        "nome" => "Ana",
        "email" => "ana@email.com",
        "status" => "ativo"
    ],
    [
        "nome" => "Carlos",
        "email" => "carlos@email.com",
        "status" => "inativo"
    ],
    [
        "nome" => "Fernanda",
        "email" => "fernanda@email.com",
        "status" => "ativo"
    ]
];


function listarClientes($clientes)
{
    foreach ($clientes as $c) {
        echo "Nome: {$c['nome']} | Email: {$c['email']} | Status: {$c['status']}\n";
    }
}

function editarCliente(&$clientes)
{
    $nomeBusca = readline("Digite o nome do cliente que deseja atualiza!!\n");
    $indiceEncontrado = null;

    foreach ($clientes as $i => $cliente) {
        if (strtolower($cliente["nome"]) === strtolower($nomeBusca)) {
            $indiceEncontrado = $i;
            break;
        }
    }

    if ($indiceEncontrado !== null) {

        echo "Cliente encontrado: \n";
        echo "Nome atual: {$clientes[$indiceEncontrado]['nome']}\n";
        echo "Email atual: {$clientes[$indiceEncontrado]['email']}\n";
        echo "Status atual: {$clientes[$indiceEncontrado]['status']}\n";

        $novoNome = readline("Novo nome(ou enter para manter):");
        $novoEmail = readline("Novo email(ou enter para manter):");
        $novoStatus = readline("Novo status(ou enter para manter):");

        if (!empty($novoNome)) {
            $clientes[$indiceEncontrado]["nome"] = $novoNome;
        }
        if (!empty($novoEmail)) {
            $clientes[$indiceEncontrado]["email"] = $novoEmail;
        }
        if (!empty($novoStatus)) {
            $clientes[$indiceEncontrado]["status"] = $novoStatus;
        }
        echo "Cliente atualizado ocm sucesso!!!\n";
    } else {
        echo "Cliente não encontrado\n";
    }
}

function removerCliente(&$clientes)
{
    $nomeBusca = readline("Digite o nome do cliente que deseja atualiza!!\n");
    $indiceEncontrado = null;

    foreach ($clientes as $i => $cliente) {
        if (strtolower($cliente["nome"]) === strtolower($nomeBusca)) {
            $indiceEncontrado = $i;
            break;
        }
    }

    if ($indiceEncontrado !== null) {
        unset($clientes[$indiceEncontrado]); // remove o cliente
        $clientes = array_values($clientes); // reorganiza os índices
        echo "Cliente removido com sucesso!\n";
    } else {
        echo "Cliente não encontrado.\n";
    }
}

function adicionarCliente(&$clientes)
{
    $nome = readline("Digite nome: ");
    $email = readline("Digite um email: ");
    $status = readline("Digite um status: ");

    array_push($clientes, [
        "nome" => $nome,
        "email" => $email,
        "status" => $status
    ]);

    echo "Cliente adicionado com sucesso!\n";
}


function buscarClientePorNome(&$clientes)
{
    $buscarNome = readline("Digite o nome que quer buscar");
    $resultados = array_filter($clientes, function ($c) use ($buscarNome) {
        return strtolower($c["nome"]) === strtolower($buscarNome);
    });

    if (empty($resultados)) {
        echo "Nenhum cliente encontrado com o nome \"$buscarNome\".\n";
    } else {
        foreach ($resultados as $cliente) {
            echo "Nome: {$cliente['nome']} | Email: {$cliente['email']} | Status: {$cliente['status']}\n";
        }
    }
}


function gerarRelatorio(&$clientes)
{
    $total = count($clientes);
    $ativos = array_filter($clientes, function ($c) {
        return $c["status"] === "ativo";
    });
    $inativos = array_filter($clientes, function ($c) {
        return $c["status"] === "inativo";
    });
    echo "Total clientes: " . $total . "\n";
    echo "Clientes ativos: " . count($ativos) . "\n";
    echo "Clientes inativos: " . count($inativos) . "\n";
}
while (true) {
    echo
    "1: Listar clientes

2: Adicionar cliente

3: Atualizar cliente

4: Remover cliente

5: Buscar cliente por nome

6: Gerar relatório

0: Sair \n";
    $opc = readline("Digite uma opção: ");

    // Aqui você pode tratar as opções com switch
    switch ($opc) {
        case 1:
            listarClientes($clientes);
            break;
        case 2:
            adicionarCliente($clientes);
            break;
        case 3:
            echo "Editar clientes...\n";
            editarCliente($clientes);
            break;
        case 4:
            echo "Remover Cliente \n";
            removerCliente($clientes);
            break;
        case 5:
            buscarClientePorNome($clientes);
            break;
        case 6:
            gerarRelatorio($clientes);
            break;

        case 0:
            echo "Saindo...\n";
            break 2; // Sai do while

        default:
            echo "Opção inválida\n";
    }
}
