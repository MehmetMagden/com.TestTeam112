package test01;

public class Mehmet {

    /*

    when we clone the framework we should not touch anything

    first step is creating a branch for yourself
    git branch name   // name can be your name

    after everystep we should check where we are
    git branch

    to switch new branch
    git checkout name

    to control if we are in our branch
    git branch

    if everything is right you should be able to see a star at left side of your name


     */

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    /* after changing something in your codes
    git add .
    git commit -m "v2"
    git push


****

    we want to download everybodies codes to our branch in our local computer

    before switching to another branch we need to commit
    git add .
    git commit -m "version"

    to pull master branch first we neet to switch to master branch
    git checkout master

    master has been changed by team members so we need to pull ( download) master branch from github ( remote) accout
    git pull


    ***

    now we are planing to merge every from master o our branch
    first we need to swtich to our branch again ( my branch name is mehmet so i will use mehmet, everybdoy should use their own names)
    git checkout mehmet

    to check again // there should be a star on the left side of your branch name
    git branch

// to take everything from master branch to your own branch
    git merge master







     */

}
