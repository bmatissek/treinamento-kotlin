package main.kotlin.meuhashmap


class MeuHashMap<K : Any, V : Any?>(private val tamanho: Int = 32) {

    private class MeuHashNode<K : Any,V : Any?> (val key : K, var value : V){
        var proximo : MeuHashNode<K,V>? = null

        fun printNode(){
            print("$key=$value;")
            proximo?.printNode()
        }
    }

    private var arrayNodes = arrayOfNulls<MeuHashNode<K,V>>(tamanho)

    private fun calcularIndiceChave (key : K) : Int{
        val hashCode = key.hashCode()
        val indice = hashCode % tamanho
        return indice
    }

    fun get (key : K) : V? {
        val indice = calcularIndiceChave(key)
        var node = arrayNodes[indice]
        while (node != null){
            if (node.key.equals(key))
                return node.value
            node = node.proximo
        }
        return null
    }

    fun add (key : K, value : V){
        val indice = calcularIndiceChave(key)
        var node = arrayNodes[indice]
        while (node != null){
            if (node.key.equals(key)){
                node.value = value
                return
            }
            node = node.proximo
        }
        val head = arrayNodes[indice]
        val novoNode = MeuHashNode(key,value)
        novoNode.proximo = head
        arrayNodes[indice] = novoNode
    }

    fun printMap(){
        print ("{")
        for (node in arrayNodes)
            node?.printNode()
        print ("}")

    }

}