package jetbrains.kotlin.course.alias.team

import jetbrains.kotlin.course.alias.util.Identifier
import jetbrains.kotlin.course.alias.util.IdentifierFactory
import org.springframework.stereotype.Service

@Service
class TeamService(identifierFactory: IdentifierFactory = IdentifierFactory()) {
    companion object {
        var teamsStorage = mutableMapOf<Int, String>() // OK
    }

    /*Implement the generateTeamsForOneRound method.
     The method must generate a list of teams and also store all of them into the teamsStorage map.
     To create new teams, you need to use identifierFactory from the TeamService class to generate a new id.
     We need to create this method to save game results for the leaderboard.

     */
    fun generateTeamsForOneRound(teamsNumber: Int): List<Team> {
        val teams = teamsStorage
        teams.forEach {
            teamsStorage.putIfAbsent(it.id, it.name))
        }
        return teams
    }
}