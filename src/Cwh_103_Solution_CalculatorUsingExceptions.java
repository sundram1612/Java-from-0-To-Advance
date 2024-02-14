class InvalidInputException extends Exception{
    
    /** 
     * @return String
     */
    @Override
    public String toString(){
        return "Cannot add 8 and 9.";
    }

    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String toString(){
        return "Cannot divide by 0.";
    }

    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Input can not be greater than 100000";
    }

    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}

class MaxMultiplyByInputException extends Exception{
    @Override
    public String toString(){
        return "Input can not be greater than 7000.";
    }

    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}




class CustomCalculator{
    double add(double a, double b) throws InvalidInputException, MaxInputException{
        if(a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        if(a == 8 || b == 9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double subtract(double a, double b) throws  MaxInputException{
        if(a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a, double b) throws  MaxInputException, MaxMultiplyByInputException{
        if(a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        else if(a > 7000 || b > 7000){
            throw new MaxMultiplyByInputException();
        }
        return a*b;
    }
    double division(double a, double b) throws CannotDivideByZeroException, MaxInputException{
        if(a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        if(b == 0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}
public class Cwh_103_Solution_CalculatorUsingExceptions {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplyByInputException{
        CustomCalculator cal = new CustomCalculator();
       // cal.add(8,9);        
       // cal.division(45, 0);
     //  cal.multiply(10, 100);
       cal.division(100000,1000000);
       // 

    }
}
