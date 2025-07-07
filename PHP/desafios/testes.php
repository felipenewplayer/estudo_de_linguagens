<?php
$notas = [
    "Ana" => 7.5,
    "João" => 8.0,
    "Carlos" => 6.5
];

$soma = array_reduce($notas, function($somar, $nota){
    return $somar + $nota;
}, 0);

print_r($soma);

$nome = array_map(function($nota){
    return $nota[1];
}, $notas);

print_r($nome);

$ana = array_filter($notas, function($nome){
    return $nome === "Ana";
},ARRAY_FILTER_USE_BOTH);

print_r($ana);
