abstract class Conta(internal val titular: String = "", protected val conta: Int = 0) : Transferivel {

    var saldo = 0.0
        internal set

    fun deposita(valor: Double) {
        if (valor > 0.0) {
            println("Depositando na conta do $titular o valor de $valor")
            this.saldo += valor
            imprimeSaldo(titular, saldo)
        }
    }

    abstract fun saca(valor: Double, taxa: Double = 0.0)

    protected fun imprimeSaldo(titular: String, saldo: Double) {
        println(message = "Novo saldo do $titular: $saldo")
    }


    init {
        if (titular.equals("")) {
            println("Criando conta vazia")
        } else {
            println("Criando a conta do $titular")
        }
    }


}