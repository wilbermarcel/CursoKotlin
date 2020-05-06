package br.com.wilber.bytebank.modelo

abstract class Funcionario(val nome: String, val cpf: String, val salario: Double = 0.0, val tipo: Int = 0) {

    init {
        println("Cadastrando funcionário $nome")
    }

    abstract fun getBonificacao(): Double

    open fun imprime(tipo: String = "") {
        println("$tipo: $nome")
        println("CPF: $cpf")
        println("Salário: $salario")
        println("Bonificação: ${getBonificacao()}")
    }

}