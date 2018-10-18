
public class BloodData {
    
    private String bloodType;
    private String rhFactor;
    
    public BloodData (){
        bloodType = "O";
        rhFactor = "+";
        
    }
    
    public BloodData (String type, String factor){
        bloodType = type;
        rhFactor = factor;
    }
    public void setBloodType (String type){
        this.bloodType = type;
    }
    public void setRhFactor (String factor){
        this.rhFactor = factor;
    }
    public String getBloodType (){
        return bloodType;
    }
    public String getRhFactor () {
        return rhFactor;
    }
    /*@Override
    public String toString (){
        return "BloodData"*/
    }

