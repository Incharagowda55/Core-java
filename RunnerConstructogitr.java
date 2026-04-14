class RunnerConstructogitr {
    public static void main(String[] args) {

        Repository r = new Repository();
        r.name = "AI-Chatbot";
        r.language = "Python";
        r.stars = 500;

        GitHub git = new GitHub(r);

        git.display();
    }
}