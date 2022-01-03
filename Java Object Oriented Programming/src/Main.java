public class Main {
    public static void main(String[] args){
        Tree myFavoriteMapleTree = new Tree(120,5, TreeType.MAPLE);

        myFavoriteMapleTree.announceTallTree();

        Tree myFavoriteOakTree = new Tree(90,30, TreeType.OAK);

        myFavoriteOakTree.announceTallTree();

        // Different from our non-static because we access it by using the class name
        System.out.println(Tree.TRUNK_COLOR);
        Tree.announceTree();

        Employee employeeOne = new Employee("Mihael Brown",22, 30000,"Chicago");

        Employee employeeTwo = new Employee("Kelly Goodman", 35, 89000,"Dallas");

        employeeTwo.raiseSalary();

        System.out.println(employeeOne.salary);
        System.out.println(employeeTwo.salary);

    }
}
