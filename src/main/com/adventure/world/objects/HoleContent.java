package main.com.adventure.world.objects;
import main.com.adventure.world.objects.keys.Key;
import org.checkerframework.checker.units.qual.K;

public class HoleContent{

    private Key content;
    private boolean isCovered;

    public HoleContent(Key key){
        this.content = key;
        this.isCovered = true;
    }

  public void setCovered(boolean covered) {
        this.isCovered = covered;

    }

    public boolean isCovered(){
        return this.isCovered;
    }

    public Key getKey(){
      return this.content;
    }

    }




