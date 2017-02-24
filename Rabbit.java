public class Rabbit
{
    private String name;
    private int positionX = 0;
    private int positionY = 0;

    
//----------------------------------------------------------------------------------------------

    public Rabbit(String name, int positionX, int positionY){
     this.name = name;
     this.positionX = positionX;
     this.positionY = positionY;
    }

    public Rabbit(){

    }


    public void declarePosition(){
        System.out.println("I am a rabbit and i'm standing on square (" + currentPosition() + ")");
    }
    
    public void moveUp(){
        this.positionY = positionY+1;
           if(positionY<0||positionY>10){
            System.out.println("false move");
        }else{
        declarePosition();
        }  
    }

     public void moveDown(){
        this.positionY = positionY-1; 
        if(positionY<0||positionY>10){
            System.out.println("false move");
        }else{
        declarePosition();
        }  
    }

     public void moveLeft(){
        this.positionX = positionX-1;
           if(positionX<0||positionX>10){
            System.out.println("false move");
        }else{
        declarePosition();  
        }
    }

     public void moveRight(){
        this.positionX = positionX+1;
           if(positionX<0||positionX>10){
            System.out.println("false move");
        }else{
        declarePosition();  
        }
    }
 
     public String currentPosition(){
        return positionX + " , " + positionY;
    }
 

     public void askForMercy(){
    
        System.out.println("Please dont kill mee :'( ");
    }


        
    


    public void move()
    {
        this.positionX = positionX+1;
        this.positionY = positionY+1;
        
        if(positionX<0||positionX>10&&positionY>10||positionY<0){
            System.out.println("false move");
        }else{
        declarePosition();  
        }
    }


  /*  public void move(){

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(4)+1;


      /* 
      

        switch(go){
            case 1: 
                moveUp();
                break;
            case 2:
                moveDown();
                break;
            case 3:
                moveLeft();
                break;
            case 4:
                moveRight();
                break;
            default:
                System.out.println("somthing went wrong");
                break;



        }
        */
    }
   


