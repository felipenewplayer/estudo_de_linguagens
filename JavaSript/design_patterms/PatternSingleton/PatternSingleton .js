// Singleton Pattern — Uma única instância
// 🧠 Objetivo:
// Garantir que só exista uma instância de um objeto durante toda a execução.

// 💡 Quando usar:
// Gerenciadores de configuração

// Controladores globais(ex: temas, autenticação, cache)

// Banco de dados(em apps maiores)

// 📦 Como funciona:
// Em vez de permitir que o objeto seja criado várias vezes, você cria uma única vez e sempre retorna a mesma instância.



const Caixalog = (() => {
    let instancia; // única instância


    function criarInstancia() {
        const mensagens = [];

        return {
            adicionar(mensagem) {
                mensagens.push(mensagem);
            },
            listar() {
                mensagens.forEach(m => {
                    console.log(m);
                })
            }
        }}

    return {
        getInstacia() {
            if (!instancia) {
                instancia = criarInstancia();
            }
            return instancia;
        }
    }
})();

const c1 = Caixalog.getInstacia();
c1.adicionar("Primeira Instância");
c1.listar();