
fun encypt(plainText: String, key: CharArray): List<Char>{
    val CharacterText: List<Char> = plainText.toList()
    for(char in CharacterText){
        val cryptText =
    }

    return CharacterText

}

fun main() {
    val Characters = ('A'..'Z').toList().toCharArray()
    val key = ('A'..'Z').toList().toCharArray()
    key.shuffle()
    val changer = mutableMapOf<Char, Char>()
    for (i in Characters.indices) {
        changer[Characters[i]] = key[i]
    }

    println(Characters)
    println(key)
    println(changer)


    val input = readln().toString()
    print(encypt(input))

}