 <!-- Desafio 1.1 – Calculadora Simples
Peça dois números e mostre:

Soma

Subtração

Multiplicação

Divisão

Resto da divisão
 Desafio 1.2 – Lista de Compras
Crie um array simples com os seguintes itens:

php
Copy
Edit
["Arroz", "Feijão", "Macarrão", "Óleo"]
Mostre no navegador usando um for.

<?php


$number = readline("Digite um número: ");
$number2 = readline("Digite outro número: ");

function somar($number, $number2)
{
    return $number + $number2;
}
function subtrair($number, $number2)
{
    return $number - $number2;
}
function multiplicar($number, $number2)
{
    return $number * $number2;
}
function divisao($number, $number2)
{
    if ($number2 === 0) {
        return;
    }
    return $number / $number2;
}
echo somar(
    $number,
    $number2
) . "\n";
echo subtrair(
    $number,
    $number2
) . "\n";
echo multiplicar(
    $number,
    $number2
) . "\n";
echo divisao(
    $number,
    $number2
) . "\n";



$listaDeCompras = ["Arroz", "Feijão", "Macarrão", "Óleo"];
for ($i = 0; $i < sizeof($listaDeCompras); $i++) {
    echo $listaDeCompras[$i] . "\n";
}
