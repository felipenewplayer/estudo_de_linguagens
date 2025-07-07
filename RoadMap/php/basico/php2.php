<!-- 
 2. Condicionais e Laços
✅ Desafio 2.1 – Par ou Ímpar com If/Else
Peça um número via variável e diga se é par ou ímpar.
✅ Desafio 2.2 – Contagem Regressiva
Use um for para imprimir os números de 10 até 1.

✅ Desafio 2.3 – Maior de Três
Crie 3 variáveis com números. Use if e else para mostrar qual é o maior deles. -->

<?php
function parOuImpar($n)
{
    if ($n % 2 === 0) {
        echo "Par";
    } else {
        echo "Impar";
    }
}
parOuImpar(9);

for ($i = 0; $i <= 10; $i++) {
    echo $i . "\n";
}
$number = readline("Digite um número: ");
$number1 = readline("Digite um número: ");
$number2 = readline("Digite um número: ");

if ($number > $number1 && $number > $number2) {
    echo $number;
} else if ($number1 > $number && $number1 > $number2) {
    echo $number1;
} else {
    echo $number2;
}


