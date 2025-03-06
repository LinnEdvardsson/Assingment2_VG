
class SantasHelpers() {


    fun createMap(): MutableMap<String, List<String>> {
        val santasElfs: MutableMap<String, List<String>> = mutableMapOf(
            "Tomten" to listOf("Glader", "Butter"),
            "Glader" to listOf("Tröger", "Trötter", "Blyger"),
            "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"),
            "Trötter" to listOf("Skummtomten"),
            "Skummtomten" to listOf("Dammråttan"),
            "Räven" to listOf("Gråsuggan", "Myran"),
            "Myran" to listOf("Bladlusen")
        )
        return santasElfs
    }


    fun getUnderlings(currentName: String, result: MutableList<String> = mutableListOf(), santasElfs: MutableMap<String, List<String>>): MutableList<String> {
         fun getElfs(currentName: String, result: MutableList<String>) : MutableList<String> {
            santasElfs[currentName]?.let { underlings ->                        //Hämtar currentName (nyckel) från map, om det inte är null så tas det emot i underlings.
                underlings.filterNot { it in result }.forEach { elf ->             //Filtrerar bort alla elfs som finns i underlings och går igenom lista med result och lägger till de som inte finns.
                    result.add(elf)
                    getElfs(elf, result)                          //Hämtar metod igen för att gå i igenom underlings för akutell elf "loopen" är på.
                }
            }
            return result                                                           //När man gått igenom hela mappen, retuneras resultatet med alla elfs.
        }
        return getElfs(currentName, result)                                 //hämta alla underlings för currentName, med listan med alla elfs
    }
}

    fun main() {
        val santasHelper = SantasHelpers()
        val santasElfs = santasHelper.createMap()
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Tomten", result, santasElfs)
        result.forEach(::println)
    }


//  fun getUnderlings1(currentName: String, result: MutableList<String>, santasElfs: MutableMap<String, List<String>>) {
//        tailrec fun workingElfs(resultList: MutableList<String>, index: Int) {
//            if (index == resultList.size) return
//            santasElfs[currentName]?.let { underlings ->
//                resultList.addAll(underlings.filterNot { it in resultList })
//            }
//            return workingElfs(resultList, index + 1)
//        }
//        santasElfs[currentName]?.let { result.addAll(it) }
//        return workingElfs(result, 0)
//    }

