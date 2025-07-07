<?php

function contarFrequenciaDosElmentos()
{
    $array = [2, 3, 2, 4, 5, 3, 2];
    $frequencia = array_count_values($array);
    print_r($frequencia);
}
contarFrequenciaDosElmentos();
function contarFrequenciaDosElmentosComReduce()
{
    $array = [2, 3, 2, 4, 5, 3, 2];
    $frequencia = array_reduce($array, function ($acc, $n) {
        if (!isset($acc[$n])) {
            $acc[$n] = 1;
        } else {
            $acc[$n]++;
        }
        return $acc;
    }, []);

    print_r($frequencia);
}

contarFrequenciaDosElmentosComReduce();



function ehPalindromo($palavra)
{
    $palavraInvertida = strrev($palavra);
    if ($palavraInvertida === $palavra) {
        echo "'$palavra' é um palíndromo!\n";
    } else {
        echo "'$palavra' não é um palíndromo. Invertido fica: '$palavraInvertida'\n";
    }
}

ehPalindromo("radar");  // Saída: 'radar' é um palíndromo!
ehPalindromo("php");




function somarPares($numeros)
{
    $pares = array_filter($numeros, function ($n) {
        return $n % 2  === 0;
    });

    $somar = array_reduce($pares, function ($acc, $n) {
        return $acc + $n;
    }, 0);

    print_r($somar);
}
somarPares([10, 50, 30, 20, 3, 10, 4, 60, 20, 1, 1, 40]);



function dobraValoresEFiltra($array)
{
    $dobrar = array_map(function ($n) {
        return $n * 2;
    }, $array);

    print_r($dobrar);

    $filtrar = array_filter($dobrar, function ($n) {
        return $n > 100;
    });

    print_r($filtrar);
}
dobraValoresEFiltra([10, 50, 30, 20, 3, 10, 4, 60, 20, 1, 1, 40]);



function quantasLetras($frase){
    $semEspaco = preg_replace('/\s+/', '', $frase); 
    echo strlen($semEspaco); 
}
quantasLetras("amor é belo e true");
