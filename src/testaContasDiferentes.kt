fun testaContasDiferentes() {
    //    testaOrientacaoObjeto()

    val contaCorrente: ContaCorrente
    contaCorrente = ContaCorrente(titular = "Wilber", conta = 1000)

    val contaPoupanca = ContaPoupanca(titular = "Marcel", conta = 1001)

    contaCorrente.deposita(valor = 100.0)
    contaPoupanca.deposita(valor = 100.0)

    contaCorrente.saca(valor = 10.0)
    contaPoupanca.saca(valor = 10.0)

    contaCorrente.transfere(valor = 10.0, contaDestino = contaPoupanca)
    contaPoupanca.transfere(valor = 8.0, contaDestino = contaCorrente)
}
