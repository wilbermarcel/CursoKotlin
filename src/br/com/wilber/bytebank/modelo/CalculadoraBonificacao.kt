package br.com.wilber.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set
        get() {
            return field
        }

    fun registra(funcionario: Funcionario) {
        total += funcionario.getBonificacao()
    }

    fun imprimeTotal() {
        println("Total Geral: $total")
    }

}