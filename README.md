# Curso de Kotlin
Repositório do curso de Kotlin (Alura) usando o IntelliJ

<p align="center">
  <a href="https://kotlinlang.org/">
    <img
      alt="Kotlin"
      src="https://storage.ning.com/topology/rest/1.0/file/get/1802504447?profile=RESIZE_1024x1024"
      width="400"
    />
  </a>
</p>

# Minhas anotações do curso
## Parte 1

    https://kotlinlang.org/
    https://kotlinlang.org/docs/reference/
    https://www.jetbrains.com/toolbox-app/
    https://pt.wikipedia.org/wiki/CamelCase
    https://kotlinlang.org/docs/reference/coding-conventions.html

    *.kt <- código fonte do kotlin

    Programa básico:
      fun main(){
        print("Bem vindo ao Bytebank")
      }

    var teste -> permite modificar valor
    val teste -> não permite modificar valor
    Kotlin é uma linguagem estáticamente tipada
    Pode escrever como string template -> print("teste: " + variavel) -> print  ("teste: $variavel")

    https://kotlinlang.org/docs/tutorials/kotlin-for-py/primitive-data-types-and-their-limitations.html

    Atribuição:
    val titular: String = "Wilber"
    val contacorrente: Int = 1000
    var saldo: Double = 200.0

    Função que recebe um parametro chamado saldo do tipo Double
      fun funcaoTeste(saldo: Double){
      }

    for (i in 1..5) {
    for (i in 5 downTo 1) {
    for (i in 5 downTo 1 step 2) {
    for (i in 1 until 5) {

    Atalho -> Ctrl + Alt + L <- identa o programa

    Parando o loop acima
    loop@ for (i in 1..100) {
      println("i $i")
        for (j in 1..100) {
          println("j $j")
          if (j == 5) break@loop
        }
    }

    ForEach
      (1..100).forEach { i ->
        println(message = "i $i")
          (1..100).forEach { j ->
          println(message = "j $j")
          }
      }

    Trabalhando com classes:
      class Conta{
        var titular = ""
      }

    val contaWil = Conta()
    contaWil.titular = "Wilber"
    println("Titular: ${contaWil.titular}")

    //Encapsulamento implícito da seguinte maneira
    var saldo = 0.0
    set(value){
        field = valor
    }
    get(){
        return field
    }

    //deixando privado -> dessa maneira é possível somente pegar o saldo via propriedade 'saldo'
    var saldo = 0.0
      private set

    //Retorno em uma linha
    val isEmpty: Boolean get() = size == 0

    //Com labels
    contaMarcel.transfere(valor = 120.0, contaDestino = contaWil) <- dessa maneira podemos passar os parametros em qualquer ordem
    //Sem labels
    contaMarcel.transfere(120.0, contaWil)

    //Construtor primário da classe já sendo inicializado
    class Conta(private val titular: String = "", private val conta: Int = 0) {

## Parte 2
    Ctrl + Alt + M <- Extract Function
    Alt + Enter <- posicionar sobre o nome da Classe para ele criar um arquivo somente dessa classe

    fun retornaTipo(): String {
      return when (tipo) {
          0 -> "Funcionário"
          1 -> "Gerente"
          else -> "Diretor"
      }
    }

    https://kotlinlang.org/docs/reference/classes.html

    open class Funcionario( /.../ ){} <- open indica que a classe pode ser herdada
    open fun getBonificacao() = salario * 0.1 <- open indica que a função pode ser herdada
    override fun getBonificacao() = salario * 0.2 <- classe filha
    class Diretor(nome: String, cpf: String, salario: Double, val senha: Int, val plr: Double) : Funcionario(nome = nome, salario =         salario, cpf = cpf) {} <- Construtor primário

    //construtor secundário
    class Gerente : Funcionario {

      val senha: Int

      constructor(
        nome: String,
        cpf: String,
        salario: Double,
        senha: Int
      ) : super(
        nome = nome,
        cpf = cpf,
        salario = salario
      ) {
        this.senha = senha
      }
    }
 
    //if ternário
    println(if(taxa != 0.00) " com uma taxa de $taxa" else "")

    Ctrl + N -> busca classes

    protected -> modificador indicando que é privado porém as classes filhas tem acesso
    internal -> disponínvel apenas para o módulo
    abstract -> indica que a classe ou método é uma classe apenas de assinaturas

    //Criando uma instância de ContaCorrente e já depositando na ContaCorrente
    val contaWil = ContaCorrente("Wilber", 1000).apply {
      deposita(300.0)
    }

    interface x classe abstrata
    não consegue manter o estado dentro de uma interface
    interface não possui um construtor

    //Usando da classe abstrata
    override fun autentica(senha: Int): Boolean {
      return super<FuncionarioAdmin>.autentica(Senha)
     }

    //Usando da interface
     override fun autentica(senha: Int): Boolean {
      return super<Autenticavel>.autentica(Senha)
    }
    
## Parte 3

    https://kotlinlang.org/docs/reference/coding-conventions.html

    Ctrl + Alt + o -> otimiza o código -> pacotes

    //criando alias para o import com nomes iguais
    import kotlin.String
    import java.lang.String as StringJava

    val palavra: kotlin.String = ""
    val palavraJava: StringJava = StringJava("")

    Devemos criar pacotes considerando a convenção do domínio inverso

    https://medium.com/@alex.felipe/entenda-o-que-s%C3%A3o-build-tools-do-mundo-java-682a26e38ff2
    https://blog.caelum.com.br/como-nao-aprender-orientacao-a-objetos-heranca/
    https://kotlinlang.org/docs/reference/object-declarations.html

    objection expression:
    O objeto pode herdar classes, interfaces normalmente.
      val wilber = object : Autenticavel {
        val nome: String = "Wilber"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000
  
        override fun autentica(senha: Int) = this.senha == senha
      }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(wilber, 1000)

    println("nome do cliente ${wilber.nome}")

    objection expression:
    mantém o estado da classe estático durante a execução do programa
    companion:
    indica que o objeto será "companheiro", sendo assim a classe terá acesso a esse objeto(apenas dentro dela(Classe))
    companion object {
      var total = 0
        private set
    }

    Any -> Classe base do Kotlin

    https://kotlinlang.org/docs/reference/typecasts.html#smart-casts    
    Smart Cast - testando o tipo e fazendo o casting
    if (x is String) {
      print(x.length) // x is automatically cast to String
    }

    when (x) {
      is Int -> print(x + 1)
      is String -> print(x.length + 1)
      is IntArray -> print(x.sum())
    }

    Comportamentos de toda classe herdade de Any
    equals(): deve devolver true quando for o mesmo objeto e false caso sejam diferentes;
    toString(): deve apresentar o nome da classe e o código do objeto diferentes para cada objeto;
    hashCode(): deve apresentar o código de cada objeto com valores diferentes.

    Exemplo de Raw String:
      override fun toString(): String {
        return """Endereco(
        |logradouro='$logradouro', 
        |numero=$numero)""".trimMargin().trimIndent()
      }

    https://github.com/alura-cursos/kotlin-pacotes-composicao-objects/tree/aula-5
