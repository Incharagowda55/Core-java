class RunnerRefgit {
    public static void main(String[] args) {

        Repository r = new Repository();
        r.name = "Student-Management-System";
        r.language = "Java";
        r.stars = 150;

        GitHub git = new GitHub(r);

        git.display();
    }
}