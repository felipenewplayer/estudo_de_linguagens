<?php

// function parOuImpar()
// {

//     $numero = (int)readline("Digite um número: ");
//     if ($numero  % 2 === 0) {
//         echo "É par\n";
//     } else {
//         echo "É Ímpar\n";
//     }
// }
// parOuImpar();


// function notasDasMedias()
// {
//     $nota1 = 10;
//     $nota2 = 10;
//     $nota3 = 10;

//     $soma = $nota1 + $nota2 + $nota3;
//     $media = $soma / 3;

//     if ($media >= 7) {
//         echo "Aprovado!\n";
//     } else if ($media < 7) {
//         echo "Recuperacao!\n";
//     } else {
//         echo "Reprovado!\n";
//     }
// }
// notasDasMedias();


// function tabuada()
// {
//     $number = 10;
//     for ($i = 0; $i <= 10; $i++) {
//         $multiplicacao = $i * $number;
//         $resultado = "$i x $number = $multiplicacao";
//         echo $resultado . "\n";
//     }
// }

// tabuada();


// function somarNumerosDaListaComReduce()
// {
//     $numeros = [10, 40, 0, 50, 60, 10];

//     $soma = array_reduce($numeros, function ($soma, $n) {
//         return $soma + $n;
//     }, 0);
//     echo "Soma com reduce: " . $soma . "\n";
// }
// somarNumerosDaListaComReduce();

// function somarNumeroDaLista()
// {
//     $numeros = [10, 40, 0, 50, 60, 10];
//     $soma = 0;
//     foreach ($numeros as $n) {
//         $soma += $n;
//     };
//     echo "Soma: " . $soma. "\n";
// }

// somarNumeroDaLista();


// function menorEMaiorDoArray()
// {
//     $numeros = [10, 40, 0, 50, 60, 10];
//     $maior = $numeros[0];
//     $menor = $numeros[0];
//     foreach ($numeros as $numero) {
//         if ($numero > $maior) {
//             $maior = $numero;
//         }
//         if ($numero < $menor) {
//             $menor = $numero;
//         }
//     }



//     echo "Menor valor: " . $menor . "\n";
//     echo "Maior valor: " . $maior . "\n";
//     return [$menor, $maior];
// }

// menorEMaiorDoArray();


// function contaImparDoArray(){
//       $numeros = [10, 50, 30, 40, 50, 7];
//       $impar = array_filter($numeros, function($n){
//         return $n % 2 === 1;
//       });
//       $par = array_filter($numeros, function($n){
//         return $n % 2 === 0;
//       });

//      print_r($impar);
//      print_r($par);
// }

// contaImparDoArray();

function fatorial($n)
{
    $resultado = 1;
    for ($i = 1; $i <= $n; $i++) {
        $resultado *= $i;
    }
    return $resultado;
}

$numero = (int)readline("Digite um número: ");
echo "Fatorial de $numero é " . fatorial($numero) . "\n";


function inverterArray()
{
    $numeros = [10, 50, 60, 70, 03, 032, 20];
    $inverArray = array_reverse($numeros);
    print_r($inverArray);
}
inverterArray();


function encontrarValor()
{
    $numeros = [10, 50, 60, 70, 03, 032, 20];
    $buscar = 10;
    if (in_array($buscar, $numeros)) {
        echo "$buscar encontrado" . "\n";
    } else {
        echo "$buscar Não encontrado" . "\n";
    }
}
encontrarValor();
