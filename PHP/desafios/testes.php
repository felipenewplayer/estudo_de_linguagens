    <?php

    //Devolver números pares
    $numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

    function apenasPares($numeros)
    {
        foreach ($numeros as $n) {
            if ($n % 2 === 0) {
                echo  $n . "\n";
            }
        }
    }

    apenasPares($numeros);

    //Verificar Se nome está na lista 

    $nomes = ["Felipe", "Maria", "João"];
    function temNome($nomes)
    {
        $maria = "Maria";
        $temMAria = in_array($maria, $nomes) ? "Sim" : "Não";
        echo $temMAria . "\n";
    }
    temNome($nomes);



    //Somar todos os valores 

    $valores = [2, 6, 8];
    $valoresSomados = array_sum($valores);
    print $valoresSomados;

    //Dobrar valores

    $dobrar = array_map(function ($v) {
        return $v * 2;
    }, $valores);

    print_r($dobrar);


    // Filtrar produtos com preco maiores que 100
    $produtos = [
        ["nome" => "Teclado", "preco" => 120],
        ["nome" => "Mouse", "preco" => 80]
    ];

    function manipularLista($produtos)
    {
        print_r(array_filter($produtos, function ($n) {
            return $n["preco"] > 100;
        }));
    }

    manipularLista($produtos);


    function apenasNomes($produtos)
    {
        print_r(array_map(function ($p) {
            return $p["nome"];
        }, $produtos));
    }

    apenasNomes($produtos);


    function somarPrecos($produtos)
    {
        print_r(array_reduce($produtos, function ($carry, $item) {
            return $carry + $item["preco"];
        }, 0));
    }
    somarPrecos($produtos);
