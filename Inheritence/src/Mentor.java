public class Mentor extends User{
    public Mentor() {
//        super(0,null,null);
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public static void main(String[] args){
        Mentor m = new Mentor();
//        System.out.println(m.getId());
        m.name = "Indu";
        System.out.println(m.getName());
    }
}
