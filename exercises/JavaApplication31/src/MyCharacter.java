
public class MyCharacter {
    
    private int numberOfEyes;
    private String eyeColor;
    private int numberOfLives;
    

public MyCharacter(int numberOfEyes, String eyeColor, int numberOfLives){
this.eyeColor= eyeColor;
this.numberOfEyes = numberOfEyes;
this.numberOfLives = numberOfLives;
}
public String getEyeColor(){
    return eyeColor;
}
public void eyeColor (String eyeColor){
        this.eyeColor = eyeColor;
}
public int getNumberOfEyes (){
    return numberOfEyes;
}
public void numberOfEyes (int numberOfEyes){
        this.numberOfEyes = numberOfEyes;
}

public int getNumberOfLives(){
    return numberOfLives;
}
public void numberOfLives (int numberOfLives){
        this.numberOfLives = numberOfLives;
}
}