/**
* First week

    const must assigned the value before the code
    var can be change it
    val cannot be change at the momment when it is assigned
	
    here we have "when" instead of case
* */


fun main(){
    println("hello, world!!!")
    var texto: String = "Mi primer texto"
    var texto2 = "texto sin definicion de tipo de texto"
    println("este es el texto de la variable texto: $texto")
    println("mensaje de texto2: $texto2")

    val texto3 = "$texto - $texto2"
    println(texto3)

    val numero1 = 6
    val numero2 = 3
    println("El resultado de $numero1*$numero2 = ${numero1 * numero2}")
    if (numero1 > 4){
        println("el numero es mayor a 4")
    }else{
        println("El numero es menor a 4")
    }
    println("los numeros son ${if (numero1==numero2) "iguales" else "diferentes"}")

    when (numero1){
        1 -> println("El numero es un 1")
        2 -> println("El numero es un 2")
        3, 4 -> println("El numero es entre 3 y 4")
        else -> {
            println("No son valores entre 1 y 4")
        }
    }
    
    //  Listas inmutables
    val ListaInmutables = listOf<Int>(11,12,13,14,15)
    when (numero1){
        in 1..10 -> println("El Numero es entre 1 y 10")
        in ListaInmutables -> println("El Numero esta dentro de la Lista")
        !in 16..20 -> println("El numero no pertenece al rango")
        else -> println("Ninguna de las anteriores")
    }

    println(retornarSaludo("Primer saludo"))
    println(retornarSaludo2("Segundo saludo"))

    // Intumable List
    var ListaInmutable = mutableListOf<Int>()
    ListaInmutable.add(2)
    ListaInmutable.add(3)
    ListaInmutable.add(4)
    var classutil = util()
    classutil.imprimirLista(ListaInmutable)

    // starting class
    var person1 = person("Caleb", "Rodriguez", "Cordero")
    println("\nEl nombre completo es: ${person1.fullName()}")

    // if we want to change any value we can do it with like this
    person1.Name = "Pepe"
    println(person1.fullName())
}

// functions 2 types:
fun retornarSaludo(texto: String): String{
    return "Devolviendo $texto"
}
fun retornarSaludo2(texto: String)= "Devolviendo $texto"

class util{
    fun imprimirLista(numeros: List<Int>){
        for (num in numeros){
            print(num)
        }
    }
}

interface contacInfo{
    fun fullName(): String
}

class person: contacInfo{
    private var name: String = "Caleb"
    private var firstLastName: String = "Rodriguez"
    private var secondLastName: String = "Cordero"

    constructor(name: String, fLastName: String, sLastName: String){
        this.name = name
        this.firstLastName = fLastName
        this.secondLastName = sLastName
    }

    var Name: String
        get() = this.name
        set(value) { this.name = value }

    var FirstLastName: String
        get() = this.firstLastName
        set(value) { this.firstLastName = value }

    var SecondLastName: String
        get() = this.secondLastName
        set(value) { this.secondLastName = value }
    

    override fun fullName()= "$name $firstLastName $secondLastName"
    
}