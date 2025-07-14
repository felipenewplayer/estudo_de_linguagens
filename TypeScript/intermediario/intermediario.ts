//Union Types e Literal Types
// Union Types: aceitar mais de um tipo


function mostrarId(id: number | string) {
    if (typeof id === "string") {
        console.log("Texto:", id.toUpperCase());
    } else {
        console.log("Número: ", id.toFixed(1));
    }
}

mostrarId(10);
mostrarId("Felipe");


// Literal Types: valores fixos permitidos

type Status = "pendente" | "cancelado" | "aprovado";
let situacao: Status = "aprovado";


// Tuplas e Enums
// Tupla: array com tamanho e tipos fixos

let produto: [string, number];
produto = ["Arroz", 35.00];

console.log(produto);

// Enum: valores nomeados e organizados

enum TipoUsuario {
    Admin,
    Editor,
    Leitor
}

let usuario: TipoUsuario = TipoUsuario.Admin;
console.log(usuario);//0


//Tipos Genéricos (generic types)
//Função genérica para reuso

function primeiroElemento<T>(array: T[]): T {
    return array[0];
}

console.log(primeiroElemento([1, 2, 3]));


//  Usando generic com objetos

function envolverObjeto<T>(valor: T): { dado: T } {
    return { dado: valor };
}

console.log(envolverObjeto(123));

// Interfaces, herança e composição
// 🔹 Interface base


interface Pessoa {
    nome: string,
    idade: number
}

// Interface estendendo outra

interface Funcioario extends Pessoa {
    cargo: string;
}

const dev: Funcioario = {
    nome: "Felipe",
    idade: 28,
    cargo: "DevFullSrack"
}

// Type Guards


function processador(valor: number | string) {
    if (typeof valor === "string") {
        console.log("String: ", valor.toUpperCase());

    } else {
        console.log("Número: ", valor.toFixed(2));
    }

}

processador(1);
processador("Ana");


// Tipos de Funções com Callback
// Declarar tipo de função e usar como parâmetro

type Operacao = (a: number, b: number) => number;


function calcular(a: number, b: number, operacao: Operacao) {
    return operacao(a, b);
}

const soma = (x: number, y: number) => x + y;
const mult = (x: number, y: number) => x * y;
const div = (x: number, y: number) => x / y;
const sub = (x: number, y: number) => x * y;

console.log(calcular(10, 5, soma));
console.log(calcular(10, 5, div));
console.log(calcular(10, 5, div));
console.log(calcular(10, 5, sub));


function processaEntrada(valor: string | number) {
    if (typeof valor === "string") {
        console.log(`String: ${valor.toUpperCase()}`)
    } else {
        console.log(`Number: ${valor.toLocaleString("pt-BR", { minimumFractionDigits: 2 })}`);
    }
}

processaEntrada(10);
processaEntrada("Amores");


enum StatusPedido {
    "Pendente",
    "Pago",
    "Enviado",
    "Entregue"
}

type Pedido = [number, string, StatusPedido];
const pedido1: Pedido = [101, "Felipe", StatusPedido.Pago];
const pedido2: Pedido = [102, "Felipe", StatusPedido.Pago];

function imprimirDados(pedido: Pedido) {
    const [id, cliente, status]  = pedido;
    const statusNome = StatusPedido[status];
    console.log(`ID: ${id} | Cliente: ${cliente} | Status: ${statusNome}`);
}

imprimirDados(pedido1);
imprimirDados(pedido2);
