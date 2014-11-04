package boletin72;

public class Metodo {
    
    private short num1, num2;
    
    public Metodo(){
        
    }
    
    public void setNumero(short v1, short v2){
        
        num1=v1;
        num2=v2;
        
    }
    
    public short getNumero1(){
        return num1;
    }
    public short getNumero2(){
        return num2;
    }
    
    public void Condicional(){
        if (num1<num2){
            System.out.println("suma= "+ (num1+num2));
        }
        else if(num1>=num2){
            System.out.println("suma= "+(num1+num2));
            System.out.println("resta= "+(num1-num2));
    }
        
    
    }
}
