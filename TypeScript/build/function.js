"use strict";
function multiplicacao(a, b) {
    return a * b;
}
console.log(multiplicacao(10, 40));
const numbers = [5, 8, 12, 3, 7, 20, 1];
function analisarNumeros(numbers) {
    let pares = numbers.filter(n => n % 2 === 0);
    let soma = numbers.reduce((acc, number) => acc + number, 0);
    let media = soma / numbers.length;
    let maior = Math.max(...numbers);
    let menor = Math.min(...numbers);
    return {
        pares,
        soma,
        media,
        maior,
        menor,
    };
}
console.log(analisarNumeros(numbers));
const alunos = [
    { nome: "Ana", nota: 8 },
    { nome: "Bruno", nota: 5 },
    { nome: "Carlos", nota: 9 },
    { nome: "Diana", nota: 6 },
    { nome: "Eva", nota: 10 },
];
function analisarAlunos(alunos) {
    const soma = alunos.reduce((acc, aluno) => acc + aluno.nota, 0);
    const media = soma / alunos.length;
    const maiorNota = alunos.reduce((acc, aluno) => aluno.nota > acc.nota ? aluno : acc);
    const menorNota = alunos.reduce((acc, aluno) => aluno.nota < acc.nota ? aluno : acc);
    const aprovados = alunos.filter(aluno => aluno.nota >= 7);
    return {
        media,
        maiorNota,
        menorNota,
        aprovados,
    };
}
console.log(analisarAlunos(alunos));
function agruparAlunosPorStatus(alunos) {
    return alunos.reduce((acc, aluno) => {
        if (aluno.nota >= 7) {
            acc.Aprovados.push(aluno);
        }
        else if (aluno.nota >= 5) {
            acc.Recuperacao.push(aluno);
        }
        else {
            acc.Reprovados.push(aluno);
        }
        return acc;
    }, { Aprovados: [], Recuperacao: [], Reprovados: [] });
}
console.log(agruparAlunosPorStatus(alunos));
