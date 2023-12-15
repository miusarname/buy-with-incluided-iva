package thing;
public class Thing {
    double weight;
    String formOrDescription;
    String colors[];

    public Thing (double Weight,String Form,String Colors){
        this.weight = Weight;
        this.formOrDescription = Form;
        this.colors = new String[]{Colors};
    }
}
