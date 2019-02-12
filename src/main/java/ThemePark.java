import Attractions.Attraction;
import Interfaces.IReviewed;
import Stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(String name) {
        this.name = name;
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public String getName() {
        return name;
    }

    public int countAttractions(){
        return this.attractions.size();
    }

    public int countStalls(){
        return this.stalls.size();
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

    public ArrayList getAllReviewed(){
        ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>();

        for (Attraction attraction : this.attractions){
            if (attraction.getRating() > 0){
                reviewed.add(attraction);
            }

            for(Stall stalls : this.stalls){
                if (stalls.getRating() > 0){
                    reviewed.add(attraction);
                }
            }
        }
        return reviewed;
    }

}
