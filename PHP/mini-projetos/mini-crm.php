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

//Desafio 1: Mostrar todos os nomes e emails
// Use array_map para extrair nome e email de cada cliente
$nomeEEmail = array_map(function ($cliente) {
    return  $cliente["nome"] . "---" . $cliente["email"];
}, $clientes);

print_r($nomeEEmail);

// Desafio 2: Contar quantos estão ativos
// Use array_filter para pegar apenas status == "ativo"
// Depois use count() para saber quantos são

$clientesAtivos = array_filter($clientes, function ($cliente) {
    return $cliente["status"] === "ativo";
});

print_r($clientesAtivos);

$tamanhoClientesAtivos = count($clientesAtivos);
print_r($tamanhoClientesAtivos);

// Verificar se existe um cliente com nome "Carlos"

// Use array_filter + alguma verificação com nome
$calos = array_filter($clientes, function ($cliente) {
    return $cliente["nome"] === "Carlos";
});
print_r($calos);

// Primeiro filtre os ativos
// Depois use array_map para pegar só os emails

$soAtivos = array_filter($clientes, function ($cliente) {
    return $cliente["status"] === "ativo";
});
print_r($soAtivos);

$emailDosAtivos = array_map(function ($cliente) {
    return $cliente["email"];
}, $soAtivos);

print_r($emailDosAtivos);



//  Adicionar um novo cliente
// Simule adicionando um cliente com array_push()

$novoCliente = array_push($clientes, [
    "nome" => "Felipe",
    "email" => "felipe@gmail.com",
    "status" => "ativo"
]);

print_r($clientes);
//Desafio 6 (avançado): Gerar um "relatório" com total, ativos, inativos
// Use count() e array_filter
// Mostre no final:
// Total de clientes
// Quantos ativos
// Quantos inativos


$total = count($clientes);
$ativos = array_filter($clientes, function ($c) {
    return $c["status"] === "ativo";
});
$inativos = array_filter($clientes, function ($c) {
    return $c["status"] === "inativo";
});

echo "*****Relatório*******"."\n";
echo "Total de clientes: " . $total. "\n";
echo "Clientes ativos: " . count($ativos). "\n";
echo "Clientes inativos: " . count($inativos). "\n";
