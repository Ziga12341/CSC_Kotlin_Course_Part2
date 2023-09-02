package jetbrains.kotlin.course.alias.team
import jetbrains.kotlin.course.alias.util.Identifier
data class Team(val id: Identifier, var points:Int = 0){
    val name:String = "Team#${id + 1}"
}

//fun main() {
//    val team = Team(0)
//    println(team.name) // GameCard(id=3, capacity=5)
//}