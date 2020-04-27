class ContaCorrente(
        titular: String,
        conta: Int
) : Conta(
        titular = titular,
        conta = conta
) {
    override fun saca(valor: Double, taxa: Double) {
        if (saldo >= (valor + taxa)) {
            print("Sacando na conta do $titular o valor de $valor")
            println(if (taxa != 0.00) " com uma taxa de $taxa" else "")
            saldo -= (valor + taxa)
            super.imprimeSaldo(titular, saldo)
        }
    }

    override fun transfere(valor: Double, contaDestino: Conta) {
        if (saldo >= valor) {
            contaDestino.saldo += valor
            saldo -= valor
            println("transferência realizada com sucesso")
        } else {
            println("Falha na transferência")
        }
        imprimeSaldo(contaDestino.titular, contaDestino.saldo)
        imprimeSaldo(this.titular, saldo)
    }
}