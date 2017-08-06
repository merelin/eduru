package frolg.edu.rulang

case class Metadata(word: Int, letter: Int, rule: Int)
case class Sentence(text: String, metadata: Metadata)
