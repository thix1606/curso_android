package Initial;

public class Tripod {
    private boolean folded;
    private int minHeight;
    private int maxHeight;
    private int currentHeight;

    public Tripod(){
    }

    public Tripod(boolean folded, int minHeight, int maxHeight){
        this.folded = folded;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public void setHeight(int newHeight){
        this.currentHeight = newHeight;
        System.out.println("Initial.Tripod height: " + this.currentHeight);
    }

    public void fold(){
        this.folded = true;
        System.out.println("Initial.Tripod folded");
    }

    public void unFold(){
        this.folded = false;
        System.out.println("Initial.Tripod unfolded");
    }

    public void store(){
        this.setHeight(this.minHeight);
        this.fold();
    }

    public boolean isReadyToStore(){
        if(this.currentHeight == this.minHeight && this.folded){
            System.out.println("Initial.Tripod is ready to store");
            return  true;
        }else{
            System.out.println("Initial.Tripod is not ready to store");
            return false;
        }
    }

    public void use(){
        this.unFold();
        this.setHeight(this.maxHeight/2);
    }

    public boolean isReadyToUse(){
        if(this.currentHeight >= (this.maxHeight/2) && this.folded == false){
            System.out.println("Initial.Tripod is ready to use");
            return  true;
        }else{
            System.out.println("Initial.Tripod is not ready to use");
            return false;
        }
    }
}
