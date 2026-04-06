
class arithmetic {

    int a = 10;
    int b = 5;
    int add() {
    	return a+b;
    }
    int sub() {
    	return a-b;
    }
    
   
}

public class operators{
	public static void main(String[] args) {
		arithmetic obj =new arithmetic();
		System.out.println(obj.add());
		System.out.println(obj.sub());
		
	}
}

