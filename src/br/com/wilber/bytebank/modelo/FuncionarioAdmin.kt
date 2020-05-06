package br.com.wilber.bytebank.modelo

abstract class FuncionarioAdmin(
        nome: String,
        cpf: String,
        salario: Double,
        protected val senha: Int,
        tipo: Int = 0
) : Funcionario(nome = nome, cpf = cpf, salario = salario, tipo = tipo), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

} 