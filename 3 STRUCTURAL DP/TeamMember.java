// COMPOSITE DP

// TODO: Define the TeamMember interface with a method to show member details
// The method should be named showMemberDetails and should not take any parameters or return any value.

// TODO: Implement the Analyst class that provides a base implementation of the TeamMember interface

// TODO: Declare private variables for memberId (long), name (String), and role (String).

// TODO: Implement a constructor to initialize these variables.

// TODO: Override the showMemberDetails method to print the memberId, name, and role.

// TODO: Implement the TeamLead class that provides a base implementation of the TeamMember interface

// TODO: Declare private variables for memberId (long), name (String), and role (String).

// TODO: Implement a constructor to initialize these variables.

// TODO: Override the showMemberDetails method to print the memberId, name, and role.import java.util.ArrayList;

// TODO: Implement the ProjectTeam class that implements the TeamMember interface and can contain multiple TeamMember objects

// TODO: Declare private variables for teamName (String) and a List of TeamMember objects.

// TODO: Implement a constructor to initialize the teamName and instantiate the list of TeamMember objects.

// TODO: Override the showMemberDetails method to print the team name and iterate over the list of team members, calling their showMemberDetails method.

// TODO: Add methods to add and remove TeamMember instances in/from the list.public class Main

// TODO: Create Analyst instances (e.g., analyst1 and analyst2) with appropriate memberId, name, and role.
// TODO: Create a TeamLead instance (e.g., lead1) with appropriate memberId, name, and role.
// TODO: Create a ProjectTeam instance (e.g., projectTeam) with a team name.
// TODO: Add the Analyst and TeamLead instances to the ProjectTeam instance.
// TODO: Call the showMemberDetails method on the ProjectTeam instance to display the details of the project team.

import java.util.ArrayList;
import java.util.List;

public interface TeamMember {
    void showMemberDetails();

    public static void main(String[] args) {

        Analyst analyst1 = new Analyst(101, "Alice", "Data Analyst");
        Analyst analyst2 = new Analyst(102, "Bob", "Business Analyst");

        TeamLead lead1 = new TeamLead(201, "Charlie", "Team Lead");

        ProjectTeam projectTeam = new ProjectTeam("AI Development Team");

        projectTeam.addMember(analyst1);
        projectTeam.addMember(analyst2);
        projectTeam.addMember(lead1);

        projectTeam.showMemberDetails();
    }
}

class Analyst implements TeamMember {
    private long memberId;
    private String name;
    private String role;

    public Analyst(long memberId, String name, String role) {
        this.memberId = memberId;
        this.name = name;
        this.role = role;
    }

    @Override
    public void showMemberDetails() {
        System.out.println(memberId + " " + name + " " + role);
    }
}

class TeamLead implements TeamMember {
    private long memberId;
    private String name;
    private String role;

    public TeamLead(long memberId, String name, String role) {
        this.memberId = memberId;
        this.name = name;
        this.role = role;
    }

    @Override
    public void showMemberDetails() {
        System.out.println(memberId + " " + name + " " + role);
    }
}

class ProjectTeam implements TeamMember {
    private String teamName;
    private List<TeamMember> teamList;

    public ProjectTeam(String teamName) {
        this.teamName = teamName;
        this.teamList = new ArrayList<>();
    }

    @Override
    public void showMemberDetails() {
        System.out.println("Project Team: " + teamName);
        for (TeamMember member : teamList) {
            member.showMemberDetails();
        }
    }

    public void addMember(TeamMember member) {
        teamList.add(member);
    }

    public void removeMember(TeamMember member) {
        teamList.remove(member);
    }
}