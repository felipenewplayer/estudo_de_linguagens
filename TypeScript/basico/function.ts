function multiplicacao(a: number, b: number): number {
    return a * b;
}

console.log(multiplicacao(10, 40));


const numbers = [5, 8, 12, 3, 7, 20, 1];

function analisarNumeros(numbers: number[]) {
    let pares: number[] = numbers.filter(n => n % 2 === 0);
    let soma: number = numbers.reduce((acc, number) => acc + number, 0);
    let media: number = soma / numbers.length;
    let maior: number = Math.max(...numbers);
    let menor: number = Math.min(...numbers);
    return {
        pares,
        soma,
        media,
        maior,
        menor,
    };
}
console.log(analisarNumeros(numbers));

type Aluno = {
    nome: string;
    nota: number;
};
const alunos = [
    { nome: "Ana", nota: 8 },
    { nome: "Bruno", nota: 5 },
    { nome: "Carlos", nota: 9 },
    { nome: "Diana", nota: 6 },
    { nome: "Eva", nota: 10 },
];

function analisarAlunos(alunos: Aluno[]) {
    const soma: number = alunos.reduce((acc, aluno) => acc + aluno.nota, 0);
    const media: number = soma / alunos.length;
    const maiorNota = alunos.reduce((acc, aluno) => aluno.nota > acc.nota ? aluno : acc);
    const menorNota = alunos.reduce((acc, aluno) => aluno.nota < acc.nota ? aluno : acc);
    const aprovados = alunos.filter(aluno => aluno.nota >= 7);
    return {
        media,
        maiorNota,
        menorNota,
        aprovados,
    }
}


console.log(analisarAlunos(alunos));


function agruparAlunosPorStatus(alunos: Aluno[]) {
    return alunos.reduce((acc, aluno) => {
        if (aluno.nota >= 7) {
            acc.Aprovados.push(aluno);
        } else if (aluno.nota >= 5) {
            acc.Recuperacao.push(aluno);
        } else {
            acc.Reprovados.push(aluno);
        }
        return acc;
    }, { Aprovados: [] as Aluno[], Recuperacao: [] as Aluno[], Reprovados: [] as Aluno[] });
}

console.log(agruparAlunosPorStatus(alunos));