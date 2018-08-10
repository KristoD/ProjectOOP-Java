class Project {
    public String name;
    public String description;
    public double initialCost;
    public Project() {
        this.name = "";
        this.description = "";
        this.initialCost = 0;
    }
    
    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description)  {
        this.name = name;
        this.description = description;
    }

    public Project(String name, String description, Double cost) {
        this.name = name;
        this.description = description;
        this.initialCost = cost;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        this.name = name;
        return "Project name changed to: " + this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String setDescription(String description) {
        this.description = description;
        return "Project description changed to: " + this.description;
    }

    public Double getCost() {
        return this.initialCost;
    }

    public String setCost(double cost) {
        this.initialCost = cost;
        return "Project cost changed to: " + Double.toString(this.initialCost);
    }

    public String elevatorPitch() {
        if(this.initialCost == 0) {
            return this.name + " : " + this.description;
        } else {
            return this.name + " (" + Double.toString(this.initialCost) + ") : " + this.description;
        }
    }
}