<?php

//Array
$nomes = ["Felipe", "Marcos", "Larissa", "Manoela", "Jairo"];
$tamanho = count($nomes);
print_r($nomes)."\n";
print_r($tamanho);

// Array associativo
$pessoa = [
    "nome" => "Felipe",
    "idade" => 27,
    "altura" => 1.90
];

print_r($pessoa);
$tamanhoPessoa = count($pessoa);
echo $tamanhoPessoa;

