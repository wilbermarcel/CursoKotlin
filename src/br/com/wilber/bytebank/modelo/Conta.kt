package br.com.wilber.bytebank.modelo

abstract class Conta(
    internal val titular: Cliente,
    protected val conta: Int = 0
) :
    Transferivel {

    var saldo = 0.0
        internal set

    companion object {
        var total = 0
            private set
    }

    fun deposita(valor: Double) {
        if (valor > 0.0) {
            println("Depositando na conta do $titular o valor de $valor")
            this.saldo += valor
            imprimeSaldo(titular.nome, saldo)
        }
    }

    abstract fun saca(valor: Double, taxa: Double = 0.0)

    protected fun imprimeSaldo(titular: String, saldo: Double) {
        println(message = "Novo saldo do $titular: $saldo")
    }


    init {
        if (titular.nome.equals("")) {
            println("Criando conta vazia")
        } else {
            println("Criando a conta do $titular")
        }

        total++
    }


}