public class ProjectTest {
    public static void main(String[] args) {
        Project p1 = new Project();
        System.out.println(p1.elevatorPitch());
        System.out.println(p1.setName("Project"));
        System.out.println(p1.elevatorPitch());
        Project p2 = new Project("Waterproof Glasses");
        System.out.println(p2.elevatorPitch());
        System.out.println(p2.setDescription("Just cause"));
        System.out.println(p2.elevatorPitch());
        Project p3 = new Project("Kings Quest", "Best project ever");
        p3.setCost(200000.00);
        System.out.println(p3.elevatorPitch());
        Project p4 = new Project("Jesus 11s", "New Artifical Intellegence shoes that let's you walk on water", 100000.00);
        System.out.println(p4.elevatorPitch());
        System.out.println(p1.setCost(20.00));
        System.out.println(p1.elevatorPitch());

        Portfolio f1 = new Portfolio();
        f1.addProject(p1);
        f1.addProject(p2);
        System.out.println(f1.getPortfolioCost());
        f1.showPortfolio();

        Portfolio f2 = new Portfolio();
        f2.addProject(p3);
        f2.addProject(p4);
        System.out.println(f2.getPortfolioCost());
        f2.showPortfolio();
    }
}