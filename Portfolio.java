import java.util.ArrayList;

class Portfolio {
    public ArrayList<Project> projects = new ArrayList<Project>();
    public Portfolio() {

    }

    public String getPortfolioCost() {
        Double totalCost = 0.00;
        for(int i = 0; i < this.projects.size(); i++) {
            totalCost += this.projects.get(i).initialCost;
        }
        return "Total cost of Portfolio: " + Double.toString(totalCost);
    }

    public void showPortfolio() {
        Double totalCost = 0.00;
        for(int i = 0; i < this.projects.size(); i++) {
            System.out.println(this.projects.get(i).elevatorPitch());
            totalCost += this.projects.get(i).initialCost;
        }
    }

    public void addProject(Project project) {
        if(project instanceof Project) {
            this.projects.add(project);
            System.out.println("Added Project: " + project.name);
        } else {
            System.out.println("Not an instance of Project");
        }
    }
}