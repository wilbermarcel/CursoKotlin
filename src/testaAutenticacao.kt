fun testaAutenticacao() {
    val diretor = Diretor(
            nome = "Wilber",
            cpf = "111.111.111-11",
            salario = 1000.0,
            senha = 1000
    )

    val sistema = SistemaInterno()
    sistema.entra(diretor, 1000)

    val cliente = Cliente(nome = "Wilber", cpf = "111.111.111-11", senha = 1234)
    sistema.entra(cliente, 1234)
}