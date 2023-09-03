package jetbrains.kotlin.course.alias.team

import jetbrains.kotlin.course.alias.util.Identifier
import jetbrains.kotlin.course.alias.util.IdentifierFactory
import org.springframework.stereotype.Service


@Service
class TeamService(identifierFactory: IdentifierFactory = IdentifierFactory()) {
    companion object {
        var teamsStorage = mutableMapOf<Identifier, Team>()
    }
    /*Implement the generateTeamsForOneRound method.
     The method must generate a list of teams and also store all of them into the teamsStorage map.
     To create new teams, you need to use identifierFactory from the TeamService class to generate a new id.
     We need to create this method to save game results for the leaderboard.

     */
    val createTeams= identifierFactory

    fun generateTeamsForOneRound(teamsNumber: Int): List<Team> {
        val listOfTeams = mutableListOf<Team>()
        var abc = createTeams.uniqueIdentifier
        for (teamId in createTeams){
            listOfTeams.add(Team(teamId))
            teamsStorage.putIfAbsent(teamId, Team(teamId))
            println(Team(teamId))
//            teamsStorage.putIfAbsent(IdentifierFactory(teamId), Team(teamId))
        }

        return listOfTeams
    }
}