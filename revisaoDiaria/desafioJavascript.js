// function parOuImpar(n) {
//     if (n % 2 === 0) {
//         console.log("É par!");
//     } else {
//         console.log("É ímpar!");
//     }
// }

// parOuImpar(10);

// function notasDasMedias() {
//     nota1 = 10;
//     nota2 = 10;
//     nota3 = 10;

//     soma = nota1 + nota2 + nota3;
//     media = soma / 3;

//     if (media >= 7) {
//         console.log("Aprovado!");
//     } else if (media < 7) {
//         console.log("Recuperacao!");
//     }
//     else {
//         console.log("Reprovado!");
//     }
// }

// notasDasMedias();

// function tabuada() {
//     const number = 10;
//     for (let i = 0; i <= 10; i++) {
//         const resultado = `${i} x ${number} = ${i * number}`;
//         console.log(resultado);
//     }
// }

// tabuada();

// function somarNumerosDaLista() {
//     const numeros = [10, 30, 40, 50, 70, 53, 200];
//     const comReduceSoma = numeros.reduce((acc, numero) => acc + numero, 0);
//     let soma = 0;
//     numeros.forEach(n => {
//         soma += n;

//     });
//     console.log(`Soma dos número com reduce: ${comReduceSoma}`);
//     console.log(`Soma dos número sem reduce: ${soma}`);
// }
// somarNumerosDaLista();


// function maiorEMenorDoArray() {
//     const numeros = [10, 30, 40, 50, 70, 53, 200];
//     const maior = Math.max(...numeros);
//     const menor = Math.min(...numeros);
//     console.log(maior);
//     console.log(menor);
// }

// maiorEMenorDoArray();

// function contaImparDoArray() {
//     const numeros = [10, 50, 30, 40, 50, 7];
//     const impar = numeros.filter(n => n % 2 === 1);
//     const par = numeros.filter(n => n % 2 === 0);
//     console.log(impar);
//     console.log(par);
// }

// contaImparDoArray();




const inverterArray = () => {
    const numero = [155, 7, 4, 2, 77, 8, 66, 4, 22];
    const reverseArray = numero.reverse();
    console.log(reverseArray);

}

inverterArray();

function encontrarValor() {
    const numero = [155, 7, 4, 2, 77];
    const encontrarValor = numero.find(n => n === 7);
    console.log(encontrarValor);
}

encontrarValor();



function removerDuplicate() {
    const numero = [155, 7, 4, 7, 2, 77, 77];
    const semDuplicate = [...new Set(numero)];
    console.log(semDuplicate);
}

removerDuplicate();


function mediaMAiorOuMenor() {
    const numeros = [155, 7, 4, 7, 2, 77, 77];
    const maior = Math.max(...numeros);
    const menor = Math.min(...numeros);
    console.log(`Maior: ${maior}`);
    console.log(`Menor: ${menor}`);

    const soma = numeros.reduce((acc, numero) => acc + numero, 0);
    const media = soma / numeros.length;
    console.log(`Média é : ${media}`);
}

mediaMAiorOuMenor();
const fatorial = () => {
    let resultado = 1;
    const number = 10;
    for (let i = 1; i <= number; i++) {
        resultado *= i;
    }
    console.log(`Fatorial de ${number} é : ${resultado}`);
}

fatorial();