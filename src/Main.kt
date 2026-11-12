
fun encypt(plainText: String, key: CharArray): String{
    val CharacterText: List<Char> = plainText.toList()
    var cryptText = ""
    for(i in 0..plainText.length-1){
    cryptText = cryptText + key[CharacterText[i]]
    }

    return cryptText

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
    print(encypt(input, key))

}