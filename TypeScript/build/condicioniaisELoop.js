"use strict";
let contador = 0;
let maior = 0;
let menor = Infinity;
let soma = 0;
for (let i = 0; i <= 10; i++) {
    soma += i;
    if (i > maior) {
        maior = i;
    }
    if (i < menor) {
        menor = i;
    }
    if (i % 2 === 0) {
        console.log(`${i} é par`);
        contador++;
    }
    else {
        console.log(`${i} é ímpar`);
    }
}
console.log(`tem ${contador} números pares`);
console.log(`O maior número é:  ${maior}`);
console.log(`O menor número é:  ${menor}`);
console.log(`O soma dos números é :  ${soma}`);
let number = 10;
let resultado = 1;
for (let i = 1; i <= number; i++) {
    resultado *= i;
}
console.log(`fatorial de ${10} é : ${resultado}`);
