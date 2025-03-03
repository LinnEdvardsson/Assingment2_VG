
class Santa(){

    fun createMap(): Map<String, Any> {
        var SantasMap: Map<String, Any> = mapOf(
            "Santa" to listOf("Glader ", "Butter "),
            "Glader " to listOf("Tröger ", "Trötter ", "Blyger"),
            "Butter " to listOf("Rådjuret ", "Nyckelpigan ", "Haren ", "Räven "),
            "Trötter" to listOf("Skummtomten"),
            "Skummtomten" to listOf("Dammråttan"),
            "Räven" to listOf("Gråsuggan", "Myran"),
            "Myran" to listOf("Bladlusen")
        )
        return SantasMap
    }

    ///Rekursiv funktion!!!!
    fun getMap(currentName: String, result: MutableList<String>): List<String> {
        fun workingElfs(SantasMap : Map <String, Any>, currentName: String, result: MutableList<String>, key: String): String {
            if (SantasMap.isEmpty()) return

            if (key.isNotEmpty() && currentName == SantasMap[key]) result.add(currentName)
            return result.joinToString(", ")
        }
        return workingElfs()
        }

//SantasMap.map { elfs -> elfs.value as String }
    fun main() {
        var list: MutableList<String> = mutableListOf()
        println(getMap("Tröger", list))

    }
}