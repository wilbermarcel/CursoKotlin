package br.com.wilber.bytebank.modelo

interface Transferivel {
    fun transfere(valor: Double, contaDestino: Conta)
}