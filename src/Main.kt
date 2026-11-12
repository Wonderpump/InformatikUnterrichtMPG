import kotlin.text.get

fun encypt(plainText: String): Pair<String,MutableMap<Char,Char>>{

    var cryptText = mutableListOf<Char>()
    val Characters = ('A'..'Z').toList().toCharArray()
    val key = ('A'..'Z').toList().toCharArray()
    key.shuffle()

    val dictionary = mutableMapOf<Char, Char>()
    for (i in Characters.indices) {
        dictionary[Characters[i]] = key[i]
    }
    println(dictionary)

    for(char in 0..plainText.length-1){
        val encryptedChar = dictionary[plainText[char].uppercaseChar()] ?:plainText[char]
        cryptText.add(encryptedChar)

    }
    var EncyptedText = cryptText.joinToString("")
    return Pair(EncyptedText,dictionary)
}

fun main() {

    val input = readln().toString()
    val Crypt = (encypt(input))
    println("Geheime Botschaft: " + Crypt.first)

}