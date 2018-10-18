/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variableenought;

public class VariableLengthArgumentList {
    
    public VariableLengthArgumentList(){
    
    }
  
    public int calculateProduct(int...passedValue){
    int product=1;
    
    for(int i:passedValue){
    product*=i;
    }
    return product;
    }
}