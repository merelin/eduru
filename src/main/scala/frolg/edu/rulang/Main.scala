package frolg.edu.rulang

import frolg.edu.rulang.util.JsonConverter._
import org.json4s.{DefaultFormats, StringInput}

object Main {
  def main(args: Array[String]): Unit = {
    /////////////////////////////////////////////////
    // For reference only. Is not going to be used!!!
    val str = """{ "name": "Anna", "age": 5 }"""
    val json = toJson(str)
    println(json \ "name")
    println(fromJson(json))

    val text = """{ "text": "A big brown fox jumped over a lazy dog", "metadata": { "word": 2, "letter": 2, "rule": 1 } }"""
    println(toJson(text).extract[Sentence])
    /////////////////////////////////////////////////

    /////////////////////////////////////////////////
    // This is how we need to serialize / deserialize our instances!!!
    val sentence = Sentence(
      text = "A big brown fox jumped over a lazy dog",
      metadata = Metadata(word = 3, letter = 3, rule = 1)
    )
    val serializedToString: String = writeTo(sentence)
    val deserializedFromString: Sentence = readFrom[Sentence](serializedToString)

    println(s"serializedToString: ${serializedToString}")
    println(s"deserializedFromString: ${deserializedFromString}")
    /////////////////////////////////////////////////
  }
}
