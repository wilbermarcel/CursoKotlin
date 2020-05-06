package br.com.wilber.bytebank.modelo

class ContaSalario(
        titular: Cliente,
        conta: Int
) : Conta(
        titular = titular,
        conta = conta
) {
    override fun saca(valor: Double, taxa: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    override fun transfere(valor: Double, contaDestino: Conta) {
        println("Esse tipo de conta não permite transferência")
    }
}