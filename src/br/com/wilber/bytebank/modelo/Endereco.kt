package br.com.wilber.bytebank.modelo

class Endereco(
    var logradouro: String = "",
    var numero: Int = 0
) {
    override fun toString(): String {
        return """Endereco(
|logradouro='$logradouro', 
|numero=$numero)""".trimMargin().trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

        if (logradouro != other.logradouro) return false
        if (numero != other.numero) return false

        return true
    }

    override fun hashCode(): Int {
        var result = logradouro.hashCode()
        result = 31 * result + numero
        return result
    }
}