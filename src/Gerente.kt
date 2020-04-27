//class Gerente(nome: String, cpf: String, salario: Double = 0.0, val senha: Int) : Funcionario(nome = nome, salario = salario, cpf = cpf) {
class Gerente : Funcionario {

    val senha: Int

    constructor(nome: String, cpf: String, salario: Double, senha: Int) : super(nome = nome, salario = salario, cpf = cpf) {
        this.senha = senha
    }

    init {
        println("Cadastrando Gerente $nome")
    }

    override fun getBonificacao() = this.salario

    fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) return true
        return false
    }

    override fun imprime(tipo: String) {
        super.imprime(tipo = "Gerente")
    }

}