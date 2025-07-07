function contarFrequenciaElementos() {
    const numeros = [2, 3, 2, 4, 5, 3, 2];

    const agrupar = numeros.reduce((acc, numero) => {
        if (!acc[numero]) {
            acc[numero] = 0;
        }
        acc[numero]++;
        return acc;
    }, { total: 0 });

    console.log(agrupar);
}

contarFrequenciaElementos();

function ehPalindromo(palavra) {
    const palavraInvertida = palavra.split("").reverse().join("");
    palavraInvertida === palavra ? console.log("É palíndromo") : console.log("Não é palíndromo");

}
ehPalindromo("radar");

function somarPares(array) {
    const pares = array.filter(n => n % 2 === 0)
        .reduce((acc, par) => acc + par, 0);
    console.log(pares);
}

    somarPares([10, 50, 30, 20, 3, 10, 4, 60, 20, 1, 1, 40]);

function dobraValoresEFiltra(array) {
    const dobrarEFiltrar = array.map(n => n * 2).filter(n => n > 100);
    console.log(dobrarEFiltrar);
}
dobraValoresEFiltra([10, 50, 30, 20, 3, 10, 4, 60, 20, 1, 1, 40]); 

function quantasLetras(palavra) {
    const semEspacos = palavra.replace(/\s/g, "");
    console.log(semEspacos.length);
}
quantasLetras("amor é belo e true");
