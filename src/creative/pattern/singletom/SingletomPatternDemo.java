package creative.pattern.singletom;

public class SingletomPatternDemo {
    public static void main(String[] args){
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }

}
