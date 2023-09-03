package jetbrains.kotlin.course.alias.team

import jetbrains.kotlin.course.alias.util.Identifier
import jetbrains.kotlin.course.alias.util.IdentifierFactory
import org.springframework.stereotype.Service


@Service
class TeamService(identifierFactory: IdentifierFactory = IdentifierFactory()) {
    companion object {
        val teamsStorage = mutableMapOf<Identifier, Team>()
    }
    /*Implement the generateTeamsForOneRound method.
     The method must generate a list of teams and also store all of them into the teamsStorage map.
     To create new teams, you need to use identifierFactory from the TeamService class to generate a new id.
     We need to create this method to save game results for the leaderboard.

     */

//  my code did not worked. i used code from someone else
    private val identifierFactory = IdentifierFactory()

    fun generateTeamsForOneRound(teamsNumber: Int): List<Team> {
        val teams = List(teamsNumber) { Team(identifierFactory.uniqueIdentifier()) }
        teams.forEach { teamsStorage.putIfAbsent(it.id, it) }
        return teams
    }
}
//    fun generateTeamsForOneRound(teamsNumber: Int): List<Team> {
//        val teams = List(teamsNumber) {
//            Team(teamsNumber)
//        }

//        val listOfTeams = mutableListOf<Team>()
//        var lastTeamId = teamsStorage.values.map { it -> it.id }
////        if (lastTeamId == null){
////           lastTeamId = 0
////        }
//        val endFor = lastTeamId + teamsNumber
//        println(lastTeamId)
//        for (teamId in lastTeamId until endFor) {
//            listOfTeams.add(Team(teamId))
//            teamsStorage.putIfAbsent(teamId, Team(teamId))
//            println(Team(teamId))
////            teamsStorage.putIfAbsent(IdentifierFactory(teamId), Team(teamId))
//        }
//
//        return listOfTeams
//    }