<?php


$nome = "Felipe";  // String
$idade = 27; // Int
$altura = 1.78; // Float
$isworking = false; // Booleano
$money = null; // Nullo kkkk


//Fazendo print

echo $nome . "\n";
echo $idade . "\n";
echo $altura . "\n";
echo $isworking . "\n";
echo $money . "\n";

$name = readline("Qual seu nome: ");
$age = readline("Qual sua idade: ");

$pessoas = [
    [
        "nome" => $name,
        "idade" => $age
    ],
    [
        "nome" => "Marcos",
        "idade" => 30
    ]

];
print_r($pessoas);

for ($i = 0; $i < sizeof($pessoas); $i++) {
print_r($pessoas[$i]["nome"] . " " . "\n");
}

$tamanho = sizeof($pessoas);
$soNome =  array_filter($pessoas,  function ($p) {
    return strrev($p["nome"]);
});

$somaIdade = array_reduce($pessoas, function ($soma, $p) {
    return $soma + $p["idade"];
});

$agruparPorNome = array_reduce($pessoas, function ($soma, $p) {
    return $soma + $p["idade"];
});

print_r($tamanho);
print_r($soNome);
print_r("Soma das idade " . $somaIdade);
