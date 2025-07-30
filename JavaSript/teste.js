function ehprimo(n) {
    if (n <= 1) {
        console.log("Não é primo!");
        return;
    }
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) {
            console.log("Não é primo!");
            return;
        }
    }
    console.log(`${n} é primo`);
}

ehprimo(7);


function parOuImpar(n){
 n % 2 === 0 ? console.log("É par") : console.log("É Ímpar");
}
parOuImpar(10);

function factorial(n){
    let resultado = 1;
    for(let i = 1 ; i <=n ; i ++){
        resultado *= i;
    }
    console.log(resultado);
}

factorial(10)