fun testaComportamentosConta() {
    val contaWil = ContaCorrente("Wilber", 1000).apply {
        deposita(300.0)
    }

    val contaMarcel = ContaPoupanca("Marcel", 1001).apply {
        deposita(200.0)
    }

    contaWil.deposita(50.0)
    contaWil.saca(100.0)

    contaMarcel.transfere(120.0, contaWil)

}

