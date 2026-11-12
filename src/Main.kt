

fun encrypt(plainText: String): Pair<String,MutableMap<Char,Char>>{

    val cryptText = mutableListOf<Char>()
    val characters = ('A'..'ü').toList().toCharArray()
    val key = ('A'..'ü').toList().toCharArray()
    key.shuffle()

    val dictionary = mutableMapOf<Char, Char>()
    for (i in characters.indices) {
        dictionary[characters[i]] = key[i]
    }
    println(dictionary)

    for(char in 0..<plainText.length){
        val encryptedChar = dictionary[plainText[char].uppercaseChar()] ?:plainText[char]
        cryptText.add(encryptedChar)

    }
    val encryptedText = cryptText.joinToString("")
    return Pair(encryptedText,dictionary)
}

fun main() {

    val input = readln()
    val crypt = (encrypt(input))
    println("Geheime Botschaft: " + crypt.first)

}