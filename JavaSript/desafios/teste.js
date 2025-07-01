//Somar os Números Pares


function pares() {
    const numeros = [1, 2, 3, 4, 5, 6];
    const par = numeros.filter(n => n % 2 === 0);
    const somaDosPares = par.reduce((acc, par) => acc + par, 0);
    console.log(somaDosPares);
}
pares();

//Filtrar nomes com mais de 5 letras

function filtrarNomes() {
    const nomes = ["Ana", "João", "Felipe", "Carla", "Lucas"];
    const filtro = nomes.filter(nome => nome.length > 5);
    console.log(filtro);
}

filtrarNomes();

//Media das nostas

function calcularMediaDasNotas() {
    const notas = [8, 7.5, 10];
    const soma = notas.reduce((acc, nota) => acc + nota, 0);
    const media = soma / notas.length
    console.log(media);
}

calcularMediaDasNotas();


//Somar precos por categoria

function somarPrecosPorCategoria() {
    const produtos = [
        { nome: "Fone", categoria: "Eletrônicos", preco: 150 },
        { nome: "Camisa", categoria: "Roupas", preco: 50 },
        { nome: "Teclado", categoria: "Eletrônicos", preco: 300 },
        { nome: "Calça", categoria: "Roupas", preco: 100 }
    ];


    const agrupar = produtos.reduce((acc, produto) => {
        const categoria = produto?.categoria ?? "Sem categoria";
        if (!acc[categoria]) {
            acc[categoria] = { precoTotal: 0 }
        }

        acc[categoria].precoTotal += produto.preco;
        return acc;

    }, {})

    const alterar = Object.entries(agrupar)
        .map(([categorias, dados]) => {
            return {
                nome: categorias,
                precoTotal: dados.precoTotal
            }
        })
    console.log(alterar);
}

somarPrecosPorCategoria();


function frequenciaDePalavras() {
    const palavras = ["maçã", "banana", "maçã", "laranja", "banana", "banana"];

    const agrupar = palavras.reduce((acc, palavra) => {
        if (!acc[palavra]) {
            acc[palavra] = 1;
        } else {
            acc[palavra]++;
        }
        return acc;
    }

        , {})
    console.log(agrupar);
}

frequenciaDePalavras();