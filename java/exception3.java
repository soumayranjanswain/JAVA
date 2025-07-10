class MyException extends Exception{
    MyException(String msg){
        super(msg);//calling to super constructor
    }

}
MyException me=new MyException("this is my Exception....");
throw me: