public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Jenkins Pipeline Demo!");
    }
}


git init
git add .
git commit -m "Initial commit for Jenkins demo"
git remote add origin <your-repo-url>
git push -u origin main

git config --global user.email "your.email@example.com"
git config --global user.name "Your Name"