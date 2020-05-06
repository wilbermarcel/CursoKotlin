package br.com.wilber.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int,
    val endereco: Endereco
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}