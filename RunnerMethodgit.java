class RunnerMethodgit {
    public static void main(String[] args) {

        Repository r = new Repository();
        r.name = "E-Commerce-App";
        r.language = "JavaScript";
        r.stars = 300;

        GitHub git = new GitHub(null);

        git.setRepository(r);

        git.display();
    }
}