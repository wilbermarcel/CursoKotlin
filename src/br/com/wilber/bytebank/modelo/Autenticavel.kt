package br.com.wilber.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean
}