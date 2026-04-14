class GitHub {

    Repository repo;

    GitHub(Repository repo) {
        this.repo = repo;
    }

    void setRepository(Repository repo) {
        this.repo = repo;
    }

    void display() {
        System.out.println("GitHub Repository Details:");

        if (repo != null) {
            System.out.println("Repository Name: " + repo.name);
            System.out.println("Language: " + repo.language);
            System.out.println("Stars: " + repo.stars);
        } else {
            System.out.println("No repository assigned");
        }
    }
}