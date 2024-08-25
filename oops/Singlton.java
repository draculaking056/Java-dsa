package oops;
public  class Singlton {
    private  Singlton(){
        System.out.println(intance);
    }
    private  static  Singlton intance;

    public static Singlton getIntance(){
            if(intance==null){
                intance=new Singlton();
            }

            return  intance;
    }
}